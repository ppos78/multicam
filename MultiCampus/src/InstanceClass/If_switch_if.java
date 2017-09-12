package InstanceClass;

public class If_switch_if {
	public static void main(String[] args){
		int num=(int)(Math.random()*10)+1;
		
		if(num==1)
			System.out.println("Bananas");
		else if(num==2)
			System.out.println("Oranges");
		else if(num==3)
		{
			System.out.println("Pears");
			System.out.println("Apples");
			System.out.println("Plums");
		}
		else if(num==4)
		{
			System.out.println("Apples");
			System.out.println("Plums");
		}
		else if(num==5)
			System.out.println("Plums");
		else if(num==6)
			System.out.println("Plums");
		else
			System.out.println("Nuts");
}
}