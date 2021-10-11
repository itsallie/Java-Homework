package OOP;

public class Employee extends Person {
	
	String empTitle;
	double empSalary;
	int workID;
	
	
	
	Employee(String name, String gender, int age, String empTitle, double empSalary, int workID) {
		super(name, gender, age);
		this.empTitle = empTitle;
		this.empSalary = empSalary;
		this.workID = workID;
		
	}
	
	void display() {
		System.out.println("----------------------");
		System.out.println("Employee Records: ");
		System.out.println("----------------------");
		System.out.println("Name: " + this.name);
		System.out.println("Gender: " + this.gender);
		System.out.println("Age: " + this.age);
		System.out.println("Title: " + this.empTitle);
		System.out.println("Salary: " + this.empSalary);
		System.out.println("Work ID: " + this.workID);
	}
	
	
	
}
