public class Main{
	public static void main (String[] args){
		//polymorphism means the ability of an object to identify more than one type

		Car car=new Car();
		Bicycle bicycle=new Bicycle();
		Boat boat=new Boat();

		Vehicle[] racers={car,bicycle,boat};//example of polymorphism. We can store all of them in vehicles

		car.go();		//	--|
		bicycle.go();	//	--|--printing without using polymorphism
		boat.go();		//	--|


		System.out.println();

		

		//using polymorphism
		for(Vehicle i:racers){
			i.go();	//
		}
	}
}