package Test;

public class Labor {
	
	public static int numOfEmployees;
	private String name;
	private int salary;
	public Labor() {
		numOfEmployees++;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Labor [name=" + name + ", salary=" + salary + "]";
	}
}
	