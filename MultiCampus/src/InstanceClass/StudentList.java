package InstanceClass;

class Student{
	public String name;
//	public int score;
	public int score;
	public int age;
	
	public void study(){
		System.out.println(name+"이가 공부합니다.");
		score +=10;
	}
	public String toString(){
		return "이름:"+name+"\t점수:"+score+"\t나이:"+age;
	}
		
    public int getScore(){
    	return score;
        }
	public void setScore(int s){
		score=s;
	}
	}
	

public class StudentList {
	public static void main(String[] args){
	Student s1=new Student();	
	Student s2=new Student();
	
	s1.name="양";
	s2.name="최";
	
	System.out.println(s1.name);
	System.out.println(s2.name);
	
	System.out.println(s1.score);
	s1.score=90;
	System.out.println(s1.score);
	s1.study();
	System.out.println(s1.score);
	System.out.println(s1);
	}
}


	

	
	