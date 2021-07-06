package hit.day26;

public class ClassLockDemo {
	public static void main(String[] args) {
		Sample obj =  new Sample();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized(Sample.class) {
					
					obj.met1();
				}
			}
		}).start();
		
		Sample obj2 = new Sample();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized(Sample.class) {
					
					obj2.met2();
				}
				
			}
		}).start();
	}
}

class Sample {
	static int money=1000;
	public static void met1() {
		money = money + 100;
		try {Thread.sleep(1000);}catch(Exception e) {}
		System.out.println("From method1 called by Thread 1....: "+money);
	}
	public static void met2() {
		money = money+200;
		try {Thread.sleep(1000);}catch(Exception e) {}
		System.out.println("From method2 called by Thread 2....:"+money);
	}
}