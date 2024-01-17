import java.util.ArrayList;

public class ForEachLoop{
	public static void main(String[] args){
		String[] animals={"cat","dog","rat","crow"};

		for (String i : animals){
			System.out.println(i);
		}


		ArrayList<String> animalia=new ArrayList<String>();

		animalia.add("Horse");
		animalia.add("Kitten");
		animalia.add("Buffallo");
		animalia.add("Chicken");

		for (String i:animalia){
			System.out.println(i);
		}

	}
}