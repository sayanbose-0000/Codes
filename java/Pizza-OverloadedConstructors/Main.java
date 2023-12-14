//overloaded constructors

public class Main{
	public static void main(String[] args){
		Pizza Hawaiian  = new Pizza("Hawaiian","thick crust","tomato","mozzeralla","pepperoni");

		System.out.println("Here are the ingedients of your "+Hawaiian.name+" pizza:");
		System.out.println(Hawaiian .bread);
		System.out.println(Hawaiian .sauce);
		System.out.println(Hawaiian .cheese);
		System.out.println(Hawaiian .topping);
	}
}