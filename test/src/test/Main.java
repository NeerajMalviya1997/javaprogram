package test;

import java.io.File;
import java.io.IOException;

public class Main {

	

	public static void main(String[] args) throws IOException {
		File f=new File("abc.txt");
		System.out.println(f); //abc.txt
		System.out.println(f.exists()); //false
		f.createNewFile(); // it will create a abc.txt file in the current location
		System.out.println(f.exists()); //true
		File f2=new File("d://myfiles//abc.txt");
		f2.createNewFile();// if d://myfiles location is not there
		//then it will throw an exception
	
	
	}
	
	
}
