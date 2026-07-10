package com.example.loose_coupling;

public class UserDatabase implements UserProvider {

  @Override
  public String getUserDetails() {
    return "User data using loose coupling(database)";
  }
}
