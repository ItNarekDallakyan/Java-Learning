package exceptions.training.checkedExceptionExample;

public class PointTest {

	public static void main(String[] args) {

		Point p1 = null;


		try {
			p1 = new Point(10, 10);
			System.out.println(p1);
			p1.setX(-15); //Throws IllegalXYException due to negative value.
			p1.setY(18);
			System.out.println(p1);

		} catch (IllegalXYException e) {
			//Prints out the stack trace with the message defined in the thrown exception
			//in the Point class.
			e.printStackTrace(System.out);
		}

		System.out.println("end of main");
	}
}
