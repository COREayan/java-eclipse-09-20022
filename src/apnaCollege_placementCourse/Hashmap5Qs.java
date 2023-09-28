package apnaCollege_placementCourse;

import java.util.*;

public class Hashmap5Qs {
	public static void majorityElement(int nums[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int n = nums.length;
		for(int i=0; i<n; i++) {
			if(map.containsKey(nums[i])) { //true
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		} 
		
		for(int key : map.keySet()) {
			if(map.get(key)> n/3) {
				System.out.print(key + " ");
			}
		}
		System.out.println();
	}
	
	public static int union(int arr1[], int arr2[]) {
		HashSet<Integer> set = new HashSet<>();
		
		for (int i=0; i<arr1.length; i++) {
			set.add(arr1[i]);
		}
		
		for (int j=0; j<arr2.length; j++) {
			set.add(arr2[j]);
		}
		
		return set.size();
	}
	
	public static int intersection(int arr1[], int arr2[]) {
		HashSet<Integer> set = new HashSet<>();
		int count = 0;
		
		for(int i=0; i<arr1.length; i++) {
			set.add(arr1[i]);
		}
		
		for(int j=0; j<arr2.length; j++) {
			if(set.contains(arr2[j])) {
				count++;
				set.remove(arr2[j]);
			}
		}
		
		return count;
	}
	
	public static String getStart(HashMap<String, String> tick) {
		HashMap<String, String> revMap = new HashMap<>();
		
		for(String key : tick.keySet()) {
			revMap.put(tick.get(key), key);
		}
		
		for(String key : tick.keySet()) {
			if(!revMap.containsKey(key)) {
				return key;
			}
		}
		
		return null;
	}
	
	public static int subArraySum(int[] arr, int k) {
		HashMap<Integer, Integer> map = new HashMap<>(); // <Sum, Freq>
		
		map.put(0, 1);
		int ans = 0; 
		int sum = 0;
		for(int j=0; j<arr.length; j++) {
			sum += arr[j];
			
			if(map.containsKey(sum-k)) {
				ans += map.get(sum-k);
			}
			
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		/*
		 * 1. Majority Element: Given an integer array of size n, find all elements that appear more than n/3 times.
		 * 	
		 * 	nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1}; n=9
		 *	output : 1
		 *
		 *	nums[] = {1, 2};
		 *	output : 1, 2 
		 * */
		
		/*
		int nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
		int nums1[] = {1, 2};
		majorityElement(nums1);
		*/
		
		/*
		 * 2. Union of 2 arrays
		 * 
		 * arr1 = 7 3 9
		 * arr2 = 6 3 9 2 9 4
		 * output : union = 6 (7, 3, 9, 6, 2, 4)
		 * */
		
		/*
		int arr1[] = {7, 3, 9};
		int arr2[] = {6, 3, 9, 2, 9, 4};
		System.out.println(union(arr1, arr2));
		*/
		
		/*
		 * 3. Intersection of 2 arrays
		 * 
		 * arr1 = {7, 3, 9}
		 * arr2 = {6, 3, 9, 2, 9, 4}
		 * output : intersection = 2(3, 9)
		 * */
		
		/*
		int arr1[] = {7, 3, 9};
		int arr2[] = {6, 3, 9, 2, 9, 4};
		System.out.println(intersection(arr1, arr2));
		*/
		
		/*
		 * 4. Find Itinerary from Tickets
		 * 
		 * "Chennai" -> "Bengaluru"
		 * "Mumbai" -> "Delhi"
		 * "Goa" -> "Chennai"
		 * "Delhi" -> "Goa"
		 * 
		 * "Mumbai" -> "Delhi" -> "Goa" -> "Chennai" -> "Bengaluru"
		 * */
		
		/*
		HashMap<String, String> tickets = new HashMap<>();
		tickets.put("Chennai", "Bengaluru");
		tickets.put("Mumbai", "Delhi");
		tickets.put("Goa", "Chennai");
		tickets.put("Delhi", "Goa");
		
		String start = getStart(tickets);
		
		while(tickets.containsKey(start)) {
			System.out.print(start + " -> ");
			start = tickets.get(start);
		}
		System.out.println(start);
		*/
		
		/*
		 * 5. Subarray sum equal to K
		 * 
		 * arr = {1, 2, 3}, K = 3 
		 * return number of such subarrays
		 * 
		 * ans = 2 (1, 2) (3)
		 * */
		
		int arr[] = {10, 2, -2, -20, 10};
		int k = -10;
		
		System.out.println(subArraySum(arr, k));
	}
}
