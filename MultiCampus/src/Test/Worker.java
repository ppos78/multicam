package Test;

public class Worker {

	private String name;
	private Salary salary;
	private String position;

	public Worker() {
		name = "noname";
		salary = new Salary();
		position = "알바";

	}

	public Worker(String name, Salary salary, String position) {
		this.name = name;
		int basicFee = salary.getBasicFee();
		int commission = salary.getCommission();
		this.salary = new Salary(basicFee, commission);
		this.position = position;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		// this.salary = salary;
		// int basicFee=salary.getBasicFee();
		// int commission=salary.getCommission();
		// this.salary.setBasicFee(basicFee);
		// this.salary.setCommission(commission);
		this.salary.setBasicFee(salary.getBasicFee());
		this.salary.setCommission(salary.getCommission());

	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", salary=" + salary.getSalary() + ", position=" + position + "]";
	}
}
