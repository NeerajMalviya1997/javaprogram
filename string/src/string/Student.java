package string;

public class Student {
	
	int x(int p) throws ArithmeticException{
		
		if(p==0) {
			throw(new ArithmeticException());
		}
		return 10/p;
	}

}
