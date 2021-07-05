package hit.day18;

public class InterfaceDemo3 {
	public static void main(String[] args) {
		// Lambda
		Student student = ()->{
			System.out.println("learning method logic...");
		};
		
		student.learn();
		
		Driver driver =(String s)-> {
			System.out.println("The driver logic is...");
			System.out.println("The value supplied is..."+s);
		};
		
		driver.drive("the light machine..");
		
		// the type of the parameter can be omitted
		Pilot pilot = ( name,  speed)-> {
			System.out.println("pilot name is "+name);
			System.out.println("aeroplane is at speed"+speed);
		};
		
		pilot.fly("syed", 757);
	}
}

interface Student {
	public void learn();
//	public void doubts();
}

interface Driver {
	public void drive(String s);
}

interface Pilot {
	public void fly(String name, int speed);
}