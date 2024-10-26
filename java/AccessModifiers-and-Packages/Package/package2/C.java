package package2;
import package1.*;

public class C{ //we see here that C lass is public

	String defaultMessage="This is the default";	//no access modifier used

	public String publicMessage="This is public";	//"public" access modifier used

	//protected String protectedMessage="This is protected";	//"protected" access modifier used

	protected String protectedMessage="This is protected";	//"protected" access modifier used
	/*
	This string can be put in main class and accessed via a subclass
	*/

	private String privateMessage="This is private";	//"private" access modifier used
	/*
	private is only accessible to only the class it is defined in. Here, "privateMessage" can only be
	accessed in C.java (since it has been declared there) and nowhere else
	*/


}