package au2019.assignments;

import java.io.*;
public class ExceptionFileNotFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("C:\\file.txt");
			FileReader fr = new FileReader(file);
		}
		catch(FileNotFoundException e) {
			System.out.println("File does not exists");
		}
	}
}
