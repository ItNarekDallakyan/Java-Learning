package exceptions.training.uncheckedExceptionExample;


import exceptions.training.uncheckedExceptionExample.animals.Animal;

public class AnimalTest {

	public static void main(String[] args) {

		Animal a = new Animal();

		try {

			a.setAge(-8); //cause illegal argument exception
		} catch (IllegalAnimalAgeException e) {
			e.printStackTrace(System.out);
		}

		System.out.println("animal age: " + a.getAge());
	}
}
