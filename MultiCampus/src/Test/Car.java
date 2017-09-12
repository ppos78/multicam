package Test;

public class Car {
//public int speed;
private int speed;
//public int mileage;
private int mileage;
//public String color;
private String color;

public Car() {
	System.out.println("객체 생성자");
	speed=mileage=0;
	color="Pink";
}

public Car(int s, int m, String c) {
	speed=s;
	mileage=m;
	color=c;
}

public Car(String c) {
	this(0,0,c); 
}

public void setSpeed(int s) {
	speed=s;
}

public void setMileage(int m) {
	mileage=m;
}
public void setColor(String c) {
	color=c;
}

public void setSpeed(double s) {
//	speed +=(int)s;
	speed +=(int)(s+0.5);
}
public int getSpeed() {
	return speed;
}

public int getMileage() {
	return mileage;
}

public String getColor() {
	return color;
}


public void speedUp() {
	speed+=10;
}
public void speedDown(){
	speed-=10;
}
public String toString() {
	return"�ӵ�:"+speed+"\t����Ÿ�:"+mileage+"\t����:"+color;
}
}
