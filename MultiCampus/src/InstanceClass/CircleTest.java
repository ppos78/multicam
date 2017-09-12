package InstanceClass;

class Circle {
	int radius;
	static int count;

	public double getArea() {
		return radius * radius * 3.14;
	}
}

public class CircleTest {
	private static int count;
	private int radius;

	public static void main(String[] args) {
		CircleTest c1;
		c1 = new CircleTest();
		c1.radius = 3;
		CircleTest c2;
		c2 = new CircleTest();
		c2.radius = 5;

		CircleTest.count = 2;

	}
}