class FirstClass {
  int x = 10;
  void show() {
    System.out.println("Showing");
  }

  public static void main(String[] args) {
    FirstClass f = new FirstClass();

    System.out.println(f.x);
    f.show();
  }
}