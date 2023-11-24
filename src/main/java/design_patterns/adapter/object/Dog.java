package design_patterns.adapter.object;

public class Dog implements Animal{

	@Override
	public void run() {
		System.out.println("Dog is running");
	}

}
