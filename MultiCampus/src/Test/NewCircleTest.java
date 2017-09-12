package Test;

public class NewCircleTest {

	private static NewCircle radius;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1=new Point(2,3);
		NewCircle c=new NewCircle();
		System.out.println(c);;
		c.setRadius(10);
		c.setCenter(p1);
		System.out.println(p1);;
		System.out.println(c);
		
		p1.setX(20);
		
		System.out.println(p1);;
		System.out.println(c);
		
//		p1.setY(10);
//		System.out.println(p1);;
//		System.out.println(c);
		
		c.getCenter().setX(15);
		System.out.println(c);
	}

}
