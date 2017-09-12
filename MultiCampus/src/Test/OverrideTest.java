package Test;


class ParentClass {
	int data = 100;

	public void print() {
		System.out.println("ParentClass,data:" + data);
	}
	public void print2() {

		System.out.println("ParentClass,data:" + data);
	
	}
	public void print3() {

		System.out.println("ParentClass,data:" + data);
	
	}
	
}

class ChildClass extends ParentClass {
	int data = 200;

	@Override
	public void print() {
		int data = 300;
		super.print();
		System.out.println("________________________");
		System.out.println("local data:" + data);
		System.out.println("this data:" + this.data);
		System.out.println("super data:" + super.data);
	}
}

public class OverrideTest {
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		
		c.print();
		//c.data= 600;
	}
}