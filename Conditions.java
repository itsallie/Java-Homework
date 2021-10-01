package HomeworkPack;

public class Conditions {

	public static void main(String[] args) {
		
//		1. Write an if/else statement for the following requirements:
//			a. If student gets 90 or higher: console log A
//			b. If students get 80 or above: console log B
//			c. If students get 70 or above: console log C
//			d. If students get 55 or above: console log D
//			e. Any grade lower than 55 is F
		
		int grade = 79;
		if (grade >= 90) {
			System.out.println("A");
		} else if (grade >= 80) {
			System.out.println("B");
		} else if (grade >= 70) {
			System.out.println("C");
		} else if (grade >= 55) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		
//		2. Using switch case, do the following:
//			a. Store a number between 1-7
//			b. If the number is 1, display a message "Monday", 2 for "Tuesday", 3 for "Wednesday" etc.
//			c. Anything other than 1-7 would default to "Invalid Input"
		
		
		int day = 5;
		String dayString;
		switch (day) {
		case 1: dayString = "Monday";
				break;
		case 2: dayString = "Tuesday";
				break;
		case 3: dayString = "Wednesday";
				break;
		case 4: dayString = "Thursday";
				break;
		case 5: dayString = "Friday";
				break;
		case 6: dayString = "Saturday";
				break;
		case 7: dayString = "Sunday";
				break;
		default: dayString = "Invalid day";
				break;
		}
		
		System.out.println(dayString);
		
		
//		3. Store a number in a variable called number and write an if statement: 
//			a. If number is odd, display "Cool"
//			b. If number is even and between 2-5, display "Not Cool"
//			c. If number is even and between 6-20, display "Cool"
//			d. If number is even and greater than 20, display "Not Cool
		
		int num = 22;
		
		if (num % 2 == 0 && num >= 2 && num <= 5) {
			System.out.println("Not Cool");
		} else if (num % 2 == 0 && num>=6 && num <=20) {
			System.out.println("Cool");
		} else if (num % 2== 0 && num > 20) {
			System.out.println("Not cool");
		} else {
			System.out.println("Cool");
		}
		
		
	}

}
