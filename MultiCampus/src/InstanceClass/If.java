package InstanceClass;

public class If {
	public static void main(String[] args){
		int age=64;
		System.out.println("아침에 일어난다");
//		if(age<65)
//		System.out.println("일을 한다");
//		System.out.println("집에 간다");
		if(age<65)
		{
			int workingHours=8;
			System.out.println(workingHours+"시간 일을 한다");
			System.out.println("많이 한다");
		}
		
		System.out.println("집에 간다");
	}
}
