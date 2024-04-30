package task_9_guvi;

import java.util.Scanner;

public class Patterns1 {

	public static void main(String[] args) {
//		Half Pyramid Pattern with Numbers
//		----------------------------------------------
//		Getting input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Limit: ");
		int number = input.nextInt();
		
//		Declaring a counter value for printing numbers in incrementing pattern
		int counter = 1;
		
//		using nested for-loop to print the pattern 
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(counter++ + " ");
			}
			System.out.println();
		}

	}

}
