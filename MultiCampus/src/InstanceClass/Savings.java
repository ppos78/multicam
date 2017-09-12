package InstanceClass;

import java.util.Scanner;

public class Savings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int Salary;
		int Total;

		System.out.print("������ �Է��ϼ���.");
		Salary = scan.nextInt();

		Total = 10 * 12 * Salary;

//		System.out.println("����� 10�Ⱓ ���� ������");
//		System.out.println(Total);
//		System.out.println("�Դϴ�.");
		System.out.printf("����� 10�Ⱓ ���� ������ %d �Դϴ�.",Total);
	}
}
