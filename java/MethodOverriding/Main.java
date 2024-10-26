/*
Animal class(parent class)'s speak method has been inherited by Dog class(child class). So, when we 
normally call speak(), "This animal is speaking" gets printed. However, when we Override speak() in 
Dog class, and call using Dog class's object, "dog.speak()", it prints "Bark!" instead. Though, 
animal.speak() still prints "This animal is speaking"
*/

public class Main{
	public static void main(String[] args){
		//Here, inspite of inheriting Animal class's speak method, we override it as desired in Dog class

		Dog dog=new Dog();
		Animal animal=new Animal();

		dog.speak();	//this "speak()"" is Overridden "speak(), of Dog class

		animal.speak();	//this "speak()" is Animal class's "speak()"

	}
}