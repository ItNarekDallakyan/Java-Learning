package design_patterns.dependency;

public class Database implements Service{

	@Override
	public String name() {
		return "Database";
	}

}
