// Does jwt operations

package com.app.trimlink.security.jwt;

import java.security.Key;
import java.util.Date;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Value;
import com.app.trimlink.services.UserDetailsImpl;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.http.HttpServletRequest;

public class JwtUtils {
  @Value("${java.secret}")
  private String jwtSecret;
  @Value("${java.expiration}")
  private int jwtExpirationMS;

  public String getJwtFromHeader(HttpServletRequest request) {
    // Authroization token looks like this: Authorization: Bearer <token>

    String bearerToken = request.getHeader("Authorization");
    if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
      return bearerToken.substring(7); // This removes the "Bearer " part (the space is removed too)
    }
    return null;
  }

  public String generateJwtToken(UserDetailsImpl userDetails) {
    String username = userDetails.getUsername();
    String roles = userDetails.getAuthorities()
        .stream()
        .map(authority -> authority.getAuthority())
        .collect(Collectors.joining(","));

    return Jwts
        .builder()
        .setSubject(username)
        .claim("roles", roles)
        .setIssuedAt(new Date())
        .setExpiration(new Date(new Date().getTime() + jwtExpirationMS))
        .signWith(key())
        .compact();
  }

  private Key key() {
    return Keys.hmacShaKeyFor(Decoders.BASE64.decode(jwtSecret));
  }

  public String getUserNameFromJwtToken(String token) {
    return Jwts.parserBuilder()
        .setSigningKey(key())
        .build()
        .parseClaimsJws(token)
        .getBody()
        .getSubject();
  }

  public boolean validateToken(String authToken) {
    try {
      Jwts
          .parserBuilder()
          .setSigningKey(key())
          .build()
          .parseClaimsJws(authToken);
      return true;
    }

    catch (Exception e) {
      return false;
    }
  }
}
