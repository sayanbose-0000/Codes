import java.util.Scanner;

class AgeRestrictedException extends Exception {
  AgeRestrictedException(String s) {
    super(s);
  }
}

class ThrowMain {
  // TWO WAYS OF DOING IT!!!!!!!!!!!!!!!!!!!!!!!!!!!


  // FIRST METHOD
  public static void main(String[] args) throws AgeRestrictedException {
    Scanner sc = new Scanner(System.in);

    int age = sc.nextInt();

    if (age < 18) {
      throw new AgeRestrictedException("Ja porte bosh!!");
    }

    else {
      System.out.println("Nao dekho, kintu sabdhan e");
    }
  }

  // SECOND METHOD
  
  // public static void main(String[] args) {
  //   Scanner sc = new Scanner(System.in);

  //   int age = sc.nextInt();

  //   try {
  //     if (age < 18) {
  //       throw new AgeRestrictedException("Ja porte bosh!!");
  //     }

  //     else {
  //       System.out.println("Nao dekho, kintu sabdhan e");
  //     }
  //   }

  //   catch (AgeRestrictedException are) {
  //     System.out.println(are);
  //   }
  // }
}