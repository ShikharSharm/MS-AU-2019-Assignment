package au2019.assignments;

import java.io.*;
import java.lang.*;

class Test<T> implements Comparable<Test<T>>{
	T obj1;
	
	//Constructor
	Test(T obj1){
		this.obj1 = obj1;
	}
	
	//Getter function
	T get() {
		return this.obj1;
	}
	
	public void print() {
		System.out.println(obj1);
	}
	
	public boolean equals(Test<T> obj) {
		if(obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false; 
		}
		
		return (this.get() == obj.get())? true: false;		
		
	}
	
	public int compareTo(Test<T> obj) {
		if(obj1 == obj.obj1)
			return 0;
		//else if(obj1 < obj.obj1)
		//	return -1;
		else
			return 1;*/
		
		//return this.obj1.compareTo(obj.obj1);
	}
}

public class ClassGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test<Integer> temp1 = new Test<Integer>(1234);
		Test<String> temp1 = new Test<String>("Shikhar");
		//Test<Integer> temp2 = new Test<Integer>(1234);
		Test<String> temp2 = new Test<String>("Shubham");
		
		temp1.print();
		temp2.print();
		
		System.out.println(temp1.equals(temp2));
		
		System.out.println(temp1.compareTo(temp2));
	}
}
