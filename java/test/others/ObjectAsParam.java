// Create a class, make method inside it and pass object as parameter of this method. (a) pass same class’s object, (b) pass different
// class’s object

class DifferentClass {}

class ObjectAsParam {
  void show(Object a) {
    System.out.println(a);
  }

  public static void main(String[] args) {
    ObjectAsParam oap = new ObjectAsParam();
    DifferentClass dc = new DifferentClass();

    oap.show(oap);
    oap.show(dc);
  }
}