package com.example.loose_coupling;

public class WebServiceProvider implements UserProvider {
  @Override
  public String getUserDetails() {
    return "User data using loose coupling (web service)";
  }
}
