package design_patterns.dependency;

public class Logger implements Service{

	@Override
	public String name() {
		return "Logger";
	}
}
