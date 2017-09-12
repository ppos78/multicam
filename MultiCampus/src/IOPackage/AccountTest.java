package IOPackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AccountTest {
public static void main(String[] args) {
	Account a=new Account();
	a.setAno("0010");
	a.setOwner("Yang");
	a.setBalance(2300);
	
	ObjectOutputStream out=null;
	try {
		out=new ObjectOutputStream( 
				new FileOutputStream("account.dat"));
		
		out.writeObject(a);
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
