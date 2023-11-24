package design_patterns.dependency;

public class Mail implements Service{

	@Override
	public String name() {
		return "Mail";
	}
}
