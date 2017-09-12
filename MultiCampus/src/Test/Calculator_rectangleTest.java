package Test;

public class Calculator_rectangleTest {
public static void main(String[] args) {
	Calculator_rectangle myCal=new Calculator_rectangle();
	
	double result1=myCal.areaRectangle(10);
	double result2=myCal.areaRectangle(10,20);
	
	System.out.println("정사각형 넓이="+result1);
	System.out.println("직사각형 넓이="+result2);
			
	
}
}
