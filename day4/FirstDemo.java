package hit.day4;

public class FirstDemo { // FirstDemo is class declared as public
	//1. Data
	//2. Functions
	
	//Data
	//In java - there are four data types
	//1. number type = 1, 29,  1920, single characters.
	//2. decimal type = 1.2739
	//3. boolean type = true or false
	//4. string type = set of characters...
	
	// number types - byte, short, int, long, char
	//decimal - float, double
	//boolean - boolean
	//string - String
	
	int i; // A variable i is declared of type int
	float f;
	short s;
	byte b;
	long laa;
	boolean boo;
	double dub;
	
	
	public static void main(String[] args) {
		
		FirstDemo obj=new FirstDemo();
		
		System.out.println("int default value.."+obj.i);
		System.out.println("float default value...:"+obj.f);
		System.out.println("short default value...:"+obj.s);
		System.out.println("byte default value...:"+obj.b);
		System.out.println("boolean default value...:"+obj.boo);
		System.out.println("double default value...:"+obj.dub);
		
	}
	
}
