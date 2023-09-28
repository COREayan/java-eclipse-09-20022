package apnaCollege_placementCourse;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Recursion1 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		// Q1. Print numbers from 5 to 1
		int n = Integer.parseInt(br.readLine().trim());
		printNumbersReverse(n);
		*/
		/*
		// Q2. Print numbers from 1 to 5.
		int n = Integer.parseInt(br.readLine().trim());
		printNumbers(n);
		*/
		/*
		// Q3. Print the sum of first n natural numbers.
		int n = Integer.parseInt(br.readLine().trim());
		printSum(n, 0);
		*/
		
		// Q4. Print factorial of a number n.
		
	}
	
	public static void printNumbersReverse(int n) {
		if (n==0) {
			return;
		}
		System.out.println(n);
		printNumbersReverse(n-1);
	}
	
	public static void printNumbers(int n) {
		if (n==0) {
			return;
		}
		printNumbers(n-1);
		System.out.println(n);
	}
	
	public static void printSum(int n, int sum) {
		if (n==0) {
			System.out.println(sum);
			return;
		}
		sum += n;
		printSum(n-1, sum);
	}
	
}
