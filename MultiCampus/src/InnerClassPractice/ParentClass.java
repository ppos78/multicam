package InnerClassPractice;

class ParentClass {
	int data;
	protected int value=200;
//	private int value=200;
	// int data = 100;
	public ParentClass(int data) {
	
	super();
	this.data=data;
}
	public void print() {
		System.out.println("ParentClass,data:" + data);
	}
}

class ChildClass extends ParentClass {
	int data = 200;
    public ChildClass() {
    	super(100);
    }
	public void print() {
		System.out.println(value);
		int data=300;
		super.print();
		System.out.println("_____________________");
		System.out.println("local data:"+data);
		System.out.println("this data:"+this.data);
		System.out.println("super data:"+super.data);
	}
}
class OverrideTest {
	public static void main(String[] args) {
	ChildClass c=new ChildClass();
	}
}