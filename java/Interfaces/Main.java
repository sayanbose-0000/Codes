public class Main{
	public static void main (String[] args){
		/*
		a template that can be applied to a class. Somewhat similar to inheritance, Classes can apply
		more than one interface, but inheritance is limited only to 1 super class
		*/

		Rabbit rabbit=new Rabbit();	
		rabbit.flee();//->rabbit implements only Predator interface, so, it can access only flee
						// and not hunt

		Hawk hawk=new Hawk();
		hawk.hunt();//->hawk inplements only Prey interface, so it can access only hunt
					//and not flee

		Fish fish=new Fish();
		fish.flee();//-> fish implements both Prey and Predator, so it can access both interfaces
		fish.hunt();


	}
}