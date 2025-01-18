// Create a class, make method inside it and pass object as parameter of this method. (a) pass same class’s object, (b) pass different
// class’s object

class DifferentClass {}

class ObjectAsReturn {
  Object show(Object a) {
    return a;
  }

  public static void main(String[] args) {
    ObjectAsReturn oap = new ObjectAsReturn();
    DifferentClass dc = new DifferentClass();

    System.out.println(oap.show(oap));
    System.out.println(oap.show(dc));
  }
}