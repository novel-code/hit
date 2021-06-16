package hit.day12;
/*
 * Why Inheritance
 * 1. Object Reusability
 * 2. create a part-whole hierarchy
 * 3. composition
 * 4. eliminate if-else-if condition statements
 * 5. Polymorphic queries - 90 %
 * 6. Code Reusability - 1 %
 * 
 * 
 */
public class MultipleInherDemo {
	public static void main(String[] args) {
		Syed obj = new Syed();
		System.out.println(obj);

	}

}
class LivingObject {
	
}
class Human extends LivingObject{
	
}
class Dracula {
	
}
class Dog {
	
}


class Syed extends Human {
	
}