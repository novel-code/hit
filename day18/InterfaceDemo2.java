package hit.day18;

public class InterfaceDemo2 {
	public static void mySomeMethod() {
		System.out.println("my some method is called...");
	}
	
	public void myAnotherMethod() {
		System.out.println("my another logic is called...");
	}
	
	public static void main(String[] args) {
		Teacher teacher = InterfaceDemo2::mySomeMethod; //this technique is called Method Expression
		//Method expressions work only on functional interface
		teacher.doTeach();
		
		teacher = new InterfaceDemo2()::myAnotherMethod;
		teacher.doTeach();
	}
}

// any interface with one method is called functional interface
// advantage - you can use method expression and lambda techniques
interface Teacher {
	public void doTeach();
//	public void doTalk();
}