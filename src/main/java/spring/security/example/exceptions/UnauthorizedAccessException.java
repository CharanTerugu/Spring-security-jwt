package spring.security.example.exceptions;

public class UnauthorizedAccessException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnauthorizedAccessException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UnauthorizedAccessException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public UnauthorizedAccessException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UnauthorizedAccessException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public UnauthorizedAccessException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	

}
