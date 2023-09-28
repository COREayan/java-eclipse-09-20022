package apnaCollege_placementCourse;

class Pen{
	String color;
	String type;
	
	public void write() {
		System.out.println("writing something");
	}
	
	public void printColor() {
		System.out.println(this.color);
	}
}

class Student{
	String name;
	int age;
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	// Default consturctor
//	Student() {
//		System.out.println("Constructor called");
//	}
//	
	
	// Parameterized Constructor
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Copy Constructor
	Student(Student s3) {
		this.name = s3.name;
		this.age = s3.age;
	}
	
	public void printInfo(String name) {
		System.out.println(name);
	}
	
	public void printInfo(int age) {
		System.out.println(age);
	}
	
	public void printInfo(String name, int age) {
		System.out.println(name + " " + age);
	}
	
}

public class oops1 {
	public static void main(String[] args) {
		/*
		Pen pen1 = new Pen();
		pen1.color = "blue"; 
		pen1.type = "gel";
		pen1.write();
		
		Pen pen2 = new Pen();
		pen2.color = "black";
		pen2.type = "ballpoint";
		pen2.printColor();
		*/
		
//		Student s1 = new Student();
//		s1.name = "Shradha";
//		s1.age = 22;
//		s1.printInfo();
		
		Student s2 = new Student("aman", 24);
//		s2.printInfo();
	
		Student s4 = new Student(s2);
		s4.printInfo();
		
	}
}
