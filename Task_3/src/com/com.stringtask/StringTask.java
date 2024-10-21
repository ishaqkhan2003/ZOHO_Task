package com.stringtask;
import java.util.*;
import com.exceptionhandling.DataValidationException;
public class StringTask 
{ 
	public  void checkNull(String string ) throws DataValidationException
	{
		if ( string == null )
		{
			throw new DataValidationException("The input string is null.");
		}
	}
	public void checkEmpty(String string ) throws DataValidationException
	{
		if ( string.isEmpty())
		{
			throw new DataValidationException("The given string is empty.");
		}
	}
	public int getLength(String string) throws DataValidationException
	{
		checkNull(string);
		return string.length();	
	}
	public boolean comprStrAndNum(String string,int value) throws DataValidationException
	{
		if ( getLength(string)<value )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public char[] toCharacterArray(String string) throws DataValidationException
	{
		checkNull(string);
		return string.toCharArray();	
	}
	public char getCharFromLast(String string,int positionOfChar) throws DataValidationException
	{  	
		int stringLength = getLength(string);
		checkEmpty(string);
		if ( comprStrAndNum(string,positionOfChar ))
		{
			throw new DataValidationException(" The given position is greater than the original string length. ");
		}
		return string.charAt(stringLength - positionOfChar);
		
	}
	public int numberOfOccurance(String string , char character) throws DataValidationException
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
	public int getGreatestPosition(String string,char character) throws DataValidationException
	{
		checkNull(string);
		return string.lastIndexOf(character);
	}
	public String getLastCharacters(String string,int noOfChar) throws DataValidationException
	{
		int stringLength = getLength(string);
		if ( comprStrAndNum(string,noOfChar ))
		{
			 throw new DataValidationException("The string length is less than the required number of characters from the end.");
		}
		return string.substring((stringLength - noOfChar));
	}
	public String getFirstCharacters(String string,int noOfChar) throws DataValidationException
	{
	//	int stringLength = getLength(string);
		if ( getLength(string) < noOfChar)
		{
			throw new DataValidationException("The string length is less than the required number of characters from the end.");
		}
		return string.substring(0,noOfChar);
	}
	public String replaceString(String string,String replacementString,int typeOf,int noOfChar,int index) throws DataValidationException
	{
		if (comprStrAndNum(string,noOfChar))
		{
			throw new DataValidationException("The string length is less than the required number of characters from the end.");
		}
		checkNull(replacementString);
		switch ( typeOf )
		{
			case 1 :
					return string.replaceFirst(getFirstCharacters(string,noOfChar),replacementString);
			case 2 : 
				//	 getFirstCharacters(string , getLength(string)-noOfChar);
					return getFirstCharacters(string , getLength(string)-noOfChar)+replacementString;
			case 3 : 
					return string.replace(string.substring(index,noOfChar+index),replacementString);
			default :
					throw new DataValidationException("Invalid Choice is Entered");
		}
	}
	public boolean checkStartsWith(String string,String startingWith) throws DataValidationException
	{
		checkNull(string);
		checkNull(startingWith);
		return string.startsWith(startingWith);	
	}
	public boolean checkEndsWith(String string,String endingString) throws DataValidationException 
	{
		checkNull(string);
		checkNull(endingString);
		return string.endsWith(endingString);
	}
	public String toLowerCasedString(String string) throws DataValidationException 
	{
		checkNull(string);
		return string.toLowerCase();
	}
	public String toUpperCasedString(String string) throws DataValidationException 
	{
		checkNull(string);
		return string.toUpperCase();
	}
	public String toReverseString(String string) throws DataValidationException 
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
	public String getMultipleString(String string ) throws DataValidationException
	{
		checkNull(string);
		return string;
	}
	public String stringWoSpace(String string,String oldDelimittingChar, String newDelimittingChar) throws DataValidationException
	{
		checkNull(string);
		return string.replaceAll(oldDelimittingChar,newDelimittingChar);
	}
	public String[] toConvertStringArray(String string,String delimittingCharacter) throws DataValidationException
	{
		checkNull(string);
		return string.split(delimittingCharacter);
	}
	public String concatStrings( List<String> stringArray, String sepCharacter) throws DataValidationException
	{
		int sizeOfArray = stringArray.size();
		if ( sizeOfArray == 0 )
		{
			 throw new DataValidationException("INVALID INPUT ");
		}
		return String.join(sepCharacter,stringArray);

	}
	public int compareCaseSensitiveStrings(String  strOne, String strTwo) throws DataValidationException
	{
		checkNull(strOne);
		checkNull(strTwo);
		return strOne.compareTo(strTwo);
	}
	public int compareCaseInSensitiveStrings(String  strOne, String strTwo) throws DataValidationException
	{
		checkNull(strOne);
		checkNull(strTwo);
		return strOne.compareToIgnoreCase(strTwo);
	}
	public String removeWhiteSpace(String string) throws DataValidationException
	{
		checkNull(string);
		return string.trim();
	}
}