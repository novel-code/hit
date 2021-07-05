package hit.day22;
//Critical path - The maximum limit or time within which u need to complete the task
//Asynchronous work/ execution - you use threads (A layer of indirection)
public class ThreadDemo1 {
	public static void main(String[] args) throws Exception{
		//by default java runs a main thread
		Thread t=Thread.currentThread(); // (Thread is a class which has the method currentThread())
		t.setName("this is my main thread...");
		t.setPriority(10); //  higher priority executes first (more preference)
		System.out.println(t); // [name of the thread, priority of thread, group of thread(handycap, senier citizen...etc)]
		System.out.println("Now thread will sleep for 5 seconds...");
		//vacinationCenter();
		System.out.println("start the class");	
		for(int i=0;i<5;i++) {
			System.out.println(i);
			Thread.sleep(1000); // method in Thread class
		}
	}
	
	static void vacinationCenter()throws Exception {
		System.out.println("method called...");
		Thread.sleep(5000);
	}
}
