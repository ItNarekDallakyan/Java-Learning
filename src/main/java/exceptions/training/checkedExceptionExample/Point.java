package exceptions.training.checkedExceptionExample;

public class Point {

	private int x;
	private int y;

	//Both setX() and setY() methods throw IllegalXYException. Since the exception
	//is not handled in the CTOR, the CTOR must also throw the exception to a higher
	//level in the hierarchy, where it must be handled or thrown again to a higher level. 
	public Point(int x, int y) throws IllegalXYException {
		super();
		setX(x);
		setY(y);
	}

	public int getX() {
		return x;
	}

	//Since a code within the method may throw an IllegalXYException which is a CHECKED
	//exception (extending Exception) it must have the 'throws' declaration for that exception.
	public void setX(int x) throws IllegalXYException {
		if (x >= 0 && x <= 100) {
			this.x = x;
		} else {
			//Throwing IllegalXYException with a string in the CTOR as a message describing the exception.
			throw new IllegalXYException("illegal x value: " + x);
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) throws IllegalXYException {
		if (y >= 0 && y <= 100) {
			this.y = y;
		} else {
			throw new IllegalXYException("illegal y value: " + y);
		}
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
