package exceptions.training.uncheckedExceptionExample;




public class IllegalAnimalAgeException extends Exception {

	private static final long serialVersionUID = 1L;

	public IllegalAnimalAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IllegalAnimalAgeException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public IllegalAnimalAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IllegalAnimalAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public IllegalAnimalAgeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
