package hit.day25;

import java.util.StringJoiner;

public class GarbageDemo {
	public static void main(String[] args) {
	 
		Runtime r = Runtime.getRuntime();
		System.out.println("Free memory"+r.freeMemory());
		
		GrandFather daddu = new GrandFather();
		System.out.println("After Daddu is born... Free memory"+r.freeMemory());
		
		String s = "hello";
		String temp = s;
		String s2 = s+"world";
		
		System.out.println(temp);
		
		StringBuffer sb = new StringBuffer("hello");
		StringBuffer sbtemp = sb;
		sb.append("world");
		System.out.println(sbtemp);
	}
}

class GrandFather {
//	StringBuilder age = new StringBuilder();
//	StringBuffer age = new StringBuffer();
//	String age;
	StringJoiner age = new StringJoiner(",");
	public GrandFather() {
		for(int i = 0; i < 100000; i++) {
			
//			age.append("aaa"+i);
//			age = new String("aaa"+i);
			age.add("aa"+i);
		}
	}
}