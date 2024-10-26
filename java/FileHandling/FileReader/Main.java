import java.io.FileReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args){

		try {
			FileReader rdr=new FileReader("Text.txt");


			int data=rdr.read();	//returns first character's ASCII value
			System.out.println(data);	//when file end is reaches, rdr.read() returns -1


			while(data!=-1){	
				System.out.print((char)data);	//we cast data" to print character instead of ascii
				data=rdr.read();
			}	

			rdr.close();
		}

		catch(IOException e){
			System.out.println(e);
		}

	


	}
}