package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int storeItemCount = scan.nextInt();
		
		String[] storeItemNames = new String[storeItemCount];
		double[] storeItemPrices = new double[storeItemCount];
		
		
		
		for (int a = 0; a < storeItemCount; a++) {
			storeItemNames[a] = scan.next();
			storeItemPrices[a] = scan.nextDouble();
		}
		
		
		int numberOfCustomers = scan.nextInt();
		String[] customerNames = new String[numberOfCustomers];
		double[] orderTotals = new double[numberOfCustomers];
	
		for (int b = 0; b < numberOfCustomers; b++) {
			
			String customerName = scan.next() + " " + scan.next();
			customerNames[b] = customerName;
			
			int numberOfItems = scan.nextInt();
			double overallCost = 0;
			
			for (int c = 0; c < numberOfItems; c++) {
				
				int index = 0;
				int itemQuantity = scan.nextInt();
				String itemName = scan.next();
				double itemPrice = 0;
				double itemCost = 0;
				
				
				
				for (int d = 0; d < storeItemNames.length; d++) {
					if (itemName.equals(storeItemNames[d])) {
						index = d;
						break;
					}
				}
				
				itemPrice = storeItemPrices[index];
				itemCost += itemQuantity * itemPrice;
				overallCost += itemCost;
				
				
			}
			
			orderTotals[b] = overallCost;
			
		}
		
		int highestIndex = 0;
		int lowestIndex = 0;
		double highestOrder = orderTotals[0];
		double lowestOrder = orderTotals[0];
		
		for (int f = 0; f < orderTotals.length; f++) {
			if (orderTotals[f] > highestOrder) {
				highestOrder = orderTotals[f];
				highestIndex = f;
			}
		}
		
		for (int g = 0; g < orderTotals.length; g++) {
			if (orderTotals[g] < lowestOrder) {
				lowestOrder = orderTotals[g];
				lowestIndex = g;
			}
		}
		
		double sum = 0;
		
		for (int h = 0; h < orderTotals.length; h++) {
			sum += orderTotals[h];
		}
		
		double average = sum / numberOfCustomers;
		
		System.out.println("Biggest: " + customerNames[highestIndex] + " (" + String.format("%.2f", highestOrder) + ")");
		System.out.println("Smallest: " + customerNames[lowestIndex] + " (" +  String.format("%.2f", lowestOrder) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}
}
