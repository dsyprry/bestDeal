import java.util.Scanner;
import java.text.DecimalFormat;

public class BestDeal {
	
	public static void main(String[] args) {

		boolean repeat = false;
		do {
		
		Scanner scaniel = new Scanner(System.in); 
		DecimalFormat newFormat = new DecimalFormat("0.00");
		
		double cardMoney = 0;
		double itemA = 0;
		double itemB = 0;
		double itemC = 0;
		double leastAmount = 0;
		double maxAllowable = -1;
		
		System.out.println("\n" +"How much money do you have left on your card?");
		cardMoney = scaniel.nextDouble();
		
		System.out.println("What are the costs of the 3 items you wish to buy?");
		itemA = scaniel.nextDouble();
		itemB = scaniel.nextDouble();
		itemC = scaniel.nextDouble();
		
		if((itemA + itemB + itemC) <= cardMoney)
			maxAllowable = itemA + itemB + itemC;

		else{
			if ((itemA + itemB) <= cardMoney)
				maxAllowable = itemA + itemB;
			
			if ((itemA + itemC) > maxAllowable && (itemA + itemC) <= cardMoney)
				maxAllowable = itemA + itemC;

			if((itemB + itemC) > maxAllowable && (itemB + itemC <= cardMoney))
				maxAllowable = itemB + itemC;
				
			if(itemA > maxAllowable && itemA < cardMoney)
				maxAllowable = itemA;
			
			if(itemB > maxAllowable && itemB < cardMoney)
				maxAllowable = itemB;
			
			if(itemC > maxAllowable && itemC < cardMoney)
				maxAllowable = itemC;
				
			}
			
		if(maxAllowable >=0){
			leastAmount = cardMoney - maxAllowable;
			System.out.println("The least amount of money you can have left on your card is " + newFormat.format(leastAmount) + "\n");
		}
		else{
			System.out.println("You cannot afford to buy any of these products");
		}
		
		System.out.println("Reset [Y/N])\n");
		
		char answer = scaniel.next().charAt(0);
		
		if (answer == 'Y'|| answer == 'y') {
			repeat = true;
		} else {
			repeat = false;
			System.out.println("Goodbye.");
		};
			
		
	
		} while (repeat == true);	
	
		
	}//end main

};

