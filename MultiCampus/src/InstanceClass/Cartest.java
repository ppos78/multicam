package InstanceClass;

public class Cartest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		Car yourCar = new Car();
		myCar.speed = 80;
		yourCar.speed = 90;
		myCar.mileage = 240000;
		yourCar.mileage = 10000;
		myCar.color = "White";
		yourCar.color = "Black";
		System.out.println(myCar.toString());
		System.out.println(yourCar);
	}

}
