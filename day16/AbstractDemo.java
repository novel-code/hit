package hit.day16;
/*
 *  What is the Need for Hierarchial Classification
 *  1. Part Whole hierarchy
 *  2. Composition
 *  3. Polymorphic query
 *  4. Object Reusability
 *  5. Removal of If-Else-If
 *  6. Reusability of code
 *  The above reasons are the reasons for inheritance
 *  
 *  All parent classes have to be abstract
 *  - you cannot create a object of parent class because they are common nouns 
 *  So in order to ensure that an object should not be created.. we make the class abstract
 */

abstract class Item {
	public abstract int cost ();
}
abstract class Cream extends Item {
	
}
abstract class Ingredients  extends Item {
	
}
class Vanila extends Cream {
	Item item;
	public Vanila() {
		// TODO Auto-generated constructor stub
	}
	public Vanila(Item item) {
		this.item = item;
	}
	@Override
	public int cost() {
		if(item == null ) {
			
			return 10;
		} else {
			return 10 + item.cost();
		}
	}
}
class ButterScotch extends Cream {
	Item item;
	public ButterScotch() {
		// TODO Auto-generated constructor stub
	}
	public ButterScotch(Item item) {
		this.item = item;
	}
	@Override
	public int cost() {
		if (item == null) {
			return 15;
		} else {
			return 15 + item.cost();
		}
		
	}
}
class Nuts extends Ingredients {
	Item item;
	public Nuts() {
		// TODO Auto-generated constructor stub
	}
	public Nuts (Item item) {
		this.item = item;
	}
	@Override
	public int cost() {
		if (item == null) {
			return 5;
		} else {
			return 5 + item.cost();
		}
		
	}
}
class DryFruits extends Ingredients {
	Item item;
	public DryFruits() {
		// TODO Auto-generated constructor stub
	}
	public DryFruits(Item item) {
		this.item = item;
	}
	@Override
	public int cost() {
		if (item == null) {
			return 10;
		} else {
			return 10 + item.cost();
		}
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
		Item iceCream = new Vanila(new Nuts(new ButterScotch(new DryFruits(new Vanila()))));
		System.out.println("One vanila cup + nuts + one butterscotch + dry fruits + vanila .."+iceCream.cost());
		
		
	}
}
