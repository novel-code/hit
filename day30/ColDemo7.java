package hit.day30;

import java.util.HashMap; // when additions are many and retrivel is less (cachra wala)
import java.util.Iterator;
// tree map is when additions are less and retrivals are many..(coz it does sorting) stores
// tree map has key value pair
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ColDemo7 {
	public static void main(String[] args) {
//		Map<String, String> map = new HashMap<>();
		Map<String, String> map = new TreeMap<>((obj1, obj2) ->  obj2.compareTo(obj1));
		
		map.put("mykey1", "111111111111");
		map.put("mykey2", "222222222222");
		map.put("mykey3", "333333333333");
		System.out.println(map);
	
		System.out.println(map.get("mykey1"));
		
		Set<Map.Entry<String, String>> set = map.entrySet();
		
		Iterator<Map.Entry<String, String>> iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry<String, String> me = iter.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
	}
}
