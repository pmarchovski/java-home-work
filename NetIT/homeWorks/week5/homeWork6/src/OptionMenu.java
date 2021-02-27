
public class OptionMenu {
	
	 public static int selectIndexMenu = 0;
	 static String[] menuArray = {"1 - Sort the number lowest to highest", 
				                  "2 - Sort the number highest to lowest",
	    		                  "3 - Take number position",
	    		                  "4 - Random the numbers",
	    		                  "5 - Calculate the sum of all numbers",
	    		                  "6 - Finding the largest number",
	    		                  "7 - Finding the lowest number",
	    		                  "8 - Finding the average number from all numbers",
	    		                  "9 - Check for symmetry of an array of numbers",
	    		                  "10 - Inverting an array of numbers",
	    		                  "11 - Show us the entered numbers",
	    		                  "12 - EXIT"};
	
	public static void menu() {
		
		Console.showln("Please select an option from the menu\n");		
	    for (int i = 0; i < menuArray.length; i++) {    	
	    	Console.showln(menuArray[i] + " ");
	    }
	}
	
	public static int menuIndex() {    
	    
	    selectIndexMenu = Console.input();    
	    for (int i = 0; i < menuArray.length; i++) {      	
	    }
	    Console.showln(menuArray[selectIndexMenu - 1]);
	    
	    return selectIndexMenu;
	}
	
	public static void startResult() {
	
	
		
		    if(selectIndexMenu == 1) {
			Results.sortLowestToHighest(ArrayData.array);	
			}
		
			if(selectIndexMenu == 2) {
				Results.sortHighestToLowest(ArrayData.array);
			}		
		
			if(selectIndexMenu == 3) {
			Results.searchNumberPosition(ArrayData.array);
			}
			
			if(selectIndexMenu == 4) {
			Results.randomNumberPosition(ArrayData.array);
			}
			
			if(selectIndexMenu == 5) {
			Results.sumArrayNumber(ArrayData.array);
			}
			
			if(selectIndexMenu == 6) {
			Results.findingLargestNumber(ArrayData.array);
			}
			
			if (selectIndexMenu == 7) {
			Results.findingLowestNumber(ArrayData.array);
			}
			
			if (selectIndexMenu == 8) {
				Results.averageValueOfArray(ArrayData.array);
			}
			
			if (selectIndexMenu == 9) {
				Results.symetryArray(ArrayData.array);
			}
			
			if (selectIndexMenu == 10) {
				Results.invertingArray(ArrayData.array);
			}
			
			if (selectIndexMenu == 11) {
				Results.showNumber(ArrayData.array);
			}
			
			if (selectIndexMenu == 12) {
				Results.exit();
			}
	}
	
}
