package InstanceClass;

import java.util.Scanner;

public class Tax {
public static void main(String args[]){
	int income;
	int tax;
	System.out.print("과세 표준 금액을 입력하시오:");
	Scanner input = new Scanner(System.in);
	income=input.nextInt();
	if(income<=1000)
		tax=(int)(0.09*income);
else if(income<=4000)
	    tax=(int)(0.18*income);
else if(income<=8000)
    tax=(int)(0.27*income);
else 
    tax=(int)(0.36*income);
System.out.println("소득세는"+tax+"입니다.");
}
}
