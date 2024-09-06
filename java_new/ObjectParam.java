// 6a) create a class, make a methos inside it, pass same class's object as a parameter to this method

class ObjectParam {
  public static void main (String[] args) {
    AdderClass num1 = new AdderClass(Integer.parseInt(args[0]));
    AdderClass num2 = new AdderClass(Integer.parseInt(args[1]));

    num1.add(num2);
  }
}

class AdderClass {
  int var;

  AdderClass (int var) {
    this.var = var;
  }

  void add(AdderClass obj) {
    System.out.println("The sum of " + this.var + " and " + obj.var + " is: " + (this.var + obj.var));
  }
}