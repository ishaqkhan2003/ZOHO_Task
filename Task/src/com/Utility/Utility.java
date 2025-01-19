package com.utility ;
import com.exceptionhandling.DataValidationException;
import java.util.*;
public  class Utility {
	static Scanner scanner = new Scanner(System.in);
	public static void checkNull(Object obj) throws DataValidationException{
		if ( obj == null )
		{
			throw new DataValidationException("The input string is null.");
		}
	}
	public static void checkBoundary(int length,int index) throws DataValidationException{
		if ( length < index || index < 0)
		{
			throw new DataValidationException("Out of Index ");
		}
	}
	public static int getLength(String string) throws DataValidationException{
		checkNull(string);
		return string.length();
	}
	public static int getLength(StringBuilder string) throws DataValidationException{
		checkNull(string);
		return string.length();
	}
	public static int getLength(String[] strArray)throws DataValidationException{
		checkNull(strArray);
		return strArray.length;
	}
	public static int getIntInput(){
		
		int integer = scanner.nextInt();
		scanner.nextLine();
		return integer;
	}
	public static String getStrInput(){
		return scanner.nextLine();
	}

}