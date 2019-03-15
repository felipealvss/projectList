package util;

public class Employee {

	private int id;
	private String name;
	private double salary;
	
	// CONSTRUCT
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}	
	
	// GET & SET
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	//ToString
	@Override
	public String toString() {
		return "Id: " + id + ", " + name + ", $ " + String.format("%.2f", salary);
	}
	
	// METHODS
	public void increaseSalary(double percentage) {
		salary += salary * percentage /100;
	}
	
}
