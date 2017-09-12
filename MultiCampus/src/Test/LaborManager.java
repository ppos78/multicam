package Test;

public class LaborManager {

	
	private static LaborManager instance;
	
	public static LaborManager getInstance() {
		if(instance==null)
			instance=new LaborManager();
		return instance;
	}
	
	
	private Labor[] labArr;
	private int countOfLab;
	
	public LaborManager() {
		labArr=new Labor[100];
	
		labArr[0] = new Labor();
		labArr[1] = new Labor();
		labArr[2] = new Labor();

		labArr[0].setName("Hong");
		labArr[1].setName("Kim");
		labArr[2].setName("Lee");
		
		labArr[0].setSalary(1000);
		labArr[1].setSalary(1200);
		labArr[2].setSalary(900);

		System.out.println(labArr[0]);
		System.out.println(labArr[1]);
		System.out.println(labArr[2]);
		}
	    
	    public void addLabor(String name, int Salary) {
	    	Labor l=new Labor();
	    	l.setName(name);
	    	l.setSalary(Salary);
	    	labArr[countOfLab]=l;
	    	countOfLab++;
	    }
	
	
	
	    public void printEmp() {
		System.out.println("----급여가 1000 이상인 친구들---");
//		for (int i = 0; i < 3; i++) {
		for (int i = 0; i < countOfLab; i++) {
			// System.out.println(labArr[i]);
		if (labArr[i].getSalary() >= 1000)
		    System.out.println(labArr[i]);
		}}
	    
		public void printSum() {
			int sum = 0;// 총합을 담을 변수
			for (int i = 0; i < labArr.length; i++)
				sum += labArr[i].getSalary();
			System.out.println("직원 총급여:" + sum);
		}
	    }