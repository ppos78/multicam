package Test;

public class Car_test {
public static void main(String[] args) {
//	Car_example mine=new Car_example();
	
	Car_example mine1=new Car_example();
//	System.out.println("제작회사:"+mine.company);
//	System.out.println("모델명:"+mine.model);
//	System.out.println("색깔:"+mine.color);
//	System.out.println("최고속도:"+mine.maxSpeed);
//	System.out.println("현재속도:"+mine.speed);
//    
//	mine.speed=60;
//	System.out.println("수정된 속도:"+mine.speed);

	System.out.println("car1.company:"+mine1.company);
	System.out.println();
	
	Car_example mine2=new Car_example();
	System.out.println("car2.company:"+mine2.company);
	System.out.println("car2.model:"+mine2.model);
	System.out.println();
	
	Car_example mine3=new Car_example("자가용","빨강");
	System.out.println("car3.company:"+mine3.company);
	System.out.println("car3.model:"+mine3.model);
	System.out.println("car3.color:"+mine3.color);
	System.out.println();
	
	Car_example mine4=new Car_example("자가용","빨강",200);
	System.out.println("car4.company:"+mine4.company);
	System.out.println("car4.model:"+mine4.model);
	System.out.println("car4.color:"+mine4.color);
	System.out.println("car4.maxSpeed:"+mine4.maxSpeed);
	System.out.println();
}
}
