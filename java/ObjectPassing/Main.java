public class Main{
	public static void main(String[] args){

		Car car1=new Car("BMW");
		Car car2=new Car("Ferrari");
		Car car3=new Car("Mercedes");
		Car car4=new Car("Porshe");
		Car car5=new Car("Audi");

		Garage garage1=new Garage();

		garage1.park(car1);

	}
}