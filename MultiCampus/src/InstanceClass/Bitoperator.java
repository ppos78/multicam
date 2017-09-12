package InstanceClass;
import java.util.Scanner;
public class Bitoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x= 0x0fff;
//		int y= 0xff0;
//		System.out.printf("%x\n",(x&y));
//		System.out.printf("%x\n",(x|y));
//		System.out.printf("%x\n",(x^y));
//		System.out.printf("%x\n",~x);
//		System.out.printf("%x\n",(x<<4));
//		System.out.printf("%x\n",(x>>4));
		Scanner scan=new Scanner(System.in);
		
		System.out.println("숫자 1을 입력하세요.");
		int num1 = scan.nextInt();
		System.out.println("숫자 2을 입력하세요.");
		int num2 = scan.nextInt();
		System.out.println("숫자 3을 입력하세요.");
		int num3 = scan.nextInt();
		
//		int tmp=num1>num2?num1:num2;
//		int max=num3>tmp?num3:tmp;
//		System.out.println(max);
		int tmp1=num1>num2?num1:num2;
		int tmp2=num1>num3?num1:num3;
		int tmp3=num3>num2?num3:num2;
		
		int tmp4=tmp1<tmp2?tmp1:tmp2;
		int mid=tmp4<tmp3?tmp4:tmp3;
		System.out.println(mid);
		
	}

}
