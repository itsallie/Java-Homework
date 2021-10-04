package HomeworkPack;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
//		====== Build a calculator ====== 
//		Write a program to create a calculator that can Add, Subtract, Multiply, and Divide 2 numbers entered by the user. 
//		Also, add an option to exit out from the program.
//		OPTIONS
//			1. Add
//			2. Subtract
//			3. Multiply
//			4. Divide
//			5. Exit
			 
//			1. Write different methods for each module (add, subtract, multiply, and divide).
//
//			2. Use switch/case to call the particular method.
//
//			3. Take input inside the methods to perform the related operation.
//
//			4. Return the answer and display it inside the main method.
//
//			5. Display a default message (ex. "Invalid Entry, Try Again") if any number other than 1-5 is entered by the user
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculator");
		System.out.println("PICK AN OPTION:");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Exit");
		System.out.println("Enter a number between 1-5: ");
		int choice = scan.nextInt();
		System.out.println();
		
		switch (choice) {
		case 1: addition();
			break;
		case 2: subtraction();
			break;
		case 3: multiply();
			break;
		case 4: divide();
			break;
		case 5: System.out.println("Goodbye!");
			break;
		default: System.out.println("Invalid Entry, Try Again!!");
			break;
		}
		//System.out.println();
		scan.close();
			
		}
	public static void addition() {
		int num1;
		int num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Addition");
		System.out.println("Enter First Number: ");
		num1 = scan.nextInt();
		System.out.println("Enter Second Number: ");
		num2 = scan.nextInt();
		
		scan.close();
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}
	
	public static void subtraction() {
		int num1;
		int num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Subtraction");
		System.out.println("Enter First Number: ");
		num1 = scan.nextInt();
		System.out.println("Enter Second Number: ");
		num2 = scan.nextInt();
		
		scan.close();
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	
	}
	
	public static void multiply() {
		int num1;
		int num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Mulitply");
		System.out.println("Enter First Number: ");
		num1 = scan.nextInt();
		System.out.println("Enter Second Number: ");
		num2 = scan.nextInt();
		
		scan.close();
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
	
	}
	public static void divide() {
		int num1;
		int num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Divide");
		System.out.println("Enter First Number: ");
		num1 = scan.nextInt();
		System.out.println("Enter Second Number: ");
		num2 = scan.nextInt();
		
		scan.close();
		System.out.println(num1 + " / " + num2 + " = " + (num1 / (double)num2));
	
}
	
}
