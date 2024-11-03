import java.util.ArrayList;

public class TwoDArrayList{
	public static void main (String[] args){
		//backery items to be brought
		ArrayList<String> backeryList=new ArrayList<String>();
		backeryList.add("Pasta");
		backeryList.add("garlic bread");
		backeryList.add("donuts");

		//produce items to be brought
		ArrayList<String> produceList=new ArrayList<String>();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("pepper");

		//drinks to be brought
		ArrayList<String> drinkList=new ArrayList<String>();
		drinkList.add("soda");
		drinkList.add("coffee");

		//total grocery list(2D ArrayList)
		ArrayList<ArrayList<String>> groceryList=new ArrayList<ArrayList<String>>();
		groceryList.add(backeryList);
		groceryList.add(produceList);
		groceryList.add(drinkList);

		System.out.println(groceryList.get(0).get(0));

	}
}