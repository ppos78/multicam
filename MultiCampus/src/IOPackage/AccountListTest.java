package IOPackage;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class AccountListTest {



public static void main(String[] args) {
	List<Account> list=new ArrayList<>();
	Account a=new Account();
	a.setAno("0010");
	a.setOwner("Yang");
	a.setBalance(2300);
	list.add(a);
	a=new Account();
	a.setAno("1234");
	a.setOwner("Hong");
	a.setBalance(2000);	
	list.add(a);
	
	
	ObjectOutputStream out=null;
	try {
		out=new ObjectOutputStream( 
				new FileOutputStream("account.dat"));
		
		out.writeObject(list);
		out.flush();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	finally {
		try {
			if(out!=null)
				out.close();
			
		}catch(IOException e) {
			e.printStackTrace();
			
	}
}
}
}
