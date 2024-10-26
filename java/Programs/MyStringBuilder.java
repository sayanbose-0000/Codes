//using string builder class

import java.util.*;

public class MyStringBuilder{
	public static void main (String[] args){
		StringBuilder abc= new StringBuilder("H");
		System.out.println(abc);
		abc.append("ello");
		System.out.println(abc);
		System.out.println(abc.length());
	}
}