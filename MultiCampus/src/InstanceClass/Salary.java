package InstanceClass;

import java.util.Scanner;

public class Salary {
public static void main(String[] args){
int[] Salary=new int[2];
Scanner scan = new Scanner(System.in);
System.out.print("직원1의 월급을 입력하시오:");
Salary[0]=scan.nextInt();
System.out.print("직원2의 월급을 입력하시오:");
Salary[1]=scan.nextInt();
System.out.println("직원1의 월급은"+Salary[0]);
System.out.println("직원2의 월급은"+Salary[1]);
}
}
