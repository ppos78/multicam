package InstanceClass;

import java.util.Scanner;
public class ScannerTest {


	public static void main(String[] args) {
		System.out.println("정수 2개를 입력하세요");
		Scanner scan = new Scanner(System.in);

		int i = scan.nextInt();
		int j = scan.nextInt();
		System.out.println("두 수의 합은" + (i + j) + "입니다");
	}
}
