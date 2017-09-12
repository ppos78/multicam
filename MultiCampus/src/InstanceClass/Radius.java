package InstanceClass;

import java.util.Scanner;
public class Radius {
	
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double Radius;
		double Area;
		double Length;
		double phi=3.14;

		System.out.print("���� �������� �Է��ϼ���.");
		Radius = scan.nextDouble();

		Area = phi * Radius * Radius;
		Length=2*phi*Radius;
		

		// System.out.println("���� ������");
		// System.out.println(Area);
		// System.out.println("�Դϴ�.");
		System.out.printf("���� ������ %f �Դϴ�.",Area);
		System.out.printf("���� �ѷ��� %f �Դϴ�.",Length);
	}
}
