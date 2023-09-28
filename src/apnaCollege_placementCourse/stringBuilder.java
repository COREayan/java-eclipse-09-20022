package apnaCollege_placementCourse;
import java.util.Scanner;
import java.util.Collections;

public class stringBuilder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Declaration
		StringBuilder sb = new StringBuilder("Apna College");
		System.out.println(sb);
		
		// Get a Character from Index
		System.out.println(sb.charAt(0));
		
		// Set a Character at Index
		sb.setCharAt(0,'a');
		System.out.println(sb);
		
		// Insert a character at Some Index
		sb.insert(0, 's');
		System.out.println(sb);
		
		// Delete char at some Index
		sb.delete(0, 1);
		System.out.println(sb);
		
		// Append a char
		sb.append(" Tony");
		System.out.println(sb);
		
		// Print Length of string
		System.out.println("Length of the String : "+sb.length());
		
		//Reverse a String
		for (int i=0; i<sb.length()/2; i++) {
			int front = i;
			int back = sb.length()-i-1;
			
			char frontChar = sb.charAt(front);
			char backChar = sb.charAt(back);
			
			sb.setCharAt(front, backChar);
			sb.setCharAt(back, frontChar);
		}
		System.out.println(sb);
		
		
	}
}
