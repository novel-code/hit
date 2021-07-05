package hit.day18;

public class InterfaceDemo {
	public static void main(String[] args) {
		
	
	AlopathyMedicalCollege stanley = new AlopathyMedicalCollege();
	Doctor doctor = (Doctor)stanley;// By casting you get user level rights and privileges
	doctor.doCure();//if cast to Doctor i can only do (.doCure)
	Nurse nurse = (Nurse)stanley;
	nurse.doNursiong();
	
	HomeopathyMedicalCollege homeoDoctor = new HomeopathyMedicalCollege();
	Doctor doctor2 = (Doctor)homeoDoctor;
	doctor2.doCure();
	Nurse nurse2 = (Nurse)homeoDoctor; // I will get an exception at this line
	nurse2.doNursiong();
	
	System.out.println(Doctor.i);
	}

	}

interface Doctor {
	// there is no compulsion to have a method
	// Interface with no methods are called marker interfaces
	// You can have one or more methods
	// A interface with only one method is called Functional Interface
	public void doCure(); 
	// Interface with more than one method is a normal interface
	// What is special about functional interfaces
	// Function interfaces alone can use - Method Expressions and Lambdas.
	// where as marker or normal interfaces (interface with more than one method)
	// cannot use MethodExpression and Lambda - introduced in jdk8
	// Interfaces can also have fields declared.
	final static int i = 10; // even if u don't give, it is still final and static
	// Fields are by default static and final. which means they are constants.
	// interfaces can also have methods with business logic from jdk9
	default public void met() {
		System.out.println("met called...");
	}
	// default methods can be accessed only within the interfaces
	// they are equivalent to template method of abstract classes
}
// interface can extend another interface
interface Surgeon extends Doctor {
	
}
interface Nurse {
	public void doNursiong();
}
// implementation class of Interface...
class AlopathyMedicalCollege implements Doctor,Nurse { // implementation class
	@Override
	public void doNursiong() {
		System.out.println("nursing method called...");
		
	}
	@Override
	public void doCure() {
		System.out.println("do cure method called as per alopathy...");
		
	}
	
}

class HomeopathyMedicalCollege implements Doctor {
@Override
	public void doCure() {
		System.out.println("do cure method called  as per homeopathy");
	}	
}





