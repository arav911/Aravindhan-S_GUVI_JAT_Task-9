package task_9_guvi;

import java.util.Scanner;

public class Reverse_a_String {

	public static void main(String[] args) {
//		Getting input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = input.nextLine();
		
//		Declaring a temporary variable
		String temp = "";
//		using for loop to start the index from last position
		for(int i=str.length()-1; i>=0; i--) {
//			appending the temporary String value from last index of input String
			temp += str.charAt(i);
		}
//		Printing the Output
		System.out.println(temp);

	}

}
