package hit.day27;

import java.util.ArrayList;
import java.util.List;

public class GenericsInCollection {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // you are using generic collection of jdk 1.5 to make it specific
		
		list.add("aaa");
		list.add("bbbb");
		list.add("skj");
	
		//process this collection....
		
//		String s = (String)list.get(1);
//		Box s2 = (Box)list.get(2);
		
//		for (Object ob:list) {
//			if(ob instanceof String) {
//				String ss = (String)ob;
//				System.out.println(ss);
//			} else if (ob instanceof Box ) {
//				Box bb = (Box) ob;
//				System.out.println(bb);
//			}
//		}
		for (Object ob:list) {
			String s = (String)ob;
			System.out.println(s);
		}
	}
}

class Box {
	
}