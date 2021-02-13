//6. Sixth point

public class ViscousYear {

	static void viscousYear() {

		Print.print("Please enter Year");
		int year = Input.scanner.nextInt();

		boolean isLeapYear = year % 4 == 0;
		Print.print("Is year viscous: " + isLeapYear);

		if (isLeapYear == true) {
			Print.print(isLeapYear + " " + year);

		} else {

			Print.print(isLeapYear + " " + (-1));
		}

	}
}
