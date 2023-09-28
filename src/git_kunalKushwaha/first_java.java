package git_kunalKushwaha;

import java.util.Scanner;

public class first_java {
	static void one() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in one");
		System.out.println("Write a program to print whether a number is even or odd, also take input from the user.");
		int n = sc.nextInt(); 
		if (n%2==0) {
			System.out.println(n+" is even number");
		} else {
			System.out.println(n+" is odd number");
		}
		System.out.println();
	}
	
	static void two() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in two");
		System.out.println("Take name as input and print a greeting message for that particular name.");
		
		String input = sc.nextLine(); 
		System.out.println("Hello " +input+ ", Welcome to Programming Class");
		System.out.println();
	}
	
	static void three() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in three");
		System.out.println("Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.");
		
		System.out.println("Enter the Principle");
		int p = sc.nextInt(); 
		System.out.println("Enter the Time");
		int t = sc.nextInt(); 
		System.out.println("Enter the Rate of Interest");
		int r = sc.nextInt(); 
		
		int si = (p*t*r)/100; 
		System.out.println("Simple interest is "+si);
		System.out.println();
	}
	
	static void four() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in four");
		System.out.println("Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)");
		
		int a = sc.nextInt(); 
		int b = sc.nextInt();  
		char c = sc.next().charAt(0);
		
		if (c == '+') {
			System.out.println( a+" + "+b+" = "+(a+b) );
		} else if (c == '-') {
			System.out.println( a+ " - "+b+" = "+(a-b) );
		} else if (c == '*') {
			System.out.println( a+ " * "+b+" = "+(a*b) );
		} else if (c == '/') {
			System.out.println( a+ " / "+b+" = "+(a/b) );
		}
		System.out.println();
	}
	
	static void five() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in five");
		System.out.println("Take 2 numbers as input and print the largest number.");
		
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 
		
		if ( a>b ) {
			System.out.println("largest number: "+a);
		} else {
			System.out.println("largest number: "+b);
		}
		System.out.println();
	}
	
	static void six() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in six");
		System.out.println("Input currency in rupees and output in USD.");
		
		double rupees = sc.nextDouble(); 
		double usd = rupees/75; 
		System.out.println("INR: "+rupees+ "\n=");
		System.out.printf("USD: %,.2f",usd);
		System.out.println();
	}
	
	static void seven() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in seven");
		System.out.println("To calculate Fibonacci Series up to n numbers.");
		
		int number = sc.nextInt(); 
		int n1=0, n2=1, n3;
		System.out.print(n1+" "+n2+" ");
		for (int i=2; i<number; ++i) {
			n3 = n2 + n1;
			System.out.print(n3+" ");
			n1 = n2;
			n2 = n3; 
		}
		System.out.println();
	}
	
	static void eight() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in eight");
		System.out.println("To find out whether the given String is Palindrome or not.");
		
		String input, revs=""; 
		input = sc.nextLine();  
		for (int i=input.length()-1; i>=0; i--) {
			revs += input.charAt(i);
		}
		//System.out.println(revs);
		if (revs.equals(input)) {
			System.out.println("its a palindrome string");
		} else {
			System.out.println("not a palindrome string");
		}
		System.out.println();
	}
	
	static void nine() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in nine");
		System.out.println("To find Armstrong Number between two given number.");
		
		System.out.println("Enter the first number");
		int a = sc.nextInt(); 
		System.out.println("Enter the second number");
		int b = sc.nextInt(); 
		for (int i=a; i<=b; i++) {
			int rem, sum=0; 
			int temp = i; 
			while (temp>0) {
				rem = temp % 10; 
				sum += (rem * rem * rem); 
				temp = temp / 10;
			}
			if (i == sum) {
				System.out.println(i+" ");
			}
		}
		System.out.println();
		
		/*int number, rem, sum = 0;
		number = sc.nextInt(); 
		int temp = number;  
		
		while(number > 0) {
			rem = number % 10; 	
			sum += (rem * rem * rem); 
			number /= 10;
		}
		
		if (temp == sum) {
			System.out.println(temp+" ");
		}*/
	}
	
	public static void main(String[] args) {
		System.out.println("in main\n");
		//one();
		//two();
		//three();
		//four();
		//five();
		//six();
		//seven();
		//eight();
		nine();
	}
}
