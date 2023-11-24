package exceptions.training.runtimeExceptionsExamples;

public class NumberFormat {

	public static void main(String[] args) {

		try {
			String num = "kkk" +
					""; //Has to be a character of numbers otherwise will throw an exception.
			int x = Integer.parseInt(num); //NumberFormatException is thrown here.
			System.out.println(x); //Won't get to this line.

		} catch (NumberFormatException e) {
			//NumberFormatException is caught and the message is printed.
			System.out.println("some error");
		}

	}
}
