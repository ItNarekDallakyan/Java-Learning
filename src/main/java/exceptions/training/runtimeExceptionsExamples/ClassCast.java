package exceptions.training.runtimeExceptionsExamples;


import exceptions.training.uncheckedExceptionExample.animals.Animal;
import exceptions.training.uncheckedExceptionExample.animals.Cat;
import exceptions.training.uncheckedExceptionExample.animals.Dog;

public class ClassCast {

	public static void main(String[] args) {

		Animal a = new Dog(); //'a' is an Animal type reference which is assigned to a Dog object.


		Cat c = (Cat) a;
		System.out.println(c); //Won't get to this line.

	}

}
