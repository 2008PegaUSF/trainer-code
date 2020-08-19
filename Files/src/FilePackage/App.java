package FilePackage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	public static void makeFile(String fileName) throws IOException {
		FileWriter fw = new FileWriter(fileName);
		fw.write("Look, a file!");
		fw.close();
	}
	
	public static void printFileContents(String fileName) throws IOException {
		FileReader fr = new FileReader(fileName);
		
		char[] buffer = new char[50];
		fr.read(buffer);
		System.out.println(buffer);
		
		/* char c;
		while ((c = (char)fr.read()) > 0) {
			System.out.print(c);
		} */
		
		fr.close();
	}
	
	public static void main(String[] args) {
		try {
			makeFile("file.txt");
			printFileContents("file.txt");
			
		} catch (IOException ioe) {
			System.out.println("Exception: " + ioe.getMessage());
			ioe.printStackTrace();
		}
	}
}
