package InstanceClass;
import java.util.Scanner;
public class Pay_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    int price;
    System.out.println("금액을 입력하시오");
    price=scan.nextInt();
    System.out.println("만원권:"+(price/10000));
    System.out.println("오천원권:"+(price%10000)/5000);
    System.out.println("천원권:"+(price%5000)/1000);
    System.out.println("오백원권:"+(price%1000)/500);
    System.out.println("백원권:"+(price%500)/100);
	}

}
