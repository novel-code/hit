
package hit.day12;
/*
 * bad - code which is open for modification and closed for extension - bad brush
 * good - code which is close for modification and open for extension - good brush
 * 1. Whenever you find if-else-if conditions then apply this solution
 * 2. Convert the condition into classes
 * 3. Group them under a hierarchy
 * 4. create a association between the using class (PaintBrush) and the hierarchical class(Paint)
 * ooa
 *  principles used
 * 1. Inheritance 2. Association
 * what we achieved -
 * 1. Open close principle
 * 2. Object Reusability
 */

public class GoodBrush {
	public static void main(String[] args) {
		GoodPaintBrush brush = new GoodPaintBrush();
		
		RedPaint rp = new RedPaint();
		BluePaint bp = new BluePaint();
		GreenPaint gp = new GreenPaint();
		
		brush.rp=gp;
		brush.doPaint();
		
		System.out.println(rp);
		System.out.println(bp);
	}
}

class GoodPaintBrush { // in this paint brush the code is not modified whenever a new color is chosen
	Paint rp;
	public void doPaint() {
		System.out.println(rp);
	}
}
class BadPaintBrush { // in this paint brush the code gets modified whenever a new color is chosen
	public void doPaint(int choice) {
		if (choice == 1 ) {
			System.out.println("red color...");
		} else if ( choice == 2) {
			System.out.println("blue color...");
		} else if (choice ==3) {
			System.out.println("green color...");
		} else if (choice == 4) {
			System.out.println("pink color...");
		}
	}
}
/*
 * 100% the parent class should be declared abstract
 * Abstract class is a special class used to represent the parent class, its a classifier class
 * it provided a overview of the hierarchy which you create by extending this class..
 * You cannot create an object of this class
 * There is no compulsion to have any code inside the abstract class
 */
abstract class Paint {
	
}

class RedPaint extends Paint{
	
}

class BluePaint extends Paint {
	
}
class GreenPaint extends Paint {
	
}