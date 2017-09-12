package InstanceClass;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int score = 85;
//char grade=(score>90)?'A':(score>80)?'B':'C';
char grade=(score>90)?'A':(score>80)?'B':(score>70)?'C':(score>60)?'D':'F';
System.out.println(grade);


	}

}
