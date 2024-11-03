import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		//dynamic means that it is during runtime
		//Eg:- A "corvetter" is a car, and also a vehicle, and also an object

		Scanner scanner=new Scanner(System.in);
		System.out.println("What animal do you want");
		System.out.println("1=dog,2=cat");

		Animal animal;//we dont declare if it is a dog or cat yet, we take it from user

		int choice=scanner.nextInt();
		if (choice==1){
			animal=new Dog();
			animal.speak();
		}

		else if(choice==2){
			animal=new Cat();
			animal.speak();
		}

		else{
			animal=new Animal();
			System.out.println("Invalid choice");
			animal.speak();
		}


	}
}