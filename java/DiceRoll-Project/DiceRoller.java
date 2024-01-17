import java.util.Random;

public class DiceRoller{

	int diceroll(){
		Random random=new Random();
		int number=0;
		int x=roll(random,number);
		return x;
	}

	int roll(Random random,int number){
		number=random.nextInt(6)+1;
		return number;
	}
}