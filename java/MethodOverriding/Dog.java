public class Dog extends Animal{

	/*
	"@Override" is not compulsary, but a recommended practice. Remember 'O' is in caps. It is NOT 
	a comment that is skipped by compiler, but it informs the compiler that a overriding  process
	is going on. So, it is always recommended to put this while overriding function 
	*/

	//Here, inspite of inheriting Animal class's speak method, we override it as desired in Dog class

	@Override	
	void speak(){
		System.out.println("Bark!");
	}
}