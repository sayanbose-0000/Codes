class MethodOverloadReturn {
  void add(int a, int b) {
    System.out.println(a+b);
  }

  void add(int a, int b, int c) {
    System.out.println(a+b);
  }

  int add(int a, int b, int c, int d) {
    return a+b+c;
  }

  public static void main(String[] args) {
    MethodOverloadReturn mor = new MethodOverloadReturn();

    mor.add(1, 2);
    mor.add(1, 2, 3);

    System.out.println(mor.add(1, 2, 3, 4));
  }
}