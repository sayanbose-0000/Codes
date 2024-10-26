public class Car{

	//the three variables are private, so, they can be accessed only in this Car class
	//and nowhere else

	private String make;	
	private String model;
	private int year;

	Car(String make,String model,int year){	
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}

	//we make getter methods for the private variables to access
	//them from other classes

	//getter #1
	public String getMake(){	
		return make;
	}

	//getter #2
	public String getModel(){	
		return model;
	}

	//getter #3
	public int getYear(){
		return year;
	}




	//we make setter methods for the private variables to edit
	//them from other classes

	//setter #1
	public void setMake(String make){
		this.make=make;
	}

	//setter #2
	public void setModel(String model){
		this.model=model;
	}

	//setter #3
	public void setYear(int year){
		this.year=year;
	}



}