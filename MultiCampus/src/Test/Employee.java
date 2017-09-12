package Test;

public class Employee {

	private String name;
	private int salary;
	private String position;

	public Employee() {
		name="noname";
		position="과장";
		salary=0;
	}
	
	public Employee(String name, int salary, String position) {
		this.name=name;
		this.salary=salary;
		this.setSalary(salary);
		this.position=position;
	}
public void setName(String n) {
	name=n;
}

public void setSalary(int s) {
	if(s>0) 
	salary=s;
}	
public void setPosition(String p) {
	position=p;
}

public String getName() {
	return name;
}

public int getSalary() {
	return salary;
}

public String getPosition() {
	return position;
}

public void salaryUp() {
	salary+=1000000;
}

public String toString() {
	return"이름:"+name+"\t연봉:"+salary+"직급:"+position;
}
}
