/**
 * 
 */
package hit.day8;

/**
 * @author ELCOT
 *
 */
public class HelloWorld {

	/**
	 * 
	 */
	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) { // command line arguments
		// TODO Auto-generated method stub
		System.out.println(args[0]+".............."+args[1]);
		Hello hello = new Hello(); // you are loading the class in memeory
		// hello.myMethod();
		Hello.myMethod();
	}
	public static void main(int[] args) {
		
	}
}

class Hello {
		int  i = 10;
		float f = 10.1f;
		double d = 212121.3423;
		long l = 329272173;
		short s = 2323;
		byte b = -128;
		
		public static void myMethod() {
//			System.out.println(i +":"+f+":"+d);
		}
}