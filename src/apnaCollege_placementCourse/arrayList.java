package apnaCollege_placementCourse;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			/**/
			System.out.println("3. Take an array of numbers as input and check if it is an array sorted in ascending order.");
			ArrayList<Integer> arr = new ArrayList<Integer>();
			System.out.println("Enter Integers to add to list, Enter -1 to exit");
			int num = sc.nextInt();
			while (num!=-1) {
				arr.add(num);
				num = sc.nextInt();
			}
			System.out.println(arr);
			int chk = 0;
			for (int i=1; i<arr.size(); i++) {
				if (arr.get(i-1)>arr.get(i)) {
					System.out.println("Array is not in sorted ascending order.");
					chk++;
					break;
				}
			}
			if (chk==0) {
				System.out.println("Array is in Sorted in ascending order.");
			}
		}
		
		
		//Homework Problems
		//Try solving all problems of arrays with arraylists.
		/*
		System.out.println("1. Take an array of names as input from the user and print them on the screen.");
		ArrayList<String> list2 = new ArrayList<String>();
		int size = sc.nextInt();
		for (int i=0; i<size; i++) {
			String input = sc.next();
			list2.add(input);
		}
		System.out.println(list2);
		*/
		
		/*
		System.out.println("2. Find the maximum & minimum number in an array of integers. ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter list data | enter -1 to exit");
		int num = sc.nextInt();
		do {
			list.add(num);
			num=sc.nextInt();
		} while (num!=-1);
		System.out.println(list);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i=0; i<list.size(); i++) {
			if (list.get(i)>max) {
				max = list.get(i);
			}
			if (list.get(i)<min) {
				min = list.get(i);
			}
		}
		System.out.println("Maximum of the list : "+max);
		System.out.println("Minimum of the list : "+min);
		*/
	}
}













