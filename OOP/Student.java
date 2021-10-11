package OOP;

public class Student extends Person implements PersonInterface {
	
	int studID;
	double grade1, grade2, grade3;
	String major;
	private String gradeAvg;
	
	Student(String name, char gender, int age, int studID, double grade1, double grade2, double grade3, String major) {
		super(name, gender, age);
		this.studID = studID;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
		this.major = major;
	}
	
	public double calculate(double avg) {
		double gradeAvg =(this.grade1 + this.grade2 + this.grade3) / 3;
		return gradeAvg;
	}
	
	public void display() {
		System.out.println("--------------------");
		System.out.println("Student Records: ");
		System.out.println("--------------------");
		System.out.println("Name: " + super.name);
		System.out.println("Gender: " + super.gender);
		System.out.println("Age: " + super.age);
		System.out.println("Student ID: " + this.studID);
		System.out.println("Major: " + this.major);
		System.out.println("Average Grade: " + this.gradeAvg);
	}

	

}
