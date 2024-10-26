import javax.swing.JOptionPane;
import java.util.Random;

public class Main{
	public static void main(String[] args){
		
		String decision=JOptionPane.showInputDialog("What decision do you want to make?");

		int number=Integer.parseInt(JOptionPane.showInputDialog("Enter number of choices: "));

		String[] array=new String[number];
		
		for (int i=0;i<number;i++){
			array[i]=JOptionPane.showInputDialog("Enter choice number "+(i+1));
		}

		Random random=new Random();
		int x=random.nextInt(number);

		JOptionPane.showMessageDialog(null,decision+"\n"+"Your random choice is: "+array[x]);

	}
}