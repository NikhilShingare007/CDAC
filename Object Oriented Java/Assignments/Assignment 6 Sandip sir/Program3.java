package org.Methods;

interface Sample{
	Employee get( String name, int empid, float salary );
}

class Employee {
	private String name;
	private int empid;
	private double salary;
	
	Employee() {
		
	}

	public Employee(String name, int empid, double salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getEmpid() {
		return empid;
	}

	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + "]";
	}
	
}


public class Program3 {
	public static void main(String[] args) {
	Sample s = Employee::new ;	//Constructor reference 
		
		Employee emp = s.get("Sandeep", 33, 45000.50f );
		System.out.println( emp.toString());
		
	}
	public static void main1(String[] args) {
		Sample s = Employee ::getSalary;
		
		Employee E = new Employee("Nikhil",56,103020402);
		
		double Salary = s.getDetails(E);
		
		System.out.println(Salary);
	}

}
