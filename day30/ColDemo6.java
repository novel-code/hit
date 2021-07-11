package hit.day30;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ColDemo6 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("2101", "Mohammad is scratching the wall - please stop");
		prop.put("20233", "he is not scratching the wall");
		
//		System.out.println(prop.get("2101"));
		
		Enumeration e = prop.elements();
		
		while(e.hasMoreElements()) {
			
			String value =(String) e.nextElement();
			System.out.println(value);
		}
		
		Set set = prop.entrySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry me =(Map.Entry)iter.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
	}
}
