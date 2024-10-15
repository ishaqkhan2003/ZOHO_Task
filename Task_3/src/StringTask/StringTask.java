package task;
import java.util.*;
import exceptionhandling.InvalidInputException;
public class StringTask 
{ 
	public  void checkNull(String string ) throws InvalidInputException
	{
		if ( string == null )
		{
			throw new InvalidInputException("INPUT STRING IS NULL");
		}
	}
	public void checkEmpty(String string ) throws InvalidInputException
	{
		if ( string.isEmpty())
		{
			throw new InvalidInputException("THE GIVEN STRING IS EMPTY ");
		}
	}
	public int getLength(String string) throws InvalidInputException
	{
		checkNull(string);
		return string.length();	
	}
	public char[] toCharacterArray(String string) throws InvalidInputException
	{
		checkNull(string);
		return string.toCharArray();	
	}
	public char getCharFromLast(String string,int positionOfChar) throws InvalidInputException
	{  	
		int stringLength = getLength(string);
		checkEmpty(string);
		if ( stringLength < positionOfChar )
		{
			throw new InvalidInputException(" THE GIVEN POSITION IS GREATER THEN ORG STRING LENGTH ");
		}
		return string.charAt(stringLength - positionOfChar);
		
	}
	public int numberOfOccurance(String string , char character) throws InvalidInputException
	{
		 int stringLength = getLength(string);
		checkEmpty(string);
		int total = 0;
		for ( int i = 0 ; i<stringLength;i++)
		{
			if ( string.charAt(i) == character )
			{
				total++;
			}
		}
		return total;
		 
	}
	public int getGreatestPosition(String string,char character) throws InvalidInputException
	{
		checkNull(string);
		return string.lastIndexOf(character);
	}
	public String getLastCharacters(String string,int noOfChar) throws InvalidInputException
	{
		int stringLength = getLength(string);
		if ( stringLength < noOfChar )
		{
			 throw new InvalidInputException("STRING LENGTHIS LESS THEN REQUIRED NUMBE ROF  CHARACTER FROM LAST ");
		}
		return string.substring((stringLength - noOfChar));
	}
	public String getFirstCharacters(String string,int noOfChar) throws InvalidInputException
	{
	//	int stringLength = getLength(string);
		if ( getLength(string) < noOfChar)
		{
			throw new InvalidInputException("INVALID INPUT ");
		}
		return string.substring(0,noOfChar);
	}
	public String replaceString(String string,String replacementString) throws InvalidInputException
	{
		int orgStringLength = getLength(string);
		int replacementStringLength = getLength(replacementString);
		if ( orgStringLength < replacementStringLength )
		{
			throw new InvalidInputException("ORGINAL STRING IS LESS THEN REPLACEMENT STRING ");
		}
		return string.replaceFirst(string.substring(0,replacementStringLength),replacementString);
	}
	public boolean checkStartsWith(String string,String startingWith) throws InvalidInputException
	{
		checkNull(string);
		checkNull(startingWith);
		return string.startsWith(startingWith);	
	}
	public boolean checkEndsWith(String string,String endingString) throws InvalidInputException 
	{
		checkNull(string);
		checkNull(endingString);
		return string.endsWith(endingString);
	}
	public String toLowerCasedString(String string) throws InvalidInputException 
	{
		checkNull(string);
		return string.toLowerCase();
	}
	public String toUpperCasedString(String string) throws InvalidInputException 
	{
		checkNull(string);
		return string.toUpperCase();
	}
	public String toReverseString(String string) throws InvalidInputException 
	{
		int inputstringLength = getLength(string);
		char[] inputCharArray = toCharacterArray(string);
		char[] reverseCharArray = new char[inputstringLength];
		int j = inputstringLength-1;
		for ( int i = 0 ;i<inputstringLength;i++)
		{
			reverseCharArray[j] = inputCharArray[i];
			j--;
		}
		//String reversedString = new String(reverseCharArray);
		return new String(reverseCharArray);		
	}
	public String getMultipleString(String string ) throws InvalidInputException
	{
		checkNull(string);
		return string;
	}
	public String stringWoSpace(String string,String oldDelimittingChar, String newDelimittingChar) throws InvalidInputException
	{
		checkNull(string);
		return string.replaceAll(oldDelimittingChar,newDelimittingChar);
	}
	public String[] toConvertStringArray(String string,String delimittingCharacter) throws InvalidInputException
	{
		checkNull(string);
		return string.split(delimittingCharacter);
	}
	public String concatStrings( List<String> stringArray, String sepCharacter) throws InvalidInputException
	{
		int sizeOfArray = stringArray.size();
		if ( sizeOfArray == 0 )
		{
			 throw new InvalidInputException("INVALID INPUT ");
		}
		return String.join(sepCharacter,stringArray);

	}
	public int compareCaseSensitiveStrings(String  strOne, String strTwo) throws InvalidInputException
	{
		checkNull(strOne);
		checkNull(strTwo);
		return strOne.compareTo(strTwo);
	}
	public int compareCaseInSensitiveStrings(String  strOne, String strTwo) throws InvalidInputException
	{
		checkNull(strOne);
		checkNull(strTwo);
		return strOne.compareToIgnoreCase(strTwo);
	}
	public String removeWhiteSpace(String string) throws InvalidInputException
	{
		checkNull(string);
		return string.trim();
	}
}