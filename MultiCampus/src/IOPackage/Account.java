package IOPackage;

import java.io.Serializable;

public class Account implements Serializable{
	
	
/**
	 * 
	 */
	private static final long serialVersionUID = 9193507396168997313L;

String ano;
private String owner;
private int balance;
public String getAno() {
	return ano;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public void setAno(String ano) {
	this.ano = ano;
}
@Override
public String toString() {
	return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
}

}
