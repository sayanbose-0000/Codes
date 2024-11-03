import javax.swing.JFrame;
import javax.swing.JLabel;	//GUI display area for string, images, or both
import javax.swing.ImageIcon;
import java.awt.*;

public class Main{
	public static void main (String[] args){
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);

		JLabel label=new JLabel();	//for adding string,images or both
		label.setText("I am a Cat, meow");
		frame.add(label);	//left-centre aligned texts

		ImageIcon image=new ImageIcon("Cat.jpg");
		label.setIcon(image);	//adds an image to the label
		
		label.setHorizontalTextPosition(JLabel.CENTER);	//sets text centre w.r.t image horizontally (options- LEFT, CENTER, RIGHT)
		label.setVerticalTextPosition(JLabel.TOP);	//sets text centre w.r.t image vertically (options- TOP, CENTER, BOTTOM)
		
		label.setForeground(new Color(0x00FF00));	//font color
		label.setFont(new Font("Source Code Pro",Font.BOLD,20));//font name,style,size
		//We can use Font.PLAIN,Font.BOLD, FONT.ITALICS, etc.

		label.setIconTextGap(100);//distance between icon and image (can use -ve number to decrease)

		label.setBackground(Color.black);	//sets background colour to black,after opacity is true
		label.setOpaque(true);	//to display background colour, we need this
	}	
}