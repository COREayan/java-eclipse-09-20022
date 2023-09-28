package apnaCollege_placementCourse;

public class Functions1 {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		tableOfN(9);
	}
	
	// 1. Make a function to check if a number is prime or not.
	public boolean primeFun(int n) {
		if (n<2) {
			return false;
		}
		for (int i=2; i<n; i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	// 2. Make a function to check if a given number n is  even or not.
	public boolean evenFun(int n) {
		return ((n&1)==1)?false:true;
	}
	
	// 3. Make a function to print the table of a given number n.
	public static void tableOfN(int n) {
		for (int i=1; i<=10; i++) {
			System.out.print(n+" ");
		}
		System.out.println();
		for (int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i=1; i<=10; i++) {
			System.out.print(n*i+" ");
		}
	}
}
