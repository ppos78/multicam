package InnerClassPractice;

public class SportsCar extends Car {
	boolean turbo;
	
	public SportsCar() {
		System.out.println("스포츠카 생성");
	}
	public void speedUp(int increment) {
		if(turbo)
			speed+=2*increment;
		else
			speed+=increment;
	}
	public void setTurbo(boolean newValue) {
		turbo=newValue;
	}
	
	
}
