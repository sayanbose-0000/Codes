// Show that the String object is immutable but StringBuffer type object is mutable.

class StringImmut {
  public static void main (String[] args) {
    String s = "cat";
    s.concat("dog");

    System.out.println("s is: " + s);

    StringBuffer sb = new StringBuffer("rain");
    sb.append("snow");
    System.out.println("sb is: " + sb);
  }
}