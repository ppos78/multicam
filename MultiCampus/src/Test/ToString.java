package Test;
import java.util.Scanner;

public class ToString {
public static void main(String[] args) {
	String a="Hello";
	String b="World";
	String c="Welcome";
	String d="to Hell";
//	String e=a+b;
//	String f=e+c;
//	String g=f+d;
//	String h=g+d;
//	
//	System.out.println(g);
//	System.out.println(a+b+c+d);
	StringBuffer sb= new StringBuffer();
	sb.append(a).append(b).append(c).append(d);
//	sb.append(a);
//	sb.append(b);
//	sb.append(c);
//	sb.append(d);
	String result=sb.toString();
	System.out.println(result);
	
	
}
}
