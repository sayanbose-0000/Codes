import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);

		try{
			
			System.out.print("Enter a whole number that is the to be divided: ");
			int x=scanner.nextInt();

			System.out.print("Enter a number to divide by: ");
			int y=scanner.nextInt();
		
			int z=x/y;
			System.out.println("Result is "+z);
		}


		catch(ArithmeticException e){ //we can also write "catch(Exception e)", no need to mention exception type
			System.out.println(e);
			System.out.println("You can't divide by zero!"); 
		}
		
		catch(InputMismatchException e){	//we need to import InputMismatch Exception
			System.out.println(e);
			System.out.println("Please enter a number!");
		}


		catch (Exception e){
			System.out.println(e);
		}

		finally{//this will execute whether exception is there or not
			System.out.println("This will always print");
			scanner.close();//it's a good practice to close scanners in finally block
		}

		}
	
}