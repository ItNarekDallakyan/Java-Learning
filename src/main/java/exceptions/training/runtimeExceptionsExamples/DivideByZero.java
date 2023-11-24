package exceptions.training.runtimeExceptionsExamples;

public class DivideByZero {

	public static int divide(int a, int b) {
		int res = a / b;
		return res;
	}

	public static void main(String[] args) {
		int x = 4;
		int y = 0; //Divide by zero!

		int res = divide(x, y); //Throws "java.lang.ArithmeticException: / by zero" exception.
		System.out.println(res); //Will not get to this line.
	}
}
