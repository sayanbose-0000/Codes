import java.util.Scanner;

class PayLessException extends Exception {
    PayLessException(String str) {
        super(str);
    }
}

class Check {
    void checking() throws PayLessException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if (a < 100) throw new PayLessException("Value is too low");
    }
}

public class PayLess {
    public static void main(String[] args) {
        Check c = new Check();
        try {
            c.checking();
        } catch (PayLessException pp) {
            System.out.println(pp.getMessage());
        }
    }
}
