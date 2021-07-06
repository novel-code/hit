package hit.day24;
// circular dependency between two synchronized blocks create a deadlock

public class DeadLockDemo {
	public static void main(String[] args) {
		Frog frog = new Frog();
		Crane crane = new Crane();
		new Thread(new Runnable() {
			@Override
			public void run() {
				crane.eat(frog);
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				frog.escape(crane);
			}
		}).start();
	}
}

class Crane {
synchronized	public void eat(Frog frog) {
//	System.out.println();
		frog.LeaveCallByCrane();
	}
	public void leaveCalledByFrog() {
		
	}
}

class Frog {
	synchronized	public void escape(Crane crane) {
		crane.leaveCalledByFrog();
	}
	synchronized	public void LeaveCallByCrane() {
		
	}
	
}