package firstdemo;

public class Car extends Vehicle {
	private int numDoor;
	
	public Car(int year,String model,String make,int numDoor) {
		super(year,model,make);
		this.numDoor=numDoor;
	}

	public int getNumDoor() {
		return numDoor;
	}

	public void setNumDoor(int numDoor) {
		this.numDoor = numDoor;
	}
	
	
	
	public void display() {
		System.out.println("Car Details");
		
		System.out.println("Number of Door:"+numDoor);
		super.display();
		
	}

}
