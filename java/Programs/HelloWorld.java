//first java program-Hello World

import java.util.*;

public class HelloWorld{
	public static void main (String[] args){
		System.out.println("Hello World");
		System.out.print("Enter value of x: ");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("Entered number is: "+x);
	}
}