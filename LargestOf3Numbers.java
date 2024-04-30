package task_9_guvi;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
//		Getting inputs from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the First Number: ");
		int number1 = input.nextInt();
		System.out.print("Enter the Second Number: ");
		int number2 = input.nextInt();
		System.out.print("Enter the Third Number: ");
		int number3 = input.nextInt();
		
//		comparing first number with second and third numbers, and prints first number if it is greater than both the inputs
		if(number1 > number2 && number1 > number3)
			System.out.println(number1 + " is the largest of the given numbers");
//		comparing second number with third number, and prints the second number if it is greater than third number
		else if(number2 > number3)
			System.out.println(number2 + " is the largest of the given numbers");
//		prints third number if it is greater than both the first and second numbers
		else
			System.out.println(number3 + " is the largest of the given numbers");

	}

}
