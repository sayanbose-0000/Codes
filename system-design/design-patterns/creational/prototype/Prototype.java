// Creates new obj by cloning an existing instance, rather than creating from scratch

// Cloneable marker interface is checked by Object.clone(). If not present, it throws CloneNotSupportedException
class PrototypeImpl implements Cloneable {

  private String name;

  public PrototypeImpl(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override // clone comes from Object class
  protected Object clone() throws CloneNotSupportedException {
    return super.clone(); // Here, Object.clone() is called and it creates a copy of the prv obj
  }
}

public class Prototype {

  public static void main(String[] args) throws CloneNotSupportedException {
    PrototypeImpl p1 = new PrototypeImpl("John Doe");
    System.out.println(p1.getName());
    System.out.println(p1);

    PrototypeImpl p2 = (PrototypeImpl) p1.clone();
    System.out.println(p2.getName());
    System.out.println(p2);
  }
}
