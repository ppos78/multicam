package Test;

public class CarEx_test {
public static void main(String[] args) {
	CarEx myCar=new CarEx();
	myCar.keyTurnOn();
	myCar.run();
	int speed=myCar.getSpeed();
	System.out.println("현재 속도:"+speed+"km/h");
}
}
