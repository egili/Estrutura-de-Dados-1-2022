package pilhas;

public class InvalidSizeException extends Exception{

	public InvalidSizeException() {
		super();
	}
	
	public InvalidSizeException(String errorMessage) {
		super(errorMessage);
	}
}