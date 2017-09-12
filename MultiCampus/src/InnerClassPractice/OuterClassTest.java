package InnerClassPractice;

class OuterClass {
	private String secret = "Time is money";

	public OuterClass() {
	InnerClass ic=new InnerClass();
	ic.method();
	}

	public class InnerClass {
		private int data;
		public void method() {
		System.out.println(secret);
		}
	}
}

public class OuterClassTest {
public static void main(String[]args) {
	OuterClass o1=new OuterClass();
	OuterClass o2=new OuterClass();
	OuterClass.InnerClass oi=o1.new InnerClass();
	System.out.println(o1);
}}