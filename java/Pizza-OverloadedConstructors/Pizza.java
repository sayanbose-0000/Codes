public class Pizza{

	String name;
	String bread;
	String sauce;
	String cheese;
	String topping;

	Pizza(){
	}

	Pizza(String name){
		this.name=name;	
	}

	Pizza(String name,String bread){
		this.name=name;
		this.bread=bread;	
	}

	Pizza(String name,String bread, String sauce){
		this.name=name;
		this.bread=bread;
		this.sauce=sauce;	
	}

	Pizza(String name,String bread, String sauce, String cheese){
		this.name=name;
		this.bread=bread;
		this.sauce=sauce;
		this.cheese=cheese;	
	}

	Pizza(String name,String bread, String sauce, String cheese, String topping){
		this.name=name;
		this.bread=bread;
		this.sauce=sauce;
		this.cheese=cheese;
		this.topping=topping;
	}
}