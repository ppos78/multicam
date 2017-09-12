package InstanceClass;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    System.out.print("숫자 1 입력:");
    int x=scan.nextInt();
    System.out.print("숫자 2 입력:");
    int y=scan.nextInt();
    
    int r;
    while(y!=0){
    	r=x%y;
    	x=y;
    	y=r;
    }
	System.out.println("최대공약수:"+x);
	}
	

}
