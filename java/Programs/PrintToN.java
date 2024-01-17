//print 1 to 5(recursion)
import java.util.*;

public class PrintToN{
	public static void main (String[] args){
		PrintToNF(1);
	}

	public static void PrintToNF(int n){
		if (n==6){
			return;
		}
		else {
			System.out.println(n);
			PrintToNF(n+1);
		}
	}

}