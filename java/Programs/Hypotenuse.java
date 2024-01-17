//basic calculator in JAVA

import java.util.*;

public class Hypotenuse{
	public static void main(String[] args){
		System.out.println("Perpendicular=a, Base=b, Hypotenuse=c");
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a: ");
		double a=sc.nextDouble();

		System.out.print("Enter b: ");
		double b=sc.nextDouble();

		sc.close();
		
		double c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
		System.out.println("Hypotenuse is of length: "+c);
		
	}
}
