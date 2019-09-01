package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int numberOfItems = scan.nextInt();
		String[] itemNames = new String[numberOfItems];
		int[] numberPurchased = new int[numberOfItems];
		int[] customersBought = new int[numberOfItems];
		
		
		for (int i = 0; i < numberPurchased.length; i++) {
			numberPurchased[i] = 0;
		}
		
		for (int i = 0; i < customersBought.length; i++) {
			customersBought[i] = 0;
		}
		
		
		for (int i = 0; i < numberOfItems; i++) {
			itemNames[i] = scan.next();
			scan.next();
		}
		
		int numberOfCustomers = scan.nextInt();
		
		

		
		for (int i = 0; i < numberOfCustomers; i++) {
			scan.next();
			scan.next();
			
			
			int numberOfDifferentItems = scan.nextInt();
			int[] itemCountsInOrder = new int[numberOfItems];
			for (int f = 0; f < itemCountsInOrder.length; f++) {
				itemCountsInOrder[f] = 0;
			}
			
			
			
			
			
			for (int j = 0; j < numberOfDifferentItems; j++) {
				
				int itemQuantity = scan.nextInt();
				String itemName = scan.next();
				
				int numberPurchasedIndex = 0;
				
				for (int k = 0; k < itemNames.length; k++) {
					
					if (itemName.equals(itemNames[k])) {
						numberPurchasedIndex = k;
						//customersBought[k]++;
						itemCountsInOrder[k]++;
						
					}
				}
				
				
				numberPurchased[numberPurchasedIndex] += itemQuantity;
			}
			for (int h = 0; h < itemCountsInOrder.length; h++) {
				if (itemCountsInOrder[h] >= 1) {
					customersBought[h]++;
				}
			}
			
			
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		for (int i = 0; i < itemNames.length; i++) {
			if (numberPurchased[i] == 0) {
				System.out.println("No customers bought " + itemNames[i]);
			} else {
				System.out.println(customersBought[i] + " customers bought " + numberPurchased[i] +  " " + itemNames[i]);
			}
		}
		
		
		

		
		
		
		
		
	}
}



