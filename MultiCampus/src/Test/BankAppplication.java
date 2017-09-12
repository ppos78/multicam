package Test;
import java.util.Scanner;

public class BankAppplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int numOfAccounts = 0;

	public static void main(String[] args) {
		AccManager am=new AccManager();
		boolean run = true;
		while (run) {
			System.out.println("______________________________________");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.충금 | 5.종료");
			System.out.println("______________________________________");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				am.createAccount();
			} else if (selectNo == 2) {
				am.accountList();
			} else if (selectNo == 3) {
				am.deposit();
			} else if (selectNo == 4) {
				am.withdraw();
			} else if (selectNo == 5) {
				am.run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		System.out.println("_____");
		System.out.println("계좌생성");
		System.out.println("_____");
		System.out.println("계좌번호:");
		String ano = scanner.next();
		System.out.println("계좌주:");
		String owner = scanner.next();
		System.out.println("초기입금액:");
		int balance = scanner.nextInt();
		Account account = new Account(ano, owner, balance);
		accountArray[numOfAccounts] = account;
		numOfAccounts++;
		System.out.println("결과:계좌가 생성되었습니다.");
	}

	private static void accountList() {
		System.out.println("______");
		System.out.println("계좌목록:");
		System.out.println("______");
		for(int i=0;i<numOfAccounts;i++) {
			String ano=accountArray[i].getAno();
			String owner=accountArray[i].getOwner();
			int balance=accountArray[i].getBalance();
			System.out.println(ano+"\t"+owner+"\t"+balance);
	}
	}

	private static void deposit() {
		System.out.println("예금:");
		System.out.println("___ ");
		System.out.println("계좌번호:");
		String ano = scanner.next();
		Account a = findAccount(ano);
		if (a == null)
			System.out.println("계좌가 존재하지 않습니다.");
		else {
			System.out.println("예금액:");
			int amount = scanner.nextInt();
			a.setBalance(a.getBalance() + amount);
		}
		System.out.println("결과:예금이 성공되었습니다.");
	}

	private static void withdraw() {
		System.out.println("출금:");
		System.out.println("___ ");
		System.out.println("계좌번호:");
		String ano = scanner.next();
		Account a = findAccount(ano);
		if (a == null)
			System.out.println("계좌가 존재하지 않습니다.");
		else {
			System.out.println("출금액:");
			int amount = scanner.nextInt();
			if (a.getBalance() > amount) {
				a.setBalance(a.getBalance() + amount);
				System.out.println("결과:예금이 성공되었습니다.");
			} else
				System.out.println("결과: 잔액이 부족합니다.");
		}
	}

	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < numOfAccounts; i++) {
			if (ano.equals(accountArray[i].getAno()))
				account = accountArray[i];
		}
		return account;
	}

}

	