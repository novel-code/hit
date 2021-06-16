package hit.day13;

public class StringDemo {
	public static void main(String[] args) {
		String s = "hello"; // recommended approach by default
		String st = new String("hello");
		
		//string objects are non mutable
		
		String temp="hello new temp world..."+s;
		// + - is a concatenation operator
		System.out.println(temp);
		System.out.println(s.hashCode());
		System.out.println(st.hashCode());
		System.out.println(s==st);
		System.out.println(s.equals(st)); // if both the hash codes are same then the result will be true
		
		String mystor = s;
		
		s = s+"new value...";
		System.out.println(s);
		
		System.out.println(mystor);
		
		//string is non mutable... once u declare a string.. the string value cannot be changed...
		//when u change then a new copy of string is created...
		//so be very careful when you do operations like concat/ split/ reverse etc on a string in indefinite loop
		
		char c = s.charAt(2);
		System.out.println(c);
	 	System.out.println( s.substring(2, 4));
	 	
	 	System.out.println(mystor==st);
	 	System.out.println(mystor.equals(st));
	}
}
