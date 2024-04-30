package task_9_guvi;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
//		Getting input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = input.nextLine();
		
//		Declaring variables for counter value and checking the characters from last position of the Input String
		int counter = 0, j = str.length()-1;
		
//		using for-loop to check Palindrome String from first index to the mid by comparing from last index to mid 
		for(int i=0; i<str.length()/2; i++) {
//		if(first character of the given String equals to last character of the given String, counter value increases and j value decreases using unary operator 	
			if(str.charAt(i)==str.charAt(j)) {
				counter++;
				j--;
			}
		}
//		if counter value equals to half length of given input String, then it's a Palindrome
		if(counter == str.length()/2)
			System.out.println(str + " is a PALINDROME string");
		else
			System.out.println(str + " is NOT a PALINDROME string");

	}

}
