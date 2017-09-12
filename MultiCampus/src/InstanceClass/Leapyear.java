package InstanceClass;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int year=2010;

String result=(year%4==0)&&(year%100!=0)||(year%400==0)?"윤년":"평년";
System.out.println(result+"입니다.");
	}

}
