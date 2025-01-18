class ImmutableString {
  public static void main(String[] args) {
    String s = "Hello";
    System.out.println(s.hashCode());

    s += " World";
    System.out.println(s.hashCode());

    StringBuffer sb = new StringBuffer("Hi");
    System.out.println(sb.hashCode());

    sb.append(" Meowtians");
    System.out.println(sb.hashCode());
  }
}