package Test;

public class NewCircle {

	private int radius;
	private Point center;
	public NewCircle() {
		radius=0;
		center=new Point();
	}
	
	public NewCircle(int radius, Point center) {
		this.radius=radius;
		this.center=center;
	}
	
	final static double pi=3.14;	
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
//		this.center = center;
	    int x=center.getX();
		this.center.setX(x);
		this.center.setY(center.getY());
		
		
}
	@Override
	public String toString() {
		return "NewCircle [radius=" + radius + ", center=" + center + "]";
	}
}