// Its a way to replace a target object with a proxy/substitute object

interface Computer {
  void loggingIn();
}

// The real Login method, NOT a proxy
class RealComputerLogin implements Computer {

  @Override
  public void loggingIn() {
    System.out.println("Signed in to the computer...");
  }
}

// ComputerLogin acts as a proxy is used to check if user is credible before logging in
class ComputerLogin implements Computer {

  RealComputerLogin realComputerLogin;
  String password;

  ComputerLogin(String password) {
    realComputerLogin = new RealComputerLogin();
    this.password = password;
  }

  @Override
  public void loggingIn() {
    if (password.equals("1234")) {
      System.out.println("Password correct!");
      realComputerLogin.loggingIn();
      return;
    }

    System.out.println("Error logging in!");
  }
}

public class Proxy {

  public static void main(String[] args) {
    Computer c = new ComputerLogin("1234"); // Opens if password matches
    c.loggingIn();
  }
}
