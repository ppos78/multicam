package InstanceClass;

import java.util.Scanner;

public class Elecfee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double B_FEE_1=910;
		final double B_FEE_2=1600;
		final double B_FEE_3=7300;
		
		final double U_FEE_1=93.3;
		final double U_FEE_2=187.9;
		final double U_FEE_3=280.6;
		final double U_FEE_4=709.5;
		
	Scanner scan = new Scanner(System.in);
    System.out.println("전기 사용량을 입력하세요(kwh)");
    int use=scan.nextInt();
    double fee;
    if(use<=200){
    	fee=910+use*93.3;
    }
    else if(use<=400){
    	fee=1600+200*93.3+(use-200)*187.9;
    }
    else if(use<=1000){
    	fee=7300+200*93.3+200*187.9+(use-400)*280.6;
	}
    else{
    	fee=7300+200*93.3+200*187.9+600*280.6+(use-1000)*709.5;
    	}
	System.out.println(fee);
	}
	
}
