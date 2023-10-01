package firstdemo;

public class Vehicle {
	private int year;
	private String model;
	private String make;
	
	
	public Vehicle(int year,String model,String make) {
		super();
		this.year=year;
		this.model=model;
		this.make=make;
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	public void display() {
		System.out.println("Year:"+getYear());
		System.out.println("Model:"+getModel());
		System.out.println("Make:"+getMake());
		
	}


}