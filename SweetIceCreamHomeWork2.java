import java.util.Scanner;

public class SweetIceCreamHomeWork2 {

	public static void main(String[] args) {
		
		final int minimumQuantityForProduction = 100;
		
		Scanner scanner = new Scanner(System.in);
		
		// 1 - Input name
		String myName;
		System.out.println("Input your name:");
		
		myName = scanner.nextLine();
		System.out.println("Hello " + myName);
		System.out.println();
		
		
		// 2 and 5 - Input ice-cream quantity for production today
		int iceCreamQuantityForProduction;
		System.out.println("Please input ice-cream quantity for production today: ");	
		iceCreamQuantityForProduction = Integer.parseInt(scanner.nextLine());
		
		if (iceCreamQuantityForProduction <= minimumQuantityForProduction) {
			iceCreamQuantityForProduction = minimumQuantityForProduction;			
		} 
		
		System.out.println("The quantity for production today is: " + iceCreamQuantityForProduction);	
        System.out.println();
        
        
        // 3 - Delivery ice cream for the shops in the country
        int numberOfShops = 10;
        int quantityForDeliveryPerShop;
        
        System.out.println("Please input quantity for delivery for each shop");
        quantityForDeliveryPerShop = Integer.parseInt(scanner.nextLine());
        
        int totalQuantityForDelivery = quantityForDeliveryPerShop * numberOfShops;
        System.out.println("Total quantity for delivery is: " + totalQuantityForDelivery);
        System.out.println();
        
        
        // 4 - Produced ice-cream from yesterday
        int producedIceCreamFromYesterday;
        
        System.out.println("How many ice-creams produced yesterday?");
        producedIceCreamFromYesterday = Integer.parseInt(scanner.nextLine());
          
        System.out.println("Produced ice-creams from yesterday are: " + producedIceCreamFromYesterday);
      
        boolean isLessQuantityFromToday = producedIceCreamFromYesterday < iceCreamQuantityForProduction;
        
        if (isLessQuantityFromToday = false) {
        	System.out.println("Low capacity!");
        } else {
        	System.out.println("Good job!");
        }
	}
}
