// A method instantiates object rather than constructor
// This allows subclass to alter the type of obj being created easily

class Computer {

  void display() {
    System.out.println("Computer");
  }
}

class Desktop extends Computer {

  @Override
  void display() {
    System.out.println("Desktop");
  }
}

class Laptop extends Computer {

  @Override
  void display() {
    System.out.println("Laptop");
  }
}

class ComputerFactory {

  public static Computer makeComputer(String type) {
    if (type.equalsIgnoreCase("desktop")) {
      return new Desktop();
    }

    if (type.equalsIgnoreCase("laptop")) {
      return new Laptop();
    }

    return null;
  }
}

public class Factory {

  public static void main(String[] args) {
    Computer d = ComputerFactory.makeComputer("Desktop");
    d.display();

    Computer l = ComputerFactory.makeComputer("Laptop");
    l.display();
  }
}
