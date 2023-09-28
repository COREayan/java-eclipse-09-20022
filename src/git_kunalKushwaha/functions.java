package git_kunalKushwaha;
import java.util.Scanner;

public class functions {
	static int largest(int first, int second, int third) {
		//My logic
		/*
		if (first>second) {
			if (third>first) {
				return third;
			} else {
				return first;
			}
		} else {
			if (third>second) {
				return third;
			} else {
				return second;
			}
		}
		*/
		
		//Java67 logic
		if (first>second) {
			if (first>third) {
				return first;
			} else {
				return third;
			}
		} else {
			if (second>third) {
				return second;
			} else {
				return third;
			}
		}
	}
	
	static int smallest(int first, int second, int third) {
		if (first<second) {
			if (third<first) {
				return third;
			} else {
				return first;
			}
		} else {
			if (third<second) {
				return third;
			} else {
				return second;
			}
		}
	}
	
	static void one() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in one\n");
		System.out.println("Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.");
		
		System.out.println("Enter three numbers");
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		
		System.out.println("Largest of three number : " + largest(first, second, third));
		System.out.println("Smallest of three number : " + smallest(first, second, third));
	}
	public static void main(String[] args) {
		System.out.println("in main\n");
		one();
	}
}
