package exceptionhandling;
import java.io.IOException;

public class InvalidInputException extends Exception
{
	public InvalidInputException( String message )
	{
		super(message);
	}
		public InvalidInputException( )
	{
		super();
	}
}