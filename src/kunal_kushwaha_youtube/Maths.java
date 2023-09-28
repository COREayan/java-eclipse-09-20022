package kunal_kushwaha_youtube;

import java.util.ArrayList;

public class Maths {

	private static void isPrimeUpto(int n) {
		for (int i=2; i<=n; i++) {
			System.out.println(i + " " + isPrime(i));
		}
	}
	
	private static boolean isPrime(int n) {
		if (n<=1) {
			return false;
		}
		int c = 2;
		while (c*c<=n) {
			if (n % c == 0) {
				return false;
			}
			c++;
		}
		return true;
	}
	
	private static void sieve(int n) {
		boolean[] primes = new boolean[n+1];
		for (int i=2; i*i<=n; i++) {
			if (!primes[i]) {
				for (int j = i * 2; j<=n; j+=i) {
					primes[j] = true;
				}
			}
		}
		for (int i=2; i<=n; i++) {
			if (!primes[i]) {
				System.out.print(i + " ");
			}
		}
	}
	
	private static double sqrt(int n, int p) {
		int start = 0;
		int end = n;
		
		double root = 0.0;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			
			if (mid * mid == n) {
				return mid;
			}
			
			if (mid * mid > n) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		double increment = 0.1;
		for (int i=0; i<p; i++) {
			while (root * root <= n) {
				root += increment;
			}
			root -= increment;
			increment /= 10;
		}
		
		return root;
	}
	
	private static double newtonRaphson(int n) {
		double x = n;
		double root;
		while (true) {
			root = 0.5 * (x + (n/x));
			
			if (Math.abs(root - x) < 0.5) {
				break;
			}
			
			x = root;
		}
		return root;
	}
	
	private static void factors(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i=1; i*i<=n; i++) {
			if (n % i == 0) {
				if (n/i == i) {
					System.out.print(i + " ");
				} else {
					System.out.print(i + " ");
					list.add(n/i);
				}
			}
		}
		for (int i=list.size()-1; i>=0; i--) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		// 	Q1. Find out all the prime numbers between 0 to n.
		/*
		isPrimeUpto(40);
		sieve(40);
		*/
		
		//	Q2. Find Square root of a number.
		/*
		System.out.printf("%.3f",sqrt(40, 3));
		*/
		
		//	Q3. Newton Raphson Method
		/*
		System.out.println(newtonRaphson(40));
		*/
		
		//	Q4. Factors of a Number : 
		factors(40);
	}
}
