public class Main{
	public static void main(String[] args){
		Car car1=new Car("Chevrolet","Camero",2021);
		Car car2=new Car("Ford","Mustang",2022);

		//"car2=car1" won't do, car1 and car2 will point to the same object and not copy it

		car2.copy(car1);

		//also we can do like:
		Car car3=new Car(car1);	//we need to copy the car
		//so we create new obj like this and add respective constructor


		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
	}
}