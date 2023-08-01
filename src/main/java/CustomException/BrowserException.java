package CustomException;

@SuppressWarnings("serial")

//By calling this class constructor we are  throwing the exception as well as we are handling the exception and we don't need to write try/catch in evry block
public class BrowserException extends RuntimeException {
	
	public BrowserException(String msg)
	{
		super(msg);
	}

}
