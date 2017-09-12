package InstanceClass;

import java.util.*;
public class Simpleprintf {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("나이 몸무게 키 혈액형을 입력하시오.");
	byte age=s.nextByte();
	int weight=s.nextInt();
	double height=s.nextDouble();
	String blood=s.next();
	
	System.out.printf("나이:%d,몸무게:%d,",age,weight);
   	System.out.printf("키:%f,혈액형:%s",height,blood);	
}
}
