// The Iterator pattern is a behavioral design pattern that provides a standard way to traverse elements
// of a collection sequentially without exposing its internal structure.

// Its a pull based system where the consumer requests data from the producer when it needs it

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {

  public static void main(String[] args) {
    ArrayList<Number> arrayList = new ArrayList<>(
      List.of(7, 9, 6, 51, 5, 8, 9, 63, 8)
    );

    Iterator<Number> it = arrayList.iterator();

    while (it.hasNext()) {
      System.out.print(it.next() + " - ");
    }
  }
}
