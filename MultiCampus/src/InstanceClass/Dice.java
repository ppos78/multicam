package InstanceClass;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
while(true)
{
	int dice1=(int)(Math.random()*6)+1;
	int dice2=(int)(Math.random()*6)+1;
	System.out.printf("(%d,%d)\n",dice1,dice2);
	if(dice1+dice2==5)
		break;
}
	}

}
