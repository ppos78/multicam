package Test;

public class Calculator {

//	void powerOn() {
//		System.out.println("전원을 켭니다.");
//		
//	}
//	
//	static double pi=3.14159;
	
	static int plus(int x, int y) {
		int result=x+y;
		return result;
	}
	
	double avg(int x,int y) {
		double sum=plus(x,y);
		double result=sum/2;
		return result;
	}
	void execute() {
		double result=avg(7,10);
		println("실행결과:"+result);
	}
	
	void println(String message) {
		System.out.println(message);
		
	}
//	static double divide(int x, int y) {
//		double result=(double)x/(double)y;
//		return result;
//	
//	}
//	
//	static int minus(int x, int y) {
//		return x-y;
//	}
//	
//	void powerOff() {
//		System.out.println("전원을 끕니다");
//	}
}
