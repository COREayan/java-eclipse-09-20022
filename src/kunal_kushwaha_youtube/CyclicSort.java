package kunal_kushwaha_youtube;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		//System.out.println("hello world");
		int[] arr = {3, 5, 2, 1, 4};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	private static void sort(int[] arr) {
		int i=0;
		while (i<arr.length) {
			int correct = arr[i] - 1;
			if (arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
	}

	private static void swap(int[] arr, int first, int second) {
		// TODO Auto-generated method stub
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
