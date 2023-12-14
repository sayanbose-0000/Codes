import java.io.File;

public class Main{
	public static void main (String[] args){
		File file=new File("Text.txt");
		if (file.exists()){	//checks existence of file
			System.out.println("File exists");
		}
		else{
			System.out.println("File doesn't exist");
		}

		System.out.println(file.getPath()); //displays what is written inside the constructor of File class
		System.out.println(file.getAbsolutePath());	//displays the full path of file



		//checks if the mentioned thing is a  file or something else like a folder
		System.out.println(file.isFile()); 


		file.delete(); // ->deletes the file
	} 
}