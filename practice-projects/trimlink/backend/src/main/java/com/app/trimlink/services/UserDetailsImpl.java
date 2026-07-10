// Spring Security has a default UserDetails, but we custom implement it with our own logic in this file

package com.app.trimlink.services;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.app.trimlink.models.User;

import lombok.Data;

@Data
public class UserDetailsImpl implements UserDetails {
  private Long id;
  private String username;
  private String email;
  private String password;
  Collection<? extends GrantedAuthority> authorities;

  public UserDetailsImpl(Long id,
      String username,
      String email,
      String password,
      Collection<? extends GrantedAuthority> authorities) {
    this.id = id;
    this.username = username;
    this.email = email;
    this.password = password;
    this.authorities = authorities;
  }

  public static UserDetailsImpl buildUser(User user) {
    return new UserDetailsImpl(user.getId(),
        user.getUsername(),
        user.getEmail(),
        user.getPassword(),
        Collections.singletonList(new SimpleGrantedAuthority(user.getRole())));
  }

  @Override
  public String getUsername() {
    return username;
  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return authorities;
  }
}
