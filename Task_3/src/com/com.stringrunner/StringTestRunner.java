package com.stringrunner;
import com.stringtask.StringTask;
import java.util.Scanner;
import java.util.*;
import com.exceptionhandling.DataValidationException;
public class StringTestRunner
{
	StringTask taskObj = new StringTask();
	public static void main(String[] args)
	{
		StringTestRunner runnerObj = new StringTestRunner();
		Scanner scanner = new Scanner(System.in);
		String str;
		char character;
		boolean bool  = true;
		System.out.println("1.Find Length of string \n2.Convert String to character array\n3.To find the penultimate character\n4.Find number of occurance of a character"+
							"\n5.Find greatest position of a character\n6.To print last 5 character of string\n7.To print first 3 character\n8.Replace first character with XYZ"+
							"\n9.To check if string starts with ent\n10.To check if string ends with le\n11.Convert into lowercase\n12.Convert into uppercase"+
							"\n13.To reverse a string\n14.Accept string line with multiple strings\n15.Accept multiple line string and remove space\n16.Accept multiple line string and enclose into string  array" +
							"\n17.Accept multiple line string and merge with -\n18.To compare string case sensitive\n19.To compare string case insensitive"+
							"\n20.To trim the space at end or beginning\n21.Exit\n22.Show task Menu");
		while(bool)
		{
		System.out.print("Enter the task number ");
		int choice = scanner.nextInt();
		scanner.nextLine();
		try
		{
		switch (choice)
			{
			case 1:
					runnerObj.getLengthOfString(args[0]);
					break;
			case 2 :
					System.out.print("ENTER A STRING TO CONVERT");
					str = scanner.next();
					runnerObj.toCharacterArray(str);		
					break;					
			case 3 :
					System.out.print("ENTER A STRING  ");
					str = scanner.next();
					runnerObj.getPenultimateChat(str);
					break;
			case 4 :
					System.out.print("ENTER A STRING ");
					str = scanner.next();
					System.out.print("ENTER A CHAR TO FIND NUMBER OF OCCURENCE :");
					character = scanner.next().charAt(0);
					runnerObj.getNoOfOccurance(str,character);
					break;					
			case 5 :
					System.out.print("ENTER A STRING ");
					str = scanner.next();
					System.out.println("ENTER A CHAR TO FIND GREATEST POSITION OF IT :");
					character  = scanner.next().charAt(0);
					runnerObj.getGreatestPos(str,character);
					break;
			case 6 :
					System.out.print("ENTER A STRING ");
					str = scanner.next();
					runnerObj.getLastFiveChar(str);
					break;					
			case 7 :
					System.out.print("ENTER A STRING ");
					str = scanner.next();
					runnerObj.getFirstThreechar(str);
				 	break;
					
			case 8 :
					System.out.print("ENTER A STRING ");
					str = scanner.next();
					runnerObj.replaceWithXYZ(str);
					break;
			case 9 :
					System.out.print("ENTER A STRING ");
					str = scanner.next();
					runnerObj.checkStartsWithEnt(str);
					break;
			case 10 :
					System.out.print("ENTER A STRING ");
					str = scanner.next();
					runnerObj.checkEndsWithLe(str);
					break;
			case 12 :
					System.out.print("ENTER A STRING ");
					str = scanner.next();
					runnerObj.toLowerCaseStr(str);
					break;					
			case 11 :
					System.out.print("ENTER A STRING ");
					str = scanner.next();
					runnerObj.toUpperCaseStr(str);
					break;
			case 13 :
					System.out.print("ENTER A STRING TO REVERSE ");
					str = scanner.next();
					runnerObj.reverseString(str);
					break;
								
			case 14 :
					System.out.print("ENTER A STRING ");
					str = scanner.nextLine();
					runnerObj.getMultipleString(str);
					break;
			case 15 :
					System.out.print("ENTER A STRING ");
					str = scanner.nextLine();
					runnerObj.concatenateString(str);
					break;
			case 16 :
					System.out.print("ENTER A STRING ");
					str = scanner.nextLine();
					runnerObj.toStringArray(str);	
					break;
			case 17 :
					System.out.print("ENTER NO. OF STRINGS ");
					int count = scanner.nextInt();
					scanner.nextLine();
					ArrayList<String> stringArrayList = new ArrayList<>();
					System.out.printf("ENTER %d STRINGS ",count); 
					for ( int i =1 ;i<= count;i++)
					{
						String string = scanner.nextLine();
						stringArrayList.add(string);
					}
					runnerObj.toMergeString(stringArrayList);
					break;
			case 18 :
					System.out.print("ENTER STRING 1 ");
					String stringOne = scanner.nextLine();
					System.out.print("ENTER STRING TWO ");
					String stringTwo = scanner.nextLine();
					runnerObj.compareStrCaseSensitive(stringOne,stringTwo);
					break;
			case 19 :
					System.out.print("ENTER STRING 1 ");
					String strOne = scanner.nextLine();
					System.out.print("ENTER STRING TWO ");
					String strTwo = scanner.nextLine();
					runnerObj.compareStrCaseSensitive(strOne,strTwo);
					break;
			case 20 :
					System.out.print("ENTER A STRING ");
					str = scanner.nextLine();
					runnerObj.trimWhiteSpace(str);
					break;
			case 21 :
					bool = false;
					break;
			case 22:
					System.out.println("1.Find Length of string \n2.Convert String to character array\n3.To find the penultimate character\n4.Find number of occurance of a character"+
									"\n5.Find greatest position of a character\n6.To print last 5 character of string\n7.To print first 3 character\n8.Replace first character with XYZ"+
									"\n9.To check if string starts with ent\n10.To check if string ends with le\n11.Convert into lowercase\n12.Convert into uppercase"+
									"\n13.To reverse a string\n14.Accept string line with multiple strings\n15.Accept multiple line string and remove space\n16.Accept multiple line string and enclose into string  array"+ 
									"\n17.Accept multiple line string and merge with -\n18.To compare string case sensitive\n19.To compare string case insensitive"+
									"\n20.To trim the space at end or beginning\n21.Exit\n22.Show task Menu");	
					break;			
			default :
					System.out.println("PLEASE ENTER A VALID TASK NUMBER ");
					break;			
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		}
	}
	public void getLengthOfString(String str) throws Exception
	{
		try	
		{
			int length = taskObj.getLength(str);
			System.out.println("THE LENGTH OF THE STRING IS = "+ length);
		}
		catch ( DataValidationException e)
		{
			throw new Exception("Exception thrown by runner class",e);
		}
	}
	public void toCharacterArray(String str) throws Exception
	{
		try
		{
			char[] chrArray = taskObj.toCharacterArray(str); 
			for ( char c : chrArray)
			{
				System.out.print(c);
				System.out.print(",");
			}
			System.out.println();
		}
		catch ( DataValidationException e)
		{
			throw new Exception("Exception thrown by runner class",e);
		}
	}
	public void getPenultimateChat(String str) throws Exception
	{
		try
		{
			System.out.println("THE PENULTIMATE CHARACTER IS = "+ taskObj.getCharFromLast(str,2));
		}
		catch ( DataValidationException e)
		{
			throw new Exception("Exception thrown by runner class",e);
		}
	}
	public void getNoOfOccurance(String str, char character) throws Exception
	{
		try
		{
			int occurance = taskObj.numberOfOccurance(str,character);
			System.out.printf("THE NUMBER OF TIMES %c OCCURRED IS = %d",character,occurance);
			System.out.println();
		}
		catch ( DataValidationException e)
		{
			throw new Exception("Exception thrown by runner class",e);
		}
	}
	public void getGreatestPos(String str, char character) throws Exception
	{
		try 
		{
			System.out.printf("THE LAST OCCURANCE OF %c IS AT THE INDEX %d ",character,taskObj.getGreatestPosition(str,character));
			System.out.println();
		}
		catch ( DataValidationException e)
		{
			throw new Exception("Exception thrown by runner class",e);
		}
	}
	public void getLastFiveChar(String str) throws Exception
	{
		try
		{
			String  lastCharacters = taskObj.getLastCharacters(str,5);
			System.out.println("THE SUBSTRING IS "+ lastCharacters);
		}
		catch (DataValidationException e)
		{
			throw new Exception("Exception thrown by runner class",e);
		}
	}
	public void getFirstThreechar(String str) throws Exception
	{
		try
		{
			String firstThreeChar = taskObj.getFirstCharacters(str,3);
			System.out.println("THE FIRST THREE CHARACTER IS "+ firstThreeChar);
		}
		catch (DataValidationException e)
		{
			throw new Exception("Exception thrown by runner class",e);
		}	
	}
	public void replaceWithXYZ(String str) throws Exception
	{
		try 
		{
		/*	int index =0;
			System.out.println("ENTER POSITION FOR REPLACEMENT : \n1.Prefix\n2.Suffix\n3.Any");
			int typeOf = scanner.nextInt();
			scanner.nextLine();
			System.out.println("ENTER NUMBER OF CHARACTER TO BE RPLACED");
			int noOfChar = scanner.nextInt();
			scanner.nextLine();
			if ( typeOf == 3 )
			{
				System.out.println("ENTER THE INDEX FOR REPLACEMENT ");
				index = scanner.nextInt();
				scanner.nextLine();
			}*/						
			String replacedString = taskObj.replaceString(str,"XYZ",1,3,0);
			System.out.println("THE NEW REPLACED STRING IS "+ replacedString);
			}
		catch ( DataValidationException e)
		{
			throw new Exception("Exception thrown by runner class",e);
		}
	}
	public void checkStartsWithEnt(String str) throws Exception
	{
		try 
		{
			boolean flag = taskObj.checkStartsWith(str,"ent");
			if ( flag == true)
			{
				System.out.println("THE GIVEN STRING STARTS WITH ent ");
			}
			else 
			{
				System.out.println("THE GIVEN STRING DOESNOT START WITH ent");
			}
		}
		catch ( DataValidationException e)
		{
			throw new Exception("Exception thrown by runner class",e);
		}
	}
	public void checkEndsWithLe(String str) throws Exception
	{
		try 
		{					
			boolean check = taskObj.checkEndsWith(str,"le");
			if ( check ==  true)
			{
				System.out.println("THE GIVEN STRING ENDS WITH le ");
			}
			else 
			{
				System.out.println("THE GIVEN STRING DOESNOT ENDS WITH le ");
			}					
		}
		catch ( DataValidationException e)
		{
			throw new Exception("Exception thrown by runner class",e);
		}
	}
	public void toUpperCaseStr(String str) throws Exception
	{
		try
		{
			String upperCasedString = taskObj.toUpperCasedString(str);
			System.out.println("THE UPPER CASED STRING IS "+ upperCasedString);
		}
		catch ( DataValidationException e)
		{
			throw new Exception("Exception thrown by runner class",e);
		}
	}
	public void toLowerCaseStr(String str) throws Exception
	{
		try 
		{
			String loweredString = taskObj.toLowerCasedString(str);
			System.out.println("THE LOWER CASE STRING IS "+ loweredString);
		}
		catch ( DataValidationException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void reverseString(String str) throws Exception
	{
		try
		{
			String reversedString = taskObj.toReverseString(str);
			System.out.println("THE REVERSED STRING IS ");
			System.out.println(reversedString);
		}
		catch ( DataValidationException e)
		{
			throw new Exception("Exception thrown by runner class",e);

		}
	}
	public void getMultipleString(String str) throws Exception
	{
		try{
			String multipleStringInput = taskObj.getMultipleString(str);
			System.out.println("THE MULTIPLE STRING LINE IS = "+ multipleStringInput );
		}
		catch ( DataValidationException e)
		{
			throw new Exception("Exception thrown by runner class",e);
		}
	}
	public void concatenateString(String str) throws Exception
	{
		try{
			System.out.println(taskObj.changeDelimitter(str," ",""));
		}
		catch ( DataValidationException e)
		{
			throw new Exception("Exception thrown by runner class",e);
		}
	}
	public void toStringArray(String str) throws Exception
	{
		try
		{
			String[] stringArray = taskObj.toConvertStringArray(str," ");
			System.out.println("THE CONVERTED STRING ARRAY IS =  ");
			System.out.print("{");
			for ( String s : stringArray)
			{
				System.out.print("\"" + s + "\"");
				System.out.print(",");						
			}
			System.out.println("}");
		}
		catch ( DataValidationException e)
		{
			throw new Exception("Exception thrown by runner class",e);
		}
	}
	public void toMergeString(List<String> stringArrayList) throws Exception
	{
		try{
			String concatenatedStringList = taskObj.concatStrings(stringArrayList,"-");
			System.out.println(concatenatedStringList);
		}
		catch ( DataValidationException e)
		{
			throw new Exception("Exception thrown by runner class",e);
		}
	}
	public void compareStrCaseSensitive(String stringOne ,String stringTwo) throws Exception
	{
		try
		{
			int checkEquals = taskObj.compareCaseSensitiveStrings(stringOne,stringTwo);
			if ( checkEquals == 0)
			{
				System.out.println("THE TWO STRINGS ARE EQUAL ");
			}
			else 
			{
				System.out.println("THE TWO STRING ARE NOT EQUAL ");
			}
		}
		catch ( DataValidationException e)
		{
			throw new Exception("Exception thrown by runner class",e);
		}
	}
	public void compareStrCsaseInsensitive(String strOne,String strTwo) throws Exception
	{
		try
		{
			int equalsCheck = taskObj.compareCaseInSensitiveStrings(strOne,strTwo);
			if ( equalsCheck == 0)
			{
				System.out.println("THE TWO STRINGS ARE EQUAL ");
			}
			else 
			{
				System.out.println("THE TWO STRING ARE NOT EQUAL ");
			}
		}
		catch ( DataValidationException e)
		{
			throw new Exception("Exception thrown by runner class",e);
		}
	}
	public void trimWhiteSpace(String str) throws Exception
	{
		try
		{
			System.out.println("STRING AFTER REMOVING WHITESPACES "+ taskObj.removeWhiteSpace(str));
		}
		catch ( DataValidationException e)
		{
			throw new Exception("Exception thrown by runner class",e);
		}
	}		
}