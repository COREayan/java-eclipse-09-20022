package git_kunalKushwaha;

import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor;

public class flow_of_program {
	
	static void one() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in one\n");
		System.out.println("Input a year and find whether it is a leap year or not.");
		
		int year = sc.nextInt();
		if (year%400==0) {
			System.out.println("Leap year");
		} else if (year%100!=0 && year%4==0) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not a leap year");
		}
		
	}
	
	static void two() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in two\n");
		System.out.println("Take two numbers and print the sum of both.");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("sum of " +a+ " and " +b+ " = " + (a+b));
	}
	
	static void three() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in three\n");
		System.out.println("Take a number as input and print the multiplication table for it.");
		
		int n = sc.nextInt();
		for (int i=0; i<10; i++) {
			System.out.print(n+"\t");
		}
		System.out.println();
		for (int i=1; i<=10; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		for (int i=1; i<=10; i++) {
			System.out.print((i*n)+"\t");
		}
	}
	
	static void four() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in four\n");
		System.out.println("Take 2 numbers as inputs and find their HCF and LCM.");
		
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		
		int hcf=1; 
		int lcm; 
		if (a>b) {
			int temp = a; 
			a = b; 
			b = temp; 
		}
		for (int i=1; i<=a; i++) {
			if (a%i==0 && b%i==0) {
				hcf = i;
			}
		}
		System.out.println("hcf: "+hcf );
		System.out.println("lcm: "+((a*b)/hcf));
	}
	
	static void five() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in five\n");
		System.out.println("Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.");
		
		String input = sc.nextLine(); 
		int sum = 0; 
		do {
			int n = Integer.parseInt(input);
			sum = sum + n;
			input = sc.nextLine();
		} while (!(input.equals('x')));
		System.out.println("sum: " + sum);
	}
	public static void main(String[] args) {
		System.out.println("in main\n");
		//one();
		//two();
		//three();
		//four();
		five(); 
	}
}
