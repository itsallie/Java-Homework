package HomeworkPack;
import java.util.Scanner;

public class UserInput {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//Fibonacci Question:
//		System.out.println("Enter a number:");
//		int num = scan.nextInt();
//		fibonacci(num);
		
		//Armstrong Question:
//		System.out.println("Type a number to check if it's an Armstrong number: ");
//		int anum = scan.nextInt();
//		armstrong(anum);
		
		//Palindrome Question:
		System.out.println("Type a word to see if it's a Palindrome word: ");
		String str = scan.nextLine();
		palindrome(str);
		
		scan.close();
	}
	
//1. Write Fibonacci series between the user entered start and end values
//		0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 
	public static void fibonacci(int n) {
		int num1=0;
		int num2=1;
		for (int i = 0; i < n; i++) {
			System.out.print(num1 + " ");
			int num3= num1+num2;
			num1=num2;
			num2=num3;
		}	
	}
	
//2. Determine whether a user entered number is an Armstrong number	
	//371 = (3*3*3 + 7*7*7 + 1*1*1)
	public static void armstrong(int n) {
		
		int remainDigits = n;
		int sum = 0;
		
		while (remainDigits != 0) {
			int digit = remainDigits % 10;
			System.out.println(digit);
			remainDigits = remainDigits / 10;
			int product = (int) Math.pow(digit, 3);
			sum += product;
		}
		
		System.out.println(sum);
		
		if (sum == n) {
			System.out.println("This is an Armstrong Number!");
		} else {
			System.out.println("This is not an Armstrong Number!");
		}
	}
	
	
	
//3. Write a program to see if a user entered string is a palindrome or not
	//racecar radar kayak reviver mom level
	public static void palindrome(String n) {
		String str = n;
		String reverseStr = "";
		int strLength = str.length();
		for (int i=(strLength - 1); i >= 0; i--) {
			reverseStr = reverseStr + str.charAt(i);
		}
		
		if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(str + " is a Palindrome word!");
		} else {
			System.out.println(str + " is not a Palindrome word!");
		}
		
	}
}






