import java.util.Scanner;

public class MethodsInJava{
	public static void main (String[] args){
		System.out.print("Enter your name: ");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.print("Enter your age: ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter your hobby: ");
		String hobby=sc.nextLine();
		System.out.print("Enter your class: ");
		String classYou=sc.nextLine();
		System.out.println();
		passion(name,age,hobby,classYou);
		System.out.println();


		System.out.println("Enter x and y: ");
		int x=sc.nextInt();
		int y=sc.nextInt();

		int z=add(x,y);
		System.out.println("The sum is "+z);

		sc.close();
	}

	static void passion(String yourName, int yourAge,String yourHobby,String yourClass){
		System.out.println("Hello!");
		System.out.println("Your name is: "+yourName);
		System.out.println("Your age is: "+yourAge);
		System.out.println("Your Hobby is: "+yourHobby);
		System.out.println("Your class is: "+yourClass);
	}

	static int add(int x,int y){
		return x+y;
	}
}