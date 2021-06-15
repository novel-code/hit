package hit.day10;

public class AssoDemo {
	public void eatLaddu(Laddu laddu) {
		System.out.println("laddu is eaten now.. half");
		laddu.setSize(5);
	}
	public static void main(String[] args) {
		Laddu laddu = new Laddu(); // association - assodemo has knowledge of laddu
		laddu.setSize(10);
		System.out.println("Before eating laddu the size is..:"+laddu.size);
		
		AssoDemo obj = new AssoDemo();
		// passing the object by reference...
		obj.eatLaddu(laddu);
		
		System.out.println("After eatin laddu the size is ..:"+laddu.size);
	}
	
}

class Laddu {
	int size;
	public void setSize(int size) { // local variables takes precedence over global variables
		this.size = size;
	}
}
