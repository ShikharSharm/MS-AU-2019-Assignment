package au2019.assignments;
import java.io.*;
import java.util.Scanner;

public class CharFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Input the string: ");
		
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		
		System.out.println("The input string is: " + str);

		int len = str.length();
		int freq[] = new int[26];
		
		str = str.toUpperCase();
		
		for(int i=0;i<len;i++) {
			char chr = str.charAt(i);
			if(chr>=65 && chr <=91)
				freq[chr - 'A']++ ;
		}
		
		for(int i=0;i<26;i++) {
			if (freq[i] != 0){
				int temp = 'A' + i;
				char chr = (char) temp;
				System.out.print("Character : " + chr + "\t");
				
				for(int j=0;j<freq[i];j++) {
					System.out.print("#");
				}
				
				System.out.println(" ");
			}
		}
	}

}
