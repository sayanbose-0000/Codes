// This class is a simple DTO(Data Transfer Object) that holds a JWT token as a response object

package com.app.trimlink.security.jwt;

import lombok.Data;

@Data
public class JwtAuthenticationResponse {
  private String token;
}
