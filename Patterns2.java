package task_9_guvi;

import java.util.Scanner;

public class Patterns2 {

	public static void main(String[] args) {
//		X Pattern with Stars
//		----------------------------------------------
//		Getting input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Limit: ");
		int number = input.nextInt();
		
//		Declaring a counter value for printing numbers in incrementing pattern
		int counter = number;
		
//		using nested for-loop to print the pattern 
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=number; j++) {
				if(i==j || j==counter)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			counter--;
			System.out.println();
		}

	}

}
