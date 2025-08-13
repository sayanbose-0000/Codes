// Can be instantiated only once

class SingletonImpl {

  private static SingletonImpl instance;

  private SingletonImpl() {
    // Private constructor to prevent instantiation elsewhere
  }

  // Static so that we don't need to create obj
  public static SingletonImpl getInstance() {
    if (instance == null) {
      // Create an instance only if its null, so created only once
      instance = new SingletonImpl();
    }
    return instance;
  }
}

public class Singleton {

  public static void main(String[] args) {
    // Uses the same instance everytime
    System.out.println(SingletonImpl.getInstance());
    System.out.println(SingletonImpl.getInstance());
    System.out.println(SingletonImpl.getInstance());
    System.out.println(SingletonImpl.getInstance());
    System.out.println(SingletonImpl.getInstance());
  }
}
