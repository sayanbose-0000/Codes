// Create a class EMP having instance variable name and id. Create its subclass (say Scientist) which has instance variable
// no_of_publication and experience. Now create its subclass, say Dscientist which has instance variable award. Put a method: pub-
// lic String toString () { } in every class where you describe about the class and from main create object of each class and print
// each object.

class EMP {
  String name;
  int id;

  @Override
  public String toString() {
    return "This is the EMP class";
  }
}

class Scientist extends EMP {
  int no_of_publication;
  int experience;
  
  @Override
  public String toString() {
    return "This is the Scientist class";
  }
}

class Dscientist extends Scientist {
  int awards;

  @Override
  public String toString() {
    return "This is the Dscientist class";
  }
}

class EmpMainDynamic {
  public static void main(String[] args) {
    EMP e = new EMP();
    EMP s = new Scientist();
    EMP ds = new Dscientist();

    System.out.println(e);
    System.out.println(s);
    System.out.println(ds);
  }
}