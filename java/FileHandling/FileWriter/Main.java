import java.io.FileWriter;
import java.io.IOException;

public class Main{
	public static void main(String[] args){

		try{			//ALWAYS USE TRY AND CATCH BLOCKS
			FileWriter fw=new FileWriter("Text.txt");

			//writes new text everytime
			fw.write("Hi! I am Sayan Bose");

			fw.write(System.lineSeparator());//use this to seperate lines,"\n" doesn't work

			fw.append("Have a good day");	

			fw.write(System.lineSeparator());

			fw.close();
		}
		
		catch(IOException e){
			System.out.println(e);
		}

	}
}