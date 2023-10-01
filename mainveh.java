package firstdemo;

public class mainveh extends Vehicle {
	
	public mainveh(int year,String model,String make) {
		super(year,model,make);
		
	}
	
	public static void main(String [] args) {
		
		Car c1=new Car(2023,"TOYOTA","JAPAN",4);
		c1.display();
		
		Motorcycle m1=new Motorcycle(2024,"YAMAHA","Harley",500);
		m1.display();
		
		
		
	}

}