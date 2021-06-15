package hit.day10;

public class ConsInherDemo {
	public static void main(String[] args) {
		 Shoe shoe = new LeatherShoe(6);
		 System.out.println(shoe);
	}
	

}

class Shoe {
	int i;
	public Shoe () {
		System.out.println("cons of shoe is called...");
	}
	public Shoe (int i) {
		System.out.println("parametric constructor of shoe called...");
	}
	public void met() {
		System.out.println("parent shoe class method called...");
	}
}

class LeatherShoe extends Shoe {
	// there is no concept of over riding in constructor
	// always the parent class default constructor is called..
	public LeatherShoe (int i) {
		super(39); // super class constructor - should be the first line in the constructor
		super.i = 100; // super can refer to super class variable
		super.met(); // super can refer to super class method
		System.out.println("cons of leather shoe is called...");
	}
}