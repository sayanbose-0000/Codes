public class Main{
	public static void main(String[] args){
		/*
		Car and Bicycle class inherits all the attributes of vehicle class
		Vehicle => parent class
		Car,bicycle => child class
		*/

		Car car=new Car();

		car.go();	//though this go method is of Vehicle class, Car class can access it too because it has been inherited

		Bicycle bicycle=new Bicycle();
		bicycle.stop();
	}

}