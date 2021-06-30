package hit.day15;
public class RedoDogProgram {
	public static void main(String[] args) {
		Child ramu=new Child();
		Dog tiger=new Dog();
		
		Item item=new Stone();
		
		ramu.playWithDog(tiger, item);
	}
}
abstract class DogExceptions extends Exception{
}
class DogBiteException extends DogExceptions{
	String msg;
	public DogBiteException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return this.msg;
	}
}
class DogBarkException extends DogExceptions{
	String msg;
	public DogBarkException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return this.msg;
	}
}
abstract class Item{
	public abstract void execute()throws DogExceptions;
}
class Stick extends Item{
	@Override
	public void execute() throws DogExceptions {
		throw new DogBiteException("You beat I bite.....");
	}
}
class Stone extends Item{
	@Override
	public void execute() throws DogExceptions {
		throw new DogBarkException("you hit I bark.........");
	}
}
class Dog{
	public void play(Item item) throws DogExceptions{
		item.execute();
	}
}
class Child{
	public void playWithDog(Dog tiger,Item item) {
		try {
			tiger.play(item);
		}catch(DogExceptions de) {
			System.out.println(de);
		}
	}
}