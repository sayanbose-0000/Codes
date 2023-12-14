import javax.swing.JFrame;	//A GUI window to add components to
import javax.swing.ImageIcon;	//imported to change the icon of JFrame window
import java.awt.Color;	//for setting background colour

public class MyFrame extends JFrame{

	MyFrame(){
		this.setVisible(true);	//makes the this visible(important, otherwise window won't show)

		this.setSize(420,420);	//sets x and y dimensions of our this

		this.setTitle("Hello World"); //sets JFrame Title


		//by default, cross hides the JFrame and not close it. We do this to close JFrame on clicking close button
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//by default it is JFrame.HIDE_ON_CLOSE
		//also there is JFrame.DO_NOTHING_ON_CLOSE

		this.setResizable(false);//prevents someone from resizing the JFrame Window

		ImageIcon img=new ImageIcon("SBImage.png");	//This creates an image icon
		this.setIconImage(img.getImage());	//change icon of JFrame window



		//"this.getContentPane().setBackground(Color.yellow);"	//change background colour from selected colours
		//or
		this.getContentPane().setBackground(new Color(40,29,120)); //add rgb or hexadecimal value

	}
}