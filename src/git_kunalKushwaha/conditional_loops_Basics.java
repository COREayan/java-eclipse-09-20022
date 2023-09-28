package git_kunalKushwaha;

import java.util.Scanner;

public class conditional_loops_Basics {
	
	static void one() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in one");
		System.out.println("Area Of Circle Java Program");
		
		System.out.println("Enter the radius of the circle");
		double radius = sc.nextDouble();
		double area = ((22.0/7.0) * radius * radius);
		System.out.print("Area of a circle, with a radius of " + radius + " is : ");
		System.out.printf("%,.2f",area);
	}
	
	static void two() {
		Scanner sc = new Scanner(System.in); 
		System.out.println("in two");
		System.out.println("Area Of Triangle");
		
		System.out.println("Enter three sides of triangle");
		double a = sc.nextDouble(); 
		double b = sc.nextDouble();  
		double c = sc.nextDouble();  
		
		if ((a<0) || (b<0) || (c<0) || (a>(b+c)) || (b>(a+c)) || (c>(a+b)) ) {
			System.out.println("Triangle doesnt exists");
		} else {
			double s = (a + b + c) / 2;
			double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
			System.out.print("Area of the Triangle: ");
			System.out.printf("%,.2f",area);
		}
	}
	
	static void three() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in three");
		System.out.println("Area Of Rectangle Program");
		
		System.out.println("Enter the length and breadth");
		double l = sc.nextDouble();  
		double b = sc.nextDouble();  
		double area = l * b;  
		System.out.printf("Area of the Rectangle: %,.2f",area);
	}
	
	static void four() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in four");
		System.out.println("Area of Isosceles Triangle");
		
		System.out.println("Enter the length of Same Side: \t");
		double a = sc.nextDouble();  
		System.out.println("Enter the length of Other Side: \t");
		double b = sc.nextDouble();  
		double area = (double)((b/4)*Math.sqrt((4*a*a)-(b*b)));
		System.out.printf("Area of Isosceles Triangle:\t%,.2f",area);
	}
	
	static void five() {
		Scanner sc = new Scanner(System.in);  
		System.out.println("in five");
		System.out.println("Area Of Parallelogram");
		
		double h = sc.nextDouble(); 
		double b = sc.nextDouble(); 
		double area = (double)(h*b);
		System.out.printf("Area of the Paralleogram: %,.2f",area);
		System.out.println();
	}
	
	static void six() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in six");
		System.out.println("Area Of Rhombus");
		
		System.out.println("Enter the first diagonal of Rhombos: ");
		double d1 = sc.nextDouble();  
		System.out.println("Enter the second diagonal");
		double d2 = sc.nextDouble();  
		double area = (double)((d1*d2)/2);  
		System.out.printf("Area of the Rhombos: %,.2f",area);
		System.out.println();
	}
	
	static void seven() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in seven");
		System.out.println("Area Of Equilateral Triangle");
		
		System.out.println("Enter the length of the Triangle");
		double a = sc.nextDouble(); 
		double area = (Math.sqrt(3)*a)/4;  
		System.out.printf("Area of that Triangle: %.2f",area);
		System.out.println();
	}
	
	static void eight() {
		Scanner sc = new Scanner(System.in); 
		System.out.println("in eight");
		System.out.println("Perimeter Of Circle");
		
		System.out.println("Enter the radius of the Circle");
		double radius = sc.nextDouble();
		double perimeter = (2*22*radius)/7;  
		System.out.printf("Perimeter of the circle: %.3f", perimeter);
		System.out.println();
	}
	
	static void nine() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in nine");
		System.out.println("Perimeter Of Equilateral Triangle");
		
		System.out.println("Enter the magnitude of any side of the Triangle");
		double a = sc.nextDouble(); 
		double perimeter = 3*a;  
		System.out.printf("Perimeter of the Triangle: %.3f",perimeter);
		System.out.println();
	}
	
	static void ten() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in ten");
		System.out.println("Perimeter Of Parallelogram");
		
		System.out.println("Enter the magnitude of the two side of paralleogram");
		double a = sc.nextDouble();  
		double b = sc.nextDouble(); 
		double perimeter = 2*(a+b);
		System.out.printf("Perimeter of the parallelogram: %.2f", perimeter);
		System.out.println();
	}
	
	static void eleven() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in eleven");
		System.out.println("Perimeter Of Rectangle");

		System.out.println("Enter the magnitude of the two side of rectangle");
		double a = sc.nextDouble();  
		double b = sc.nextDouble(); 
		double perimeter = 2*(a+b);
		System.out.printf("Perimeter of the rectangle: %.2f", perimeter);
		System.out.println();
	}
	
	static void twelve() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in twelve");
		System.out.println("Perimeter Of Square");
		
		System.out.println("Enter the side of the square"); 
		double a = sc.nextDouble();  
		double perimeter = 4 * a;  
		System.out.printf("Perimeter of the square %.2f",perimeter);
		System.out.println();
	}
	
	static void thirteen() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in thirteen");
		System.out.println("Perimeter Of Rhombus");
		
		System.out.println("Enter the side of the rhombus"); 
		double a = sc.nextDouble();  
		double perimeter = 4 * a;  
		System.out.printf("Perimeter of the rhombus %.2f", perimeter);
		System.out.println();
	}
	
	static void fourteen() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in fourteen");
		System.out.println("Volume Of Cone");
		
		System.out.println("Enter the radius of Cone");
		double r = sc.nextDouble();  
		System.out.println("Enter the height of Cone");
		double h = sc.nextDouble();  
		double volume = (double)(22 * r * r * h)/21;  
		System.out.printf("Volume of the cone: %.2f", volume);
		System.out.println();
	}
	
	static void fifteen() {
		Scanner sc = new Scanner(System.in);  
		System.out.println("in fifteen");
		System.out.println("Volume Of Prism");
		
		/* in progress */
	}
	
	static void sixteen() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in sixteen");
		System.out.println("Volume Of Cylinder");
		
		/* in progress */
	}
	
	static void seventeen() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in seventeen");
		System.out.println("Volume Of Sphere");
		
		/* in progress */
	}
	
	static void eighteen() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in eighteen");
		System.out.println("Volume Of Pyramid");
		
		/* in progress */
	}
	
	static void nineteen() {
		Scanner sc = new Scanner(System.in);  
		System.out.println("in nineteen");
		System.out.println("Curved Surface Area Of Cylinder");
		
		/* in progress */
	}
	
	static void twenty() {
		Scanner sc = new Scanner(System.in);  
		System.out.println("in twenty");
		System.out.println("Total Surface Area Of Cube");
		
		/* in progress */
	}
	
	static void twentyone() {
		Scanner sc = new Scanner(System.in);  
		System.out.println("in twentyone");
		System.out.println("Fibonacci Series In Java Programs");
		
		System.out.println("Enter a number:");
		int n = sc.nextInt();  
		int n0=0, n1=1, tn; 
		System.out.print(n0+" "+n1);
		for (int i=2; i<n; ++i) {
			tn = n0 + n1;
			System.out.print(" "+tn);
			n0 = n1;  
			n1=tn;
		}
		System.out.println();
	}
	
	static void twentytwo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in twentytwo");
		System.out.println("Subtract the Product and Sum of Digits of an Integer");
		
		int n = sc.nextInt(); 
		int product=1, sum=0;
		int temp = n;
		while (temp>0) {
			int digit = temp % 10;  
			product *= digit;   
			sum += digit;   
			temp /= 10;  
		}
		System.out.println("Difference between the product and sum of digits of Integer = "+(product - sum));
		
	}
	
	static void twentythree() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in twentythree");
		System.out.println("Input a number and print all the factors of that number (use loops).");
		
		int number = sc.nextInt(); 
		System.out.println("Factors of "+number+" : ");
		for (int i=1; i<= number; i++) {
			if (number%i == 0) {
				System.out.print(i+"    ");
			}
		}
	}
	
	static void twentyfour() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in twentyfour");
		System.out.println("Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)");
		
		int n = -1;
		int sum = 0;
		do {
			n = sc.nextInt();
			sum += n;
		} while (n!=0);
		System.out.println(sum);
	}
	
	static void twentyfive() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in twentyfive");
		System.out.println("Take integer inputs till the user enters 0 and print the largest number from all.");
		
		int n = -1;
		int largest = -1;
		do {
			n = sc.nextInt();
			if (n>largest) {
				largest = n;
			}
		} while (n!=0);
		System.out.println("Largest Number : "+largest);
	}
	
	static void twentysix() {
		Scanner sc = new Scanner(System.in);
		System.out.println("in twenty six");
		System.out.println("Addition Of Two Numbers");
	}
	
	public static void main(String[] args) {
		System.out.println("in main\n");
		//one();
		//two();
		//three();
		//four();
		//five();
		//six();
		//seven(); 
		//eight();
		//nine();
		//ten();
		//eleven();
		//twelve();
		//thirteen();  
		//fourteen();
//		fifteen();
//		sixteen();  
//		seventeen();  
//		eighteen();  
//		nineteen();  
//		twenty();
		//twentyone();
		//twentytwo();
		//twentythree();
		//twentyfour();
		//twentyfive();
//		twentysix();
	}
}
