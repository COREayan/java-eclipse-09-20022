package apnaCollege_placementCourse;

import java.util.*;

public class arraysIntroduction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Arrays in Java are like a list of elements of the same type i.e. a list of integers, a list of booleans etc.
		 * 
		 * 3 Methods to Create an Array
		 * 
		 * =>	a) with new keyword
		 * 		int[] marks = new int[3];
		 * 		marks[0] = 97;
		 * 		marks[1] = 98;
		 * 		marks[2] = 95;
		 * 
		 * => 	b) int[] marks = {98, 97, 95};
		 * 
		 * =>	c) Taking an array as an input and printing its elements.
		 * 
//				import java.util.*;
//				
//				public class Arrays {
//					public static void main(String args[]) {
//						Scanner sc = new Scanner(System.in);
//						int size = sc.nextInt();
//						int numbers[] = new int[size];
//						
//						for (int i=0; i<size; i++) {
//							numbers[i] = sc.nextInt();
//						}
//						
//						//print the numbers in array
//						for (int i=0; i<numbers.length; i++) {
//							System.out.print(numbers[i] + " ");
//						}
//					}
//				}
		 * */
		
		/*
		System.out.println();
		System.out.println("1. Take an array of names as input from the user and print them on the screen.");
		int size = sc.nextInt();
		String names[] = new String[size];
		for (int i=0; i<size; i++) {
			names[i] = sc.next();
		}
		for (int i=0; i<names.length; i++) {
			System.out.println("name " + (i+1) + " is : " + names[i]);
		}
		*/
		
		/*
		System.out.println();
		System.out.println("2. Find the maximum & minimum number in an array of integers. ");
		int size = sc.nextInt();
		int numbers[] = new int[size];
		for (int i=0; i<size; i++) {
			numbers[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			} 
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		*/
		
		System.out.println();
		System.out.println("3. Take an array of numbers as input and check if it is an array sorted in ascending order.");
		int size = sc.nextInt();
		int[] numbers = new int[size];
		for (int i=0; i<size; i++) {
			numbers[i] = sc.nextInt();
		}
		
		boolean isAscending = true;
		for (int i=0; i<numbers.length-1; i++) {
			if (numbers[i] > numbers[i+1]) {
				isAscending = false;
			}
		}
		
		if (isAscending) {
			System.out.println("The array is sorted in ascending order");
		} else {
			System.out.println("The array is not sorted in ascending order");
		}
		
	}
}

