package hit.day14;

public class InvalidCardException extends Exception {
	String msg;
	public InvalidCardException(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Exception  is...:"+msg;
	}
}
