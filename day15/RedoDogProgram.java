package hit.day15;

public class RedoDogProgram {
}
abstract class DogExceptions extends Exception {
}

class DogBiteException extends DogExceptions {
	String msg;
	public DogBiteException(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return this.msg;
	}
}
class DogBarkException extends DogExceptions {
	String msg;
	public DogBarkException(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return this.msg;
	}
}

abstract class Item {
	public abstract void execute();
}
class Stick extends Item {
	@Override
	public void execute() throws DogExceptions {
		throw new DogBarkException("you beat I bite...")
	}
}
class Stone extends Item {
	@Override 
	public void execute() throws DogExceptions {
		throw new DogBarkException("you hit I bark...")
	}
}
class Dog {
	public void play(Item item) throws Exceptions {
		
	}
}