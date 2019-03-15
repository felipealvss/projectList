package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import util.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		// Employees quantity
		System.out.print("How many employees will be registrered? ");
		int qnt = read.nextInt();
		
		List<Employee> employeesList = new ArrayList<>();
		
		// Defining new employee
		for (int i = 1; i <= qnt; i++) {
			
			System.out.print("Employee #" + i + ":");
			
			System.out.print("ID:");
			int idLocal = read.nextInt();
			
			System.out.print("Name:");
			String nameLocal = read.nextLine();
			
			System.out.print("ID:");
			double salaryLocal = read.nextDouble();
			
			employeesList.add(new Employee(idLocal, nameLocal, salaryLocal));
			
		}
		
		// Increasing Salary
		System.out.print("Enter the employee ID that will have salary increase: ");
		int idLocal = read.nextInt();
		
		Employee emp = employeesList.stream().filter(x -> x.getId() == idLocal).findFirst().orElse(null);
		
		if (emp == null) {
			
			System.out.println("ID does Not exist!");
			
		} else {
			
			System.out.print("Enter the porcentage");
			double percentLocal = read.nextDouble();
			
			emp.increaseSalary(percentLocal);
			
		}
		
		System.out.print("List of employees: ");
		for (Employee employee : employeesList) {
			
			System.out.println(employee.toString());
			
		}
		
		read.close();
	}
	
}
