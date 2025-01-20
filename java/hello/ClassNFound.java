class ClassNFound {
  public static void main(String[] args) {

    try {
      String s = "abc";
      int n = Integer.parseInt(s);
    }

    catch(NumberFormatException e) {
      System.out.println(e);
    }
  }
}