package file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filefun {
	public static void main(String[] args) throws IOException {
		File f=new File("xyz.txt");
		
		
		FileWriter fw = new FileWriter("xyz.txt");
		fw.write(100);//d will be added
		fw.write("ramesh\nwelcome");
		fw.write("\n");
		fw.write("india");
		fw.write("\n");
		char ch[]={'a','b','c'};
		
		fw.write(ch);
		fw.flush();
		fw.close();
		System.out.println("done");
		
		
		
		FileReader fr=new FileReader("xyz.txt");
		int i=fr.read();
		while( i != -1) {
		System.out.print((char) i);
		i = fr.read();
		}

	}
}
