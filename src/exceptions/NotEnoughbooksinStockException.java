package exceptions;

@SuppressWarnings("serial")
public class NotEnoughbooksinStockException extends Exception {

	public NotEnoughbooksinStockException() {
		
	}

	public NotEnoughbooksinStockException(String message) {
		super(message);
	}

}
