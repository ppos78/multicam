package InstanceClass;

public class numbers {
public static void main(String[] arg){
//	int[]numbers=new int[5];
//	for(int i=0;i<numbers.length;i++)
//		numbers[i]=(int)(Math.random()*1000);
//	for(int value:numbers)
//		System.out.println(value);
	int[]numbers=new int[6];
	for(int i=0;i<numbers.length;i++)
		numbers[i]=(int)(Math.random()*45)+1;
	for(int value:numbers)
 		System.out.println(value);
}
}
