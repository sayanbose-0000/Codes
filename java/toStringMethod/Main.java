public class Main{
	public static void main (String[] args){
		Cars car=new Cars();

		/*Normally, toString() returns address of object. ie, if we wrote 
		"System.out.println(cars)" or "System.out.println(cars.toString())", we would get the
		address of car object. However, as we have overridden the toString() method, we are now
		getting output as we wish.

		Now, both "System.out.println(cars)" and "System.out.println(cars.toString())" return the
		outputs of out choice
		*/

		System.out.println(car.toString());
		System.out.println(car);
	}


}