import java.util.ArrayList;

public class ArrayLists{
	public static void main(String[] args){
		ArrayList<String> name=new ArrayList<String>();

		name.add("Sayan Bose");
		name.add("Sayan Ghosh");
		name.add("Sayan Das");
		name.add("Sayan Sur");
		name.add("Sayan Banerjee");

		for (int i=0;i<name.size();i++){
			System.out.println(name.get(i));
		}


	}
}