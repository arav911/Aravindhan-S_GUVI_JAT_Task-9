package task_9_guvi;

import java.util.Scanner;

public class AnnaUniversityGradingSystem {

	public static void main(String[] args) {
//		Getting input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the mark: ");
		int marks = input.nextInt();
		String grade = "";
		
//		Assigning corresponding Grades to corresponding Marks obtained
		if(marks == 100)
			grade = "S";
		else if(marks>=90 && marks<=99)
			grade = "A";
		else if(marks>=80 && marks<=89)
			grade = "B";
		else if(marks>=70 && marks<=79)
			grade = "C";
		else if(marks>=60 && marks<=69)
			grade = "D";
		else if(marks>=50 && marks<=59)
			grade = "E";
		else if(marks<50)
			grade = "F";
//		if Marks entered greater than 100, then prints "Invalid Input"
		else
			System.out.println("Invalid Input");
		
		System.out.println(grade);

	}

}
