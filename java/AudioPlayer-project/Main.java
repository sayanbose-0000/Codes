import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*; //not compatible with mp3, use .wav file

public class Main{
	public static void main(String[] args) throws Exception{
		
		File file=new File("Elephant.wav");
		AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);

		Clip clip=AudioSystem.getClip();
		clip.open(audioStream);	

		Scanner scanner=new Scanner(System.in);

		String response="";

		while(!response.equals("Q")){
			System.out.println("P=Play, S=Stop, R=Reset, Q=Quit");
			System.out.print("Enter your choice: ");
			response=scanner.next();
			response=response.toUpperCase();

		switch(response){
			case("P"):
				clip.start();
				break;
			case("S"):
				clip.stop();
				break;
			case("R"):
				clip.setMicrosecondPosition(0);
				break;
			case("Q"):
				clip.close();
				break;
			default:
				System.out.println("Not a valid choice");
				break;

		}

		System.out.println("Audio Stopped");
		}

		
	}
}