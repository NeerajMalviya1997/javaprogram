package multit;

import java.util.ArrayList;
import java.util.List;

class Main {
	
	static{
		System.out.println("neer");
	}
	
	
	public static void main(String[] args) throws InterruptedException {
//		Common c=new Common();
//		
//		ThreadA t1=new ThreadA(c,"Ram");
//		
//		ThreadB t2=new ThreadB(c,"Shyam");
//		t1.start();
//		t2.start();
		List s=new ArrayList();
	s.add("str");
		s.add(12);
//		for(int i=0;i<s.size();i++) {
//			System.out.println(s.get(i));
//		}
		for(Object i :s) {
			System.out.println(i);
		}
	
	}
}
