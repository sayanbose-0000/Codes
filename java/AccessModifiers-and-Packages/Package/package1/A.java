package package1;	//denotes that it is of pacakge1

import package2.*;		//imports everything from package1

//To access only C.java from package2, use "import pacakge2.C"

public class A{
	public static void main(String[] args){

		C c = new C();		//new object can be made since C class is public

		/*
		"System.out.println(c.defaultMessage);"  ->can't be accessed here (in package 1)because it has 
		no access modifier in C.java. However, it can still be accessed in package2 files
		*/

		System.out.println(c.publicMessage); //can be used here because of "public" access modifier in C.java


	}
}