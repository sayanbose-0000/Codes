public class Main{
	public static void main (String[] args){

		Food food1=new Food("Rice");
		Food food2=new Food("Paranthas");
		Food food3=new Food("Loochi");

		//Creating array of objects
		Food[] fridge={food1,food2,food3};

		System.out.println(fridge[0].name);
		System.out.println(fridge[1].name);
		System.out.println(fridge[2].name);
	}
}