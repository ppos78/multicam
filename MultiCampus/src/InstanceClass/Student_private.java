package InstanceClass;

class Private{
	public String name;
	private int score;
	public int age;
	
	public void study(){
		System.out.println(name+"이가 공부합니다.");
		score +=65;
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
	

public class Student_private {
	public static void main(String[] args){
		Private s1=new Private();	
		Private s2=new Private();
	
	s1.name="양";
	s2.name="이유정";
	
	System.out.println(s1.name);
	System.out.println(s2.name);
	
//	System.out.println(s1.score);
//	s1.score=90;
	System.out.println(s2.getScore());
	System.out.println(60);
//	System.out.println(s1.score);
	s2.study();
//	System.out.println(s1.score);
	System.out.println(s2);
	s2.study();
	}
}


	


