package Test;


public class WorkerTest {

	public static void main(String[] args) {
			
		Salary sal=new Salary(280,40);
		Worker w1=new Worker();
		w1.setName("이유정");
		w1.setSalary(sal);
		w1.setPosition("사원");
		
	
		sal.setBasicFee(420);
		sal.setCommission(60);
		Worker w2=new Worker("양진욱",sal,"과장");
		
	
		Salary sal2=new Salary();
	    Worker w3=new Worker("김우종",sal2,"인턴");
		
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(sal);
		System.out.println(w3);
		
	    
	}
}
