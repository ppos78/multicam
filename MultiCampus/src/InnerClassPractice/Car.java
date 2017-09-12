package InnerClassPractice;

public class Car {

	public int speed;
	public int gear;
	public String color;
	
	public Car() {
		System.out.println("자동차생성");
	}
	public void setGear(int newGear) {
		this.gear=newGear;
		
	}
	public void speedup(int increment) {
		speed+=increment;
	}
	public void speedDown(int decrement) {
		speed-=decrement;
	}
}
