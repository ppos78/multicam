package InstanceClass;

import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final int STUDENTS=5;
int total=0;
Scanner scan=new Scanner(System.in);
int[] scores =new int[STUDENTS];
for(int i=0;i<STUDENTS;i++){
	System.out.print("성적을 입력하시오:");
	scores[i]=scan.nextInt();
}
for(int i=0;i<STUDENTS;i++)
	total += scores[i];
System.out.println("평균성적은"+total/STUDENTS+"입니다");
}
	}


