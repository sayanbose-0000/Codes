public class Student{
	String myName;
	int myClass;
	char mySection;
	int myRoll;

	//class constructor
	Student(String myName,int myClass,char mySection,int myRoll){
		this.myName=myName;
		this.myClass=myClass;
		this.mySection=mySection;
		this.myRoll=myRoll;
	}

	void pass(){
		System.out.println(this.myName+", You have passed");
	}

	void fail(){
		System.out.println(this.myName+", You have failed");
	}

}