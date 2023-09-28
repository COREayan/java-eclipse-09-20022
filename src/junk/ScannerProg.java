package junk;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ScannerProg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		System.out.println(a + " " + b + " " + c + " " + s);
		
		// Space Separated Array input
//		List<Integer> list = new ArrayList<Integer>();
//		while (sc.hasNextInt()) {
//			list.add(sc.nextInt());
//		}
//		int[] arr = list.toArray();
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (scanner.hasNextInt())
		  list.add(scanner.nextInt());
		
	}
}
