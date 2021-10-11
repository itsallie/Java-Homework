package OOP;
import java.util.*;

public class Main {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String userName = scan.nextLine();
		
		System.out.println("Enter your gender: ");
		String userGender = scan.nextLine();
		
		System.out.println("Enter your age: ");
		int userAge = scan.nextInt();
		
		//Employee
		System.out.println("Enter your title at work: ");
		String userTitle = scan.nextLine();
		
		System.out.println("Enter your work ID: ");
		int userWorkID = scan.nextInt();
		
		System.out.println("Enter your salary: ");
		double userSalary = scan.nextDouble();
		
		Employee emp1 = new Employee(userName, userGender, userAge, userTitle, userWorkID, userSalary);
		emp1.display();
		
		
		//Student
		System.out.println("Enter your student ID: ");
		int userStudID = scan.nextInt();
		
		System.out.println("Enter your major: ");
		String userMajor = scan.nextLine();
		
		System.out.println("Enter your first grade: ");
		double userGrade1 = scan.nextDouble();
		
		System.out.println("Enter your second grade: ");
		double userGrade2 = scan.nextDouble();
		
		System.out.println("Enter your third grade: ");
		double userGrade3 = scan.nextDouble();
		
		Student stud1 = new Student(userName, userGender, userAge, userGrade1, userGrade2, userGrade3);
		stud1.display();
			
		
	}

}
