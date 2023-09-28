package apnaCollege_placementCourse;

import java.util.ArrayList;

public class Recursion3 {

	public static void printPerm(String str, String permutation) {
		if (str.length() == 0) {
			System.out.println(permutation);
			return;
		}
		for (int i=0; i<str.length(); i++) {
			char currChar = str.charAt(i);
			String newStr = str.substring(0, i) + str.substring(i+1);
			printPerm(newStr, permutation+currChar);
		}
	}
	
	public static int countPaths(int i, int j, int n, int m) {
		if (i==n || j==m) {
			return 0;
		}
		if (i==n-1 && j==m-1) {
			return 1;
		}
		// move downwards
		int downPaths = countPaths(i+1, j, n, m);
		// move right
		int rightPaths = countPaths(i, j+1, n, m);
		
		return downPaths + rightPaths;
	}
	
	public static int placeTiles(int n, int m) {
		if (n==m) {
			return 2;
		}
		
		if (n<m) {
			return 1;
		}
		
		// vertically
		int vertPlacements = placeTiles(n-m, m);
		
		// horizontally
		int horPlacements = placeTiles(n-1, m);
		return vertPlacements + horPlacements;
	}
	
	public static int callGuests(int n) {
		if (n<=1) {
			return 1;
		}
		// single 
		int ways1 = callGuests(n-1);
		
		// pair
		int ways2 = (n-1) * callGuests(n-2);
		return ways1 + ways2;
	}
	
	public static void printSubsets(ArrayList<Integer> subset) {
		for (int i=0; i<subset.size(); i++) {
			System.out.print(subset.get(i) + " ");
		}
		System.out.println();
	}
	
	public static void findSubsets(int n, ArrayList<Integer> subset) {
		if (n==0) {
			printSubsets(subset);
			return;
		}
		
		findSubsets(n-1, subset);
		subset.add(n);
		findSubsets(n-1, subset);
		subset.remove(subset.size()-1);
	}
	
	public static void main(String[] args) {
		/*
		// Q1. Print all permutations of a string
		String str = "abc";
		printPerm(str, "");
		*/
		
		/*
		// Q2. Count total paths in a maze to move from (0,0) to (n,m); moves allowed : right & down only!
		System.out.println(countPaths(0, 0, 3, 3));
		*/
		
		/*
		// Q3. Place Tiles of size 1xm in a floor of size nxm (n=4, m=2)
		System.out.println(placeTiles(4, 2));
		*/
		
		/*
		// Q4. Find the number of ways in which you can invite n people to your party, single or in pairs.
		System.out.println(callGuests(4));
		*/
		
		// Q5. Print all the subsets of a set of first n natural numbers
		findSubsets(3, new ArrayList<Integer>());
	}
}
