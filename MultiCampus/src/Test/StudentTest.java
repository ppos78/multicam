package Test;

public class StudentTest {
public static void main(String[] args) {
	Student s;
	s=new Student();
	Student s2;
	s2=new Student();
	
	System.out.println(s2.getName());
	s2.setName("Yang");
	System.out.println(s2.getName());
	
//	s= new Student();
//	s.name="Yang";
//	s.age=40;
//	s.score=100;
//	
//	Student s2;
//	s2=new Student();
//	s2.name="Zhe";
//	s2.age=24;
//	s.score=85;
//	
//	System.out.println(s.name);
//	System.out.println(s2.name);
//	s=new Student("Yang",40,100);
//	System.out.println(s.name);
//			
}
}
