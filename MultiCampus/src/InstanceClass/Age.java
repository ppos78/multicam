package InstanceClass;

import java.util.Scanner;
public class Age {
	
			public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);

			int Age;
			int Result;
		
			System.out.print("����� ���̴�?");
			Age = scan.nextInt();	
			Result = (Age/10)*10;

			System.out.printf("����� ���̴�� %d �Դϴ�.",Result);
		}
	}

