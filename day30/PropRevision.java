package hit.day30;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropRevision {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.put("mykey1", "my vaalue11111111111111");
		prop.put("makey2","vlaue 22222222222");
		prop.put("mykey3", "value 33333333333333");
		
		// First Reading method
		System.out.println(prop.get("mykey1"));
		System.out.println("+++++++++++++++++++");
		
		// Second Reading method
		Enumeration e = prop.elements();		
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		System.out.println("+++++++++++++++++++++");
		
		Set set = prop.entrySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry me = (Map.Entry)iter.next();
			System.out.println(me);

//			System.out.println(me.getKey()+":"+me.getValue());
		}
	}
}
