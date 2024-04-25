// Assume that a bank maintains two types of account for its customers, one called a savings account and other
// called a current account. The savings account provides compound interest and withdrawal facilities but no cheque
// book facility. The current account provides a check book facility but no interest. Current account holders should
// also maintain a minimum balance (say Rs. 1000) and if the balance falls below this level a service charge is
// imposed (say Rs. 100).
// Create a class Account that stores customer name, account number and type of account. From this class
// derive two classes Curr_Acct and Savn_Acct respectively to make them more specific to their requirements.

// Include the necessary methods to achieve the following tasks:
// a. Accept deposits from a customer and update the balance.
// b. Display the balance.
// c. Compute and deposit interest.
// d. Permit withdrawal and update the balance.
// e. Check for minimum balance, impose penalty, if necessary, and
// update the balance. Use constructors to initialize the class members.

abstract class Account {
  String customerName;
  long accountNumber;
  String accountType;
  int balance = 0;
  int minBalance = 0;

  Account(String customerName, long accountNumber, String accountType, int minBalance) {
    this.customerName = customerName;
    this.accountNumber = accountNumber;
    this.accountType = accountType;
    this.minBalance = minBalance;
  }

  void deposit(int amount) {
    if (balance > minBalance) {
      balance += amount;
      System.out.println("Balance: " + balance);
    } else { // balance less than min balance
      balance += amount;
      if (balance < minBalance) {
        balance -= 100;
        System.out.println("Rs. 100 deducted for having balance less than minumum");
      }
      System.out.println("Balance: " + balance);
    }
  }

  void withdrawal(int amount) {
    if (minBalance == 0) {
      balance -= amount;
      System.out.println("Balance: " + balance);
    } else { // min balance == 1000
      if (balance > minBalance) {
        balance -= amount;
      } else {
        balance -= amount;
        System.out.println("Balance: " + balance
            + ". Your current balance is lower then min Balance. Rs. 100 will be deducted in next deposit");
      }
    }
  }
}

class Curr_Acct extends Account {
  int minBalance = 1000;

  Curr_Acct(String customerName, long accountNumber, String accountType) {
    super(customerName, accountNumber, accountType, 1000); // since minBalance is 1000
  }
}

class Savn_Acct extends Account {
  int minBalance = 0;

  Savn_Acct(String customerName, long accountNumber, String accountType) {
    super(customerName, accountNumber, accountType, 0); // since minBalance is 1000
  }
}

class Main {
  public static void main(String[] args) {
    Curr_Acct person1 = new Curr_Acct("Ram", 1225235523, "current");
    Savn_Acct person2 = new Savn_Acct("Rahul", 322534523, "savings");

    person1.deposit(10000);
    person1.withdrawal(100);

    System.out.println();

    person2.deposit(1000); // curr acc
    person2.withdrawal(10); // sav acc
  }
}