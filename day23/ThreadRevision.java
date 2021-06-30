package hit.day23;


//  Parallel processing 
// 1. Performance 2. Asynchronous Programming
// How to create Threads ?
// We create thread using Thread class and using Executor Framework.
public class ThreadRevision {
		public ThreadRevision() {
			Thread t = new Thread(new ThreadJob());
			t.start();
		}
	
	public static void main(String[] args) {
		// How to capture the main thread 
		// All java programs run in main thread by default
		new ThreadRevision();
		Thread t= Thread.currentThread();
		System.out.println(t);
		for (int i = 0; i < 5; i ++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
		}
	}

}

class ThreadJob implements Runnable {
	@Override
	public void run() {
		System.out.println("child thread is executed...");
	}
}