package hit.day14;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		System.out.println("before exception...");
		try {
		int i = 1/0;
		} 
		catch (Exception e) {
			e.initCause(e);
			System.out.println(e);
			e.printStackTrace();
			e.getCause();
		}
		finally {
			System.out.println("finally block called...");
		}
		System.out.println("after exception...");
	}
}
