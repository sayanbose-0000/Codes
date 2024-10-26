// 6a) create a class, make a methos inside it, pass another class's object as a parameter to this method

class AnotherObjParam {
  public static void main(String[] args) {
    ValueClass obj1 = new ValueClass(Integer.parseInt(args[0]));
    ValueClass obj2 = new ValueClass(Integer.parseInt(args[1]));

    AdderClass adder = new AdderClass();

    adder.add(obj1, obj2);
  }
}

class AdderClass {
  void add(ValueClass obj1, ValueClass obj2) {
    System.out.println("The sum of " + obj1.val + " and " + obj2.val + " is: " + (obj1.val + obj2.val));
  }
}

class ValueClass {
  int val;

  ValueClass(int val) {
    this.val = val;
  }
}