// 7. Seventh point

public class Triangle {

	static void triangle() {

		Print.print("First site dimension:");
		int firstSiteOfTriangle = Input.scanner.nextInt();

		Print.print("Second site dimension:");
		int secondSiteOfTriangle = Input.scanner.nextInt();

		Print.print("Third site dimension:");
		int thirdSiteOfTriangle = Input.scanner.nextInt();

		boolean isTriangle = (firstSiteOfTriangle > 0)  && 
				             (secondSiteOfTriangle > 0) && 
				             (thirdSiteOfTriangle > 0);

		Print.print("Is triangle possible? - " + isTriangle);
	}

}
