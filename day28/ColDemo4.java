package hit.day28;

import java.util.HashSet; // there is no arangement (use hashset if there are many additions
// continuously) coz there wont be any reshuffels (like garbage dump)
import java.util.Iterator;
import java.util.Set; /* 
* 1.avoid duplicates 2. automatically has an index which makes it retrive faster
*/
import java.util.TreeSet; // for sorting 1. goes ahead with index.. making sure they are stored in ordered fashion 
// so retrival is much better than hash set 2. every time you make a change it aranges things
// (like a super market)

// homework - stack and queue

public class ColDemo4 {
	public static void main(String[] args) {
//		Set<String> set = new HashSet<>();
		Set<String> set = new TreeSet<>(); // sorting

		set.add("hello");
		set.add("hai");
		set.add("hello");
		set.add("world");
		set.add("earth");
		
		System.out.println(set);
		
		set.add("zeebra");
		set.add("almighty");
		
		System.out.println(set);
		
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		for(String s:set) {
			System.out.println(s);
		}
		
	}
}
