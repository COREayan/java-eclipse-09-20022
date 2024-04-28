package apnaCollege_placementCourse;
import java.util.*;

public class strings {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
		}
		
		// Declaration
		String name = "Ayanabha";
		
		// Taking Input
//		String input = sc.next();
		
		// Concatenation (Joining 2 Strings)
		String firstName = "Tony";
		String secondName = "Stark";
		
		String fullName = firstName + " " + secondName;
		System.out.println(fullName);
		
		// Print length of a String 
		System.out.println("Length of the string : " + fullName.length());
		
		// Access characters of a string
		for (int i=0; i<fullName.length(); i++) {
			System.out.print(fullName.charAt(i)+" ");
		}
		System.out.println();
		
		//compare 2 strings
		String name1 = "Tony";
		String name2 = "Tony";
		
		if (name1.equals(name2)) {
			System.out.println("They are the same string");
		} else {
			System.out.println("They are different strings");
		}
		
		// DO NOT USE == to check for string equality 
		// Gives correct answer here
		if (name1 == name2) {
			System.out.println("They are the same string");
		} else {
			System.out.println("They are different strings");
		}
		
		// Gives incorrect answer here
		if (new String("Tony") == new String("Tony")) {
			System.out.println("They are the same string");
		} else {
			System.out.println("They are different strings");
		}
		
		// The substring of a string is a subpart of it.
		System.out.println(name.substring(0,4));
		
		// ParseInt Method of Integer class
		String str = "123";
		int number = Integer.parseInt(str);
		System.out.println(number);
		
		//ToString Method of String class
		number++;
		str = Integer.toString(number);
		System.out.println(str);
		System.out.println(str.length());
		
		
		// HOMEWORK PROBLEMS
		/*
		 * 	1.	Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
		 * */
		
		/*
		 * 2.	Input a string from the user. Create a new string called 'result' in which you will replace the letter 'e' in the original string
		 * 	with letter 'e' in the original string with letter 'i'.
		 * 
		 * */
		/*
		String input2 = sc.next();
		String result2 = "";
		for (int i=0; i<input2.length(); i++) {
			if (input2.charAt(i)=='e') {
				result2 += 'i';
			} else {
				result2 += input2.charAt(i);
			}
		}
		System.out.println(result2);
		*/
		
		/*
		 * 3.	Input an email from the user. You have to create a username from the email by deleting the part that comes after '@'. Display that
		 * 	username to the user. 
		 * 	Example:
		 * 		email = "apnaCollegeJava@gmail.com"; username = "apnaCollegeJava"
		 * 		email = "helloWorld123@gmail.com"; username = "helloWorld123"
		 * */
		/*
		String input3 = sc.nextLine();
		String username = "";
		for (int i=0; i<input3.length(); i++) {
			if (input3.charAt(i)=='@') {
				break;
			} else {
				username+=input3.charAt(i);
			}
		}
		System.out.println(username);
		*/
		
	}
}










