package task;
import java.util.*;
import java.io.IOException;
import exceptionhandling.InvalidInputException;
public class StringTask extends Exception 
{ 
	int stringLength;
	int ifNull;
	public  void nullPointerError(String s ) throws InvalidInputException
	{
		if ( s == null )
		{
			throw new InvalidInputException("INVALID INPUT ");
		}
	}
	public int getLengthOfString(String s) throws InvalidInputException
	{
		nullPointerError(s);
		return s.length();	
	}
	public char[] toCharacterArray(String s) throws InvalidInputException
	{
		nullPointerError(s);
		return s.toCharArray();	
	}
	public char penultimateChar(String s) throws InvalidInputException
	{  
		nullPointerError(s);		
		stringLength = getLengthOfString(s);
		if ( stringLength < 1)
		{
			throw new InvalidInputException("INVALID INPUT ");
		}
		else
		{
			return s.charAt(s.length() - 2);
		}
	}
	public int numberOfOccurance(String s , char c) throws InvalidInputException
	{
		nullPointerError(s);
		 stringLength = getLengthOfString(s);
		 if ( stringLength == 0)
		 {
			 throw new InvalidInputException("INVALID INPUT ");
		 }
		 else 
		 {
		int total = 0;
		for ( int i = 0 ; i<stringLength;i++)
		{
			if ( s.charAt(i) == c )
			{
				total +=1;
			}
		}
		return total;
		 }
	}
	public int getGreatestPosition(String s,char c) throws InvalidInputException
	{
		nullPointerError(s);
		return s.lastIndexOf(c);
	}
	public String getLastCharacters(String s,int n) throws InvalidInputException
	{
		nullPointerError(s);
		stringLength = getLengthOfString(s);
		if ( stringLength < n )
		{
			 throw new InvalidInputException("INVALID INPUT ");
		}
		else 
		{
			return s.substring((stringLength - n));
		}
	}
	public String getFirstCharacters(String s,int n) throws InvalidInputException
	{
		nullPointerError(s);
		stringLength = getLengthOfString(s);
		if ( stringLength < n)
		{
			throw new InvalidInputException("INVALID INPUT ");
		}
		else 
		{
			return s.substring(0,n);
		}
	}
	public String replaceString(String s,String replacementString) throws InvalidInputException
	{
		nullPointerError(s);
		nullPointerError(replacementString);
		int orgStringLength = getLengthOfString(s);
		int replacementStringLength = getLengthOfString(replacementString);
		if ( orgStringLength > replacementStringLength )
		{
			return s.replaceFirst(s.substring(0,replacementStringLength),replacementString);
		}
		else 
		{
						 throw new InvalidInputException("INVALID INPUT ");
		}
	}
	public boolean checkStartsWith(String s,String startingWith) throws InvalidInputException
	{
		nullPointerError(s);
		nullPointerError(startingWith);
		stringLength = getLengthOfString(s);
		int startingWithLength = getLengthOfString(startingWith);
		if ( stringLength >= startingWithLength )
		{
		return s.startsWith(startingWith);
		}
		else 
		{
			throw new InvalidInputException("INVALID INPUT ");
		}
	}
	public boolean checkEndsWith(String s,String endingString) throws InvalidInputException 
	{
		nullPointerError(s);
		nullPointerError(endingString);
		stringLength = getLengthOfString(s);
		int endingStringLength = getLengthOfString(endingString);
		if ( stringLength > endingStringLength)
		{
			return s.endsWith(endingString);
		}
		else
		{	
			throw new InvalidInputException("INVALID INPUT ");
		}
	}
	public String toLowerCasedString(String s) throws InvalidInputException 
	{
		nullPointerError(s);
		return s.toLowerCase();
	}
	public String toUpperCasedString(String s) throws InvalidInputException 
	{
		nullPointerError(s);
		return s.toUpperCase();
	}
	public String toReverseString(String s)
	{
		char ch;
		String reverseChar="";
		for ( int i = (s.length()-1);i>=0;i--)
		{
			ch = s.charAt(i);
			reverseChar+=ch;
		}
		return reverseChar.toString();
	}
	public String getMultipleString(String string ) throws InvalidInputException
	{
		nullPointerError(string);
		return string;
	}
	public String stringWoSpace(String s) throws InvalidInputException
	{
		nullPointerError(s);
		return s.replaceAll(" ","");
	}
	public String[] toConvertStringArray(String s) throws InvalidInputException
	{
		nullPointerError(s);
		return s.split(" ");
	}
	public String concatStrings( ArrayList<String> s) throws InvalidInputException
	{
		int sizeOfArray = s.size();
		if ( sizeOfArray == 0 )
		{
						 throw new InvalidInputException("INVALID INPUT ");
		}
		else
		{
		return String.join("-",s);
		}
	}
	public int compareCaseSensitiveStrings(String  strOne, String strTwo) throws InvalidInputException
	{
		nullPointerError(strOne);
		nullPointerError(strTwo);
		return strOne.compareTo(strTwo);
	}
	public int compareCaseInSensitiveStrings(String  strOne, String strTwo) throws InvalidInputException
	{
		nullPointerError(strOne);
		nullPointerError(strTwo);
		return strOne.compareToIgnoreCase(strTwo);
	}
	public String removeWhiteSpace(String s) throws InvalidInputException
	{
		nullPointerError(s);
		return s.trim();
	}
}