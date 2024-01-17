import javax.swing.JFrame;	//A GUI window to add components to
import javax.swing.ImageIcon;	//imported to change the icon of JFrame window
import java.awt.Color;	//for setting background colour

public class Main{
	public static void main(String[] args){
		JFrame frame=new JFrame();	//creates instance of a JFrame

		frame.setVisible(true);	//makes the frame visible(important, otherwise window won't show)

		frame.setSize(420,420);	//sets x and y dimensions of our frame

		frame.setTitle("Hello World"); //sets JFrame Title


		//by default, cross hides the JFrame and not close it. We do this to close JFrame on clicking close button
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//by default it is JFrame.HIDE_ON_CLOSE
		//also there is JFrame.DO_NOTHING_ON_CLOSE

		frame.setResizable(false);//prevents someone from resizing the JFrame Window

		ImageIcon img=new ImageIcon("SBImage.png");	//creats an image icon
		frame.setIconImage(img.getImage());	//change icon of Jframe window



		//"frame.getContentPane().setBackground(Color.yellow);"	//change background colour from selected colours
		//or
		frame.getContentPane().setBackground(new Color(40,29,120)); //add rgb or hexadecimal value



	}
}