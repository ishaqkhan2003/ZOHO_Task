package task;
import java.util.*;
public class StringTask
{
	public int lengthOfString(String s)
	{
		return s.length();
	}
	public char[] toCharacterArray(String s)
	{
		return s.toCharArray();
	}
	public char penultimateChar(String s)
	{
		return s.charAt(s.length() - 2);
	}
	public int numberOfOccurance(String s , char c)
	{
		int total = 0;
		for ( int i = 0 ; i<s.length();i++)
		{
			if ( s.charAt(i) == c )
			{
				total +=1;
			}
		}
		return total;
	}
	public int getGreatestPosition(String s,char c)
	{
		return s.lastIndexOf(c);
	}
	public String getLastFiveChar(String s)
	{
		return s.substring((s.length()-5));
	}
	public String getFirstThreeChar(String s)
	{
		return s.substring(0,3);
	}
	public String replaceString(String s)
	{
		return s.replaceFirst(s.substring(0,3),"XYZ");
	}
	public boolean checkStartsWith(String s)
	{
		return s.startsWith("ent");
	}
	public boolean checkEndsWith(String s)
	{
		return s.endsWith("le");
	}
	public String toLowerCasedString(String s)
	{
		return s.toLowerCase();
	}
	public String toUpperCasedString(String s)
	{
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
	public String stringWoSpace(String s)
	{
		
		return s.replaceAll(" ","");
	}
	public String[] toConvertStringArray(String s)
	{
		return s.split(" ");
	}
	public String concatStrings( ArrayList<String> s)
	{
		String concatenatedString = "";
		for ( int i =0 ;i<s.size();i++)
		{
			if ( i ==0)
			{
				concatenatedString = s.get(i);
			}
			else 
			concatenatedString = concatenatedString +  "-" + s.get(i) ;
		}
		return concatenatedString;
	}
	public int compareCaseSensitiveStrings(String  strOne, String strTwo)
	{
		return strOne.compareTo(strTwo);
	}
	public int compareCaseInSensitiveStrings(String  strOne, String strTwo)
	{
		return strOne.compareToIgnoreCase(strTwo);
	}
	public String removeWhiteSpace(String s)
	{
		return s.trim();
	}
}