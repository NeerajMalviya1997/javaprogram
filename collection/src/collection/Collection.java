package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;


public class Collection {
	public static void main(String[] args) {
		
		
		
		List<String> s=new ArrayList<>();
		

		HashSet<String> hs = new HashSet<>();

		hs.add("Delhi");
		hs.add("Mumbai");
		hs.add("Chennai");
		hs.add("Pune");
		hs.add("Delhi"); //duplicate element
		hs.add(null); //adding null
		hs.add("Bangaluru");
		System.out.println("HashSet" + hs);
		
		s.add("Delhi");
		s.add("Mumbai");
		s.add("Chennai");
		s.add("Pune");
		s.add("Delhi"); //duplicate element
		s.add(null); //adding null
		s.add("Bangaluru");
		System.out.println("Arrau=yList" + s);
		
		
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("Delhi");
		lhs.add("Mumbai");
		lhs.add("Chennai");
		lhs.add("Pune");
		lhs.add("Delhi"); //duplicate element
		lhs.add(null); //adding null
		lhs.add("Bangaluru");
		System.out.println(lhs);
		
		
		TreeSet<String> ts=new TreeSet();
		ts.add("Delhi");
		ts.add("Mumbai");
		ts.add("Chennai");
		ts.add("Bangaluru");
//		System.out.println(ts);
//		ts.add(52);
//		ts.add(91);
//		ts.add(2);
//		ts.add(1);
//		ts.add(25);
		
		System.out.println(ts);

	}

}
