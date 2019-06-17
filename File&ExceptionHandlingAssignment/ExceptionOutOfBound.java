package au2019.assignments;

public class ExceptionOutOfBound {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			int b = a[10];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of Bound");
		}
	}
}
