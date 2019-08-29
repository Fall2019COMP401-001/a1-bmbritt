package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Initialize j to be number of customers to be processed
		int j = scan.nextInt();
		
		// This loop runs once for each customer to be processed
		for (int i = 0; i < j; i++) { 
			
			// Stores the first name's initial in variable firstInitial
			char firstInitial = scan.next().charAt(0); 
			
			// Stores customer's last name as a string in variable lastName
			String lastName = scan.next();  
			
			// Stores number of different items in variable itemCounter
			int itemCounter = scan.nextInt();
			
			// Initializes the total to be 0 in the variable sum
			double sum = 0;
			
			// This loop runs once for each *different* item in the customer's order
			for (int k = 0; k < itemCounter; k++) {
				
				// Stores the quantity of each item in variable itemQuantity
				int itemQuantity = scan.nextInt();
				
				// Removes the item name string from the input as it can't be processed as a double
				scan.next();
				
				// Initializes the total cost of each item to be its quantity multiplied by its price
				double cost = itemQuantity * scan.nextDouble();
				
				// Sums the total price of the order by adding the cost of each item as it is processed
				sum = sum + cost;
				
				
			}
			
			String.format("%.2f", sum);
			
			// Prints to the console the first initial, last name, and order total in the format required
			System.out.println(firstInitial + ". " + lastName + ":" + " " + sum);
			
		}
		
		
		

		
	}
}
