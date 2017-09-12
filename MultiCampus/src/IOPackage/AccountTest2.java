package IOPackage;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class AccountTest2 {
public static void main(String[] args) {
	File file=new File("account.dat");
	List<Account> accountList=new ArrayList<>();
	if(file.exists());{
		ObjectInputStream in=null;
		try {
			in=new ObjectInputStream(
					new FileInputStream(file));
					
			accountList=(List<Account>) in.readObject();
			
		}catch(IOException e) {
			e.printStackTrace();
		}catch( ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(in !=null)
					in.close();
			}catch(IOException e) {
				e.printStackTrace();
		}
}
	}}

	boolean run = true;
Scanner scanner =new Scanner(System.in);
while(run){
	System.out.println("---------------------------------------");
	System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
	System.out.println("---------------------------------------");
	System.out.println("선택>");
	
	int selectNo=scanner.nextInt();
	if(selectNo==1) {
		am.createAccount();
	}else if(selectNo==2) {
		am.accountList();
	}
	}
}

