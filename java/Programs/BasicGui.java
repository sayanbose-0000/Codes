import javax.swing.*;  //specifically we use the JOptionPane class

public class BasicGui{

    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog("Enter name");	//Input Message
        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter age"));	//Takes windows in seperate Pane
        
        //Integer wrapper class used to convert to int
        double height=Double.parseDouble(JOptionPane.showInputDialog("Enter height: "));
        JOptionPane.showMessageDialog(null,"Hello: "+name+". Your age is: "+age+ ". Your height is: "+height); 	//Shows Output
    }
}