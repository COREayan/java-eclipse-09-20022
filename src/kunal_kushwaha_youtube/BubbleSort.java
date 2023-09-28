package kunal_kushwaha_youtube;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr = {5, 4, 3, 2, 1};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapped;
		
		// run the steps n-1 times
		for (int i=0; i<n; i++) {
			swapped = false;
			// for each step, max item will come at the last respective index
			for (int j=1; j<n-i; j++) {
				if (arr[j] < arr[j-1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swapped = true;
				}
			}
			
			// if you did not swap for a particular value of i, it means the array is sorted hence stop the program 
			if (!swapped) {
				break;
			}
		}
	}
}
