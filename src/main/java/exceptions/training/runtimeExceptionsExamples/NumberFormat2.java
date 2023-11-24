package exceptions.training.runtimeExceptionsExamples;

import javax.swing.*;

public class NumberFormat2 {

	public static void main(String[] args) {

		try {
			String str1 = JOptionPane.showInputDialog("Enter num 1");
			
			int a = Integer.parseInt(str1);
			
			String str2 = JOptionPane.showInputDialog("Enter num 2");
			int b = Integer.parseInt(str2);
			
			int sum = a + b;
			System.out.println(a + " + " + b + " = " + sum);

		} catch (NumberFormatException e) {

			System.out.println("error - wrong input");
			System.out.println(e.getMessage());

			e.printStackTrace(System.out); 
			
		} catch (Exception e) {
			System.out.println("error - some other problem");
		} finally { 
			System.out.println("from finally");

		}
		System.out.println("end of main");

	}
}
