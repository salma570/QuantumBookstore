package exceptions;

@SuppressWarnings("serial")
public class BooknotfoundException extends Exception {

	public BooknotfoundException() {
		super();
	}

	public BooknotfoundException(String message) {
		super(message);
	}

}
