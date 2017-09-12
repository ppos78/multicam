package IOPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class AccountReadTest {
public static void main(String[] args)  {
	
	ObjectInputStream in=null;
	try {
		in=new ObjectInputStream( 
				new FileInputStream("account.dat"));
		List<Account>list=(List<Account>)in.readObject();
		for(Account a:list)
			System.out.println(a);
//		Account a=(Account) in.readObject();
//		System.out.println("계좌주:"+a.getOwner());
//		System.out.println("계좌번호:"+a.getAno());
//		System.out.println("계좌주:"+a.getBalance());
		
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	catch(ClassNotFoundException e) {
		e.printStackTrace();
	}finally {
	try {
		if(in!=null)
			in.close();
		
	}catch(IOException e) {
		e.printStackTrace();
		
}
}
}
}

