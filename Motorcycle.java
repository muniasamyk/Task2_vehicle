package firstdemo;

public class Motorcycle extends Vehicle {
	private int topSpeed;
	
	public Motorcycle(int year,String model,String make,int topSpeed) {
		super(year,model,make);
		this.topSpeed=topSpeed;
	}
	
	

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	public void display() {
		System.out.println("Motorcycle Dteails");
		
		System.out.println("Top Speed:"+topSpeed);
		super.display();
	}
	

}
