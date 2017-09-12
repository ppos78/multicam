package InstanceClass;

public class Car {

    public int speed;
    public int mileage;
    public String color;
    
    public void speedUp(){
    	speed +=10;
	}
public void speedDown(){
	speed-=10;
}
    
     public String toString(){
	 return "속도:"+speed+"주행거리:"+mileage+"색상:"+color;
	}
}
