package Test;
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
//	Scanner s;
//	long now=System.currentTimeMillis();
//	System.out.println(now/1000/60/60/24);
	
//	long start=System.currentTimeMillis();
//	System.out.println("doSomething");
//	long end=System.currentTimeMillis();
//	System.out.println(end-start);
	
//	int num=Integer.parseInt("100");
//	System.out.println(num+100);
	
	Scanner scan=new Scanner(System.in);
	System.out.println("숫자 1 입력하세요");
	String num1=scan.next();
	System.out.println("숫자 2 입력하세요");
	String num2=scan.next();
	
	int n1=Integer.parseInt(num1);	
	int n2=Integer.parseInt(num2);
	
    System.out.println(n1+n2);

	
}
}
