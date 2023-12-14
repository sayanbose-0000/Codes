import java.util.Random;

public class Main{
	public static void main (String[] args){
		Random rand= new Random();
		int x=rand.nextInt(2);

		if (x==0){
			System.out.println("It's a head ("+x+")");
		}
		else{
			System.out.println("It's a tale ("+x+")");
		}
	}
}