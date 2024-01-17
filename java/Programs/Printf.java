public class Printf{
	public static void main (String[] args){
		System.out.printf("%10.2f",125.6789);
		/*
		-same as printf in C/C++

		-for strings=> %20s makes the string of a length of 
						minumum 20 characters. Eg- Sayan Bose
						changes to "          Sayan Bose"

					=>%-20s changes it to "Sayan Bose          "
		
		-for floats/doubles
		````````````````````
			%.2f- no of decimal places are 2

			%10.2f- no of decimal places 2. Also, 10 characters
			possible (considered after trimming the decimals) and
			including the decimal character(.)

			Eg- 125.6789 changes to "    125.68" on %10.2f

		-flags
		```````
		(-) used to left justify the numbers and send the
			spaces to the right Eg- %-10.2f

		%+f =>adds a plus sign to the value

		%,f => seperates thousands places
		Eg-10000000.000 to 10,000,000.000000


		*/
	}
}