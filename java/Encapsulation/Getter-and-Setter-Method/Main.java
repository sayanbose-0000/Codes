public class Main{
	public static void main(String[] args){

		/*
		We can create an object of the Car class using the private variables,
		but, we cannot access it.
		*/
		Car car=new Car("Chevrolet","Camero",2021);

		//	"System.out.println(car.make);"	  ->cannot be accessed



		
		//we use getter method to access private variable
		System.out.println(car.getMake());


		//we use setter method to edit values inside private variable
		car.setYear(2030);


		//using getter to print it again
		System.out.println(car.getYear());
	}
}