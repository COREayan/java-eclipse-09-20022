package junk;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 1. using Array
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] sArr = br.readLine().split(" ");
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(sArr[i]);
		}
		for (int i=1; i<n; i++) {
			int j = i-1;
			int temp = arr[i];
			while (j>=0 && temp <= arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp; 
		}
		
		
		
		// 2. using ArrayList
		
		// 3. using LinkedList
		for (int i=0; i<n; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
