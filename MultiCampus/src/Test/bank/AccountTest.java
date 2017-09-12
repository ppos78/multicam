package Test.bank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		
		AccountManager am = new AccountManager();
		
		am.init();
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				System.out.println("----------계좌생성----------");
				System.out.print("계좌번호 : ");
				String ano = scanner.next();
				System.out.print("계좌주 : ");
				String owner = scanner.next();
				System.out.print("초기잔고 : ");
				int balance = scanner.nextInt();
				am.addAccount(ano, owner, balance);
				
			} else if (selectNo == 2) {
				System.out.println("----------계좌목록----------");
				for( Account a : am.getAccountList())
					System.out.println(a);
			} else if (selectNo == 3) {
			} else if (selectNo == 4) {
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		
		am.save();
		
		
		
	}
}







