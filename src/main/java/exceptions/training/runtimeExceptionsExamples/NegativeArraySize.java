package exceptions.training.runtimeExceptionsExamples;

public class NegativeArraySize {
	public static void main(String[] args) {
		String[] arr = {"aaa", null, "bbb"};

		System.out.println(arr[0].length()); //3 is printed.

		System.out.println(arr[2]); //"bbb" is printed.

		String num = "5";
		int x = Integer.parseInt(num);
		System.out.println(x); //5 is printed.

		//'NegativeArraySizeException' is thrown here. An array's size cannot be a negative value. 
		int[] arr2 = new int[-3];
		System.out.println(arr2);
	}
}
