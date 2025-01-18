// Design a class to represent a Bank Account with the following:

// Fields:
// Name of the depositor
// Account number
// Type of account
// Balance amount in the account

// Methods:
// To assign initial values
// To deposit an amount
// To withdraw an amount after checking balance
// To display the name and balance

import java.util.Scanner;

class BankHelper {
  String name;
  long accountNumber;
  String accountType;
  double balance;

  void createAccount(String name, long accountNumber, String accountType, double balance) {
    this.name = name;
    this.accountNumber = accountNumber;
    this.accountType = accountType;
    this.balance = balance;

    System.out.println(name + " created an account, with acc no: " + accountNumber + " with account type " + accountType + " and balance " + balance);
  }

  void deposit(double rs) {
    balance += rs;

    System.out.println("Balance is: " + balance);
  }

  void withdraw(double rs) {
    if (rs > balance) {
      System.out.println("Balance is: " + balance + ", can't withdraw");
      return;
    }

    balance -= rs;
    System.out.println("Balance is: " + balance);
  }

  void displayAcc() {
    System.out.println(name + " has an account, with acc no: " + accountNumber + ", with account type " + accountType + ", and balance " + balance);
  }
}

class BankAccount {
  public static void main(String[] args) {
    BankHelper bh = new BankHelper();
    
    System.out.println("1- create acc, 2- deposit, 3- withdraw, 4- display");

    Scanner sc = new Scanner(System.in);

    while(true) {
      System.out.print("Enter choice: ");
      int choice = sc.nextInt();
      sc.nextLine();

      switch (choice) {
        case 1: 
          System.out.print("Enter name: ");
          String name = sc.nextLine();

          System.out.print("Enter type: ");
          String type = sc.nextLine();
          
          bh.createAccount(name, ((long) Math.random() * 90000 + 10000) , type, 0);
          break;

        case 2:
          System.out.print("Enter amnt: ");
          double rs = sc.nextDouble();
          bh.deposit(rs);
          break;

        case 3: 
          System.out.print("Enter amnt: ");
          double rs1 = sc.nextDouble();
          bh.withdraw(rs1);
          break;

        case 4: 
          bh.displayAcc();
          break;

        default:
          System.out.println("Wrong choice");
          break;
      }
    }
  }
}