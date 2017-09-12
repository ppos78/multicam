package Interface;

public interface clickable {
	public void onClick();
	}
	class CheckButton implements Clickable,Comparable{
//		class CheckButton implements Clickable{
		public void onClick() {
		System.out.println("클릭되었다");
	}
		public int compareTo(Object o) {
			return 0;
		}
	}
		
	public class InterfaceTest{
		public static void main(String[] args) {
			Clickable c=new CheckButton();
			c.onClick();
		}
	}

