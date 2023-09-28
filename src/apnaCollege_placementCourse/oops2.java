package apnaCollege_placementCourse;

class Shape {
	String color;
}

class Triangle extends Shape {
	public void area(int l, int h) {
		System.out.println(1/2*l*h);
	}
}

class EquilateralTriangle extends Triangle {
//	public void area(int l, int h) {
//		System.out.println(1/2*l*h);
//	}
	int side;
}

public class oops2 {
	public void main(String args[]) {
		Triangle t1 = new Triangle();
		t1.color = "red";
	}
}
