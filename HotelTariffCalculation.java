package task_9_guvi;

import java.util.Scanner;

public class HotelTariffCalculation {

	public static void main(String[] args) {
//		Getting inputs from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the month: ");
		int month = input.nextInt();
		System.out.print("Enter the Room Rent per day: ");
		float rent = input.nextFloat();
		System.out.print("Enter the number of days stayed: ");
		int days = input.nextInt();
		
//		checking for season months and charging 20% higher the rent as per the input given
		switch(month) {
		case 4:
			rent += (rent * 0.20);
			break;
		case 5:
			rent += (rent * 0.20);
			break;
		case 6:
			rent += (rent * 0.20);
			break;
		case 11:
			rent += (rent * 0.20);
			break;
		case 12:
			rent += (rent * 0.20);
			break;
		}
		
//		printing the output in 2 decimal places as per the Tariff calculation		
		System.out.printf("%.2f",rent * days);

	}

}
