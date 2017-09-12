package Test;

public class Car_example {

	String company="현대자동차";
	String model="그랜저";
	String color="검정";
	int maxSpeed=350;
    int speed;

    Car_example(){
       }
    Car_example(String model){
//    	this.model=model;
    	this(model,"은색",250);
    }
    Car_example(String model, String color){
//    	this.model=model;
//    	this.color=color;
    	this(model,color,250);
    }
    Car_example(String model, String color, int maxSpeed){
    	this.model=model;
    	this.color=color;
    	this.maxSpeed=maxSpeed;
}
}





