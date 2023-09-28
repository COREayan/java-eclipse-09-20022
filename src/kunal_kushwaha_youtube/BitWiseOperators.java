package kunal_kushwaha_youtube;

public class BitWiseOperators {

	private static boolean isOdd(int n) {
		return (n & 1)== 1;
	}
	
	private static int singleNumber(int[] arr) {
		int unique = 0;
		for (int i: arr) {
			unique ^= i;
		}
		return unique;
	}
	
	private static int findIthBit(int n, int i) {
		return ((n & (1<<i))>0) ? 1 : 0;
	}
	
	private static int setIthBit(int n, int i) {
		return n | (1<<i);
	}
	
	private static int resetIthBit(int n, int i) {
		return n & (~(1<<i));
	}
	
	private static int rightMostSetBit(int n) {
		int result = 0;
		while ((n&1)!=1) {
			result++;
			n = n>>1;
		}
		return result;
	}
//	
//	private static int singleNumber2(int[] arr) {
//		
//	}
//	
	
	private static int magicNumber(int n) {
		int result = 0;
		int base = 5;
		while (n>0) {
			int lastDigit = n & 1;
			n = n>>1;
			result += lastDigit * base;
			base = base * 5;
		}
		return result;
	}
	
	private static int noOfDigits(int n, int b) {
		return (int) (Math.log(n) / Math.log(b)) + 1;
	}
	
	private static boolean powOfTwo(int n) {
		return (n & (n-1)) == 0;
	}
	
	private static int power(int base, int power) {
		int ans = 1;
		while (power > 0) {
			if ((power & 1) == 1) {
				ans *= base;
			}
			base *= base;
			power = power >> 1;
		}
		return ans;
	}
	
	private static int setBits(int n) {
		int count = 0;
		
//		while (n > 0) {
//			count++;
//			n -= (n & -n);
//		}
		
		while (n > 0) {
			count++;
			n = n & (n-1);
		}
		
		return count;
	}
	
	// this gives xor from 0 to a
	private static int xor(int a) {
		int rem = a % 4;
		switch(rem) {
			case 0:
				return a; 
				
			case 1:
				return 1;
				
			case 2:
				return a+1;
				
			default:
				return 0;
		}
	}
	
	// range xor for a, b = xor(b) ^ xor (a-1)
	private static int rangeXor(int a, int b) {
		int ans = xor (b) ^ xor (a-1);
		return ans;
	}
	
	public static void main(String[] args) {
		//	1. Given a number, find if it is odd or even.
		/*
		System.out.println(isOdd(67));
		*/
		
		// 	2. In a given array, every number appears twice, only one number appears once. Return that one number.
		/*
		int[] arr = {2, 3, 4, 3, 2, 6, 4};
		System.out.println(singleNumber(arr));
		*/
		
		//	3. In a given array, every number appears twice, once with positive and once with negative with it. Only one number
		//		appears just once. Create a function, and return that one number.
		
		//	4. Find the ith bit of a number.
		/*
		System.out.println(findIthBit(7, 1));
		*/
		
		//	5. Set the ith bit
		/*
		System.out.println(setIthBit(16, 1));
		*/
		
		//	6. Reset ith bit
		/*
		System.out.println(resetIthBit(16, 4));
		*/
		
		//	7. Find the position of rightmost set bit
		/*
		System.out.println(rightMostSetBit(16));
		*/
		
		//	8. In a given array, every number appears thrice, only one number appears once. Return that one number.
		/*
		int[] arr = {1, 1, 1, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6};
		System.out.println(singleNumber2(arr));
		*/
		
		// 	9. Find the nth magic no.
		/*
		System.out.println(magicNumber(8));
		*/
		
		//	10. Find number of digits in base b.
		/*
		System.out.println(noOfDigits(10, 3));
		*/
		
		//	11. Pascal's Triangle : Find the sum of nth row.
		// nC0 + nC1 + nC2 + ... nCn = 2^n;
		// For nth row, sum = 2^(n-1)
		
		//	12. You are given a number. find out if its power of 2 or not
		/*
		// Idea mine: get sum of 1's in binary representation. if its 1 then the number is power of 2 and vice versa.
		// Kunal kushwaha idea : 100000 & 011111 = 0 -> 100000 - 1 = 11111 -> 100000 & (100000 - 1) = 0!
		// if n & (n-1) == 0, then the number is power of 2.
		System.out.println(powOfTwo(8));
		*/
		
		// 	13. Calculate a ^ b
		/*
		System.out.println(power(2, 10));
		*/
		
		// 	14. Given a number n, find the no. of set bits in it.
		/*
		int n = 45;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(setBits(n));
		*/
		
		//	15. Find the xor's of number from 0 - a.
		/*
		// If a%4==0 -----> a
		// If a%4==1 -----> 1
		// If a%4==2 -----> a+1
		// If a%4==3 -----> 0
		System.out.println(xor(10));
		*/
		
		//	16. Find the xor of number from a - b.
		System.out.println(rangeXor(3, 9));
	}
}
