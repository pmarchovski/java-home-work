import java.util.Scanner;

class FlowersType {
	
	int quantity;
	String holiday;
	
	static double holiday (String holiday, double roses, double tulips, double hrisan) {
		double totalPrice;	
		
		if (holiday.equals("Yes")) {
			totalPrice = (roses + tulips + hrisan) * 1.15;
		} else {
			totalPrice = roses + tulips + hrisan;
		}
		  return totalPrice;
	}
	
	static double calcRoses(int quantity, String season) {
		
		double priceOfRosesSS = 4.10;
		double priceOfRosesAW = 4.50;
	    double totalPriceRoses = compare(season, quantity, priceOfRosesSS, priceOfRosesAW);
		
		return totalPriceRoses;
	}
	
	static double calcTulips(int quantity, String season) {	
			
		
		double priceTulipsSS = 2.50;
		double priceTulipsAW = 4.15;
		double totalPriceTulips = compare(season, quantity, priceTulipsSS, priceTulipsAW);
		
		return totalPriceTulips; 
		} 
		
	static double calcHrisan(int quantity, String season) {	
			
			
		double priceHrisanthemumsSS = 2.50;
		double priceHrisanthemumsAW = 4.15;
		double totalPriceHrisanthemums = compare(season, quantity, priceHrisanthemumsSS, priceHrisanthemumsAW);
			
			return totalPriceHrisanthemums; 
			} 
	
	static double compare(String text, int quantity, double priceSS, double priceAW) {
		
		double totPrice;
		
		if(text.equals("SS")) {
			totPrice = priceSS * quantity;
		} else {
			totPrice = priceAW * quantity;
		}
		return totPrice;
	}
}

public class Flowers {
	    String season;
	
	public static void main(String[] args) {
		
		FlowersType roses = new FlowersType();
		FlowersType tulips = new FlowersType();
		FlowersType hrisanthemums = new FlowersType();
		FlowersType holiday = new FlowersType();
		Flowers season = new Flowers();
		
        Scanner scan = new Scanner(System.in);
        
        print("Please input roses quantity");
		roses.quantity = Integer.parseInt(scan.nextLine());
		
		print("Please input tulips quantity");
		tulips.quantity = Integer.parseInt(scan.nextLine());
		
		print("Please input tulips quantity");
		hrisanthemums.quantity = Integer.parseInt(scan.nextLine());
		
		print("Please input the season");
		season.season = scan.nextLine();
		
		print("Please input the holiday Yes or No");
		holiday.holiday = scan.nextLine();
		
		double totalPriceRoses = FlowersType.calcRoses(roses.quantity, season.season);
        double totalPriceTulips = FlowersType.calcTulips(tulips.quantity, season.season);
        double totalPriceHrisanthemums = FlowersType.calcHrisan(hrisanthemums.quantity, season.season);
        
        double totalPrice = FlowersType.holiday(holiday.holiday, totalPriceRoses, 
        		            totalPriceTulips, totalPriceHrisanthemums);
        
        
	}

	static void print(String text) {
		System.out.println(text);
	}
}
