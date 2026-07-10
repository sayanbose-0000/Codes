package com.example.loose_coupling;

public class UserManager {
  // private UserDatabase userDatabase = new UserDatabase();
  private UserProvider userDatabaseProvider;

  public UserManager(UserProvider userDatabaseProvider) {
    this.userDatabaseProvider = userDatabaseProvider;
  }

  String getUserInfo() {
    return userDatabaseProvider.getUserDetails();
  }
}
