package InstanceClass;

import java.util.Scanner;
public class Transfer {
	
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double rate=1137.25;
		int won;
		double result;

		System.out.print("��ȭ�� �Է��ϼ���?");
	    won = scan.nextInt();

		result= won/rate;	
		System.out.printf("%d���� �޷��� %.2f�޷� �Դϴ�.",won,result);
	}
}
