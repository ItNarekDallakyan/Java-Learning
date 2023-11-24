package exceptions.training.uncheckedExceptionExample.animals;

import exceptions.training.uncheckedExceptionExample.IllegalAnimalAgeException;

public class Animal {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws IllegalAnimalAgeException{
		if (age >= 0) {
			this.age = age;
		} else {
			throw new IllegalAnimalAgeException("illegal age: " + age);

		}
	}

}
