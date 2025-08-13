// We hide complex sub systems by giving a simplified interface

class BoilWater {
  void boilWater() {
    System.out.println("Boiling water...");
  }
}

class AddTeaLeaves {
  void addTeaLeaves() {
    System.out.println("Adding tea leaves");
  }
}

class AddMilk {
  void addMilk() {
    System.out.println("Adding milk...");
  }
}

class AddSugar {
  void addSugar() {
    System.out.println("Adding sugar...");
  }
}

class Brew {
  void brewing() {
    System.out.println("Brewing tea...");
  }
}

class Serve {
  void serve() {
    System.out.println("Serving tea...");
  }
}

// Tea here is a facade, hiding all the details of the process of making tea
class Tea {
  private BoilWater boilWater;
  private AddTeaLeaves addTeaLeaves;
  private AddMilk addMilk;
  private AddSugar addSugar;
  private Brew brew;
  private Serve serve;

  Tea() {
    boilWater = new BoilWater();
    addTeaLeaves = new AddTeaLeaves();
    addMilk = new AddMilk();
    addSugar = new AddSugar();
    brew = new Brew();
    serve = new Serve();
  }

  void make() {
    boilWater.boilWater();
    addTeaLeaves.addTeaLeaves();
    addMilk.addMilk();
    addSugar.addSugar();
    brew.brewing();
    serve.serve();
  }
}

public class Facade {

  public static void main(String[] args) {
    Tea t = new Tea();
    t.make();
  }
}
