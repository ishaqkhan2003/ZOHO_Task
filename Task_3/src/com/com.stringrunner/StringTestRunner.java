package com.stringrunner;
import com.stringtask.StringTask;
import java.util.Scanner;
import java.util.*;
import com.exceptionhandling.DataValidationException;
public class StringTestRunner
{
	public static void main(String[] args)
	{
		StringTask taskObj = new StringTask();
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
		switch (choice)
			{
			case 1:
					try
					{
					int length = taskObj.getLength(args[0]);
					System.out.println("THE LENGTH OF THE STRING IS = "+ length);
					}
					catch ( Exception e)
					{
						System.out.println(e.getMessage());
					}
					finally {
						break;
					}

			case 2 :
					try
					{
					System.out.print("ENTER A STRING TO CONVERT");
					str = scanner.next();
					char[] chrArray = taskObj.toCharacterArray(str); 
					for ( char c : chrArray)
					{
						System.out.print(c);
						System.out.print(",");
					}
					System.out.println();
					}
					catch ( Exception e)
					{
						System.out.println(e.getMessage());
					}
					finally
					{
					break;
					}
			case 3 :
					try{
					System.out.print("ENTER A STRING  ");
					str = scanner.next();
					character = taskObj.getCharFromLast(str,8);
					System.out.println("THE PENULTIMATE CHARACTER IS = "+ character);
					}
					catch ( Exception e)
					{
						System.out.println(e.getMessage());
					}
					finally
					{
					break;
					}
			case 4 :
					try
					{
				
						System.out.print("ENTER A STRING ");
						str = scanner.next();
						System.out.print("ENTER A CHAR TO FIND NUMBER OF OCCURENCE :");
						character = scanner.next().charAt(0);
						int occurance = taskObj.numberOfOccurance(str,character);
						System.out.printf("THE NUMBER OF TIMES %c OCCURRED IS = %d",character,occurance);
						System.out.println();
					}
					catch ( Exception e)
					{
						System.out.println(e.getMessage());
					}
					finally
					{
						break;
					}
			case 5 :
					try 
					{
						System.out.print("ENTER A STRING ");
						str = scanner.next();
						System.out.println("ENTER A CHAR TO FIND GREATEST POSITION OF IT :");
						character  = scanner.next().charAt(0);	
						System.out.printf("THE LAST OCCURANCE OF %c IS AT THE INDEX %d ",character,taskObj.getGreatestPosition(str,character));
						System.out.println();
					}
					catch ( Exception e)
					{
						System.out.println(e.getMessage());
					}
					finally{
						break;
					}
			case 6 :
					try
					{
						System.out.print("ENTER A STRING ");
						str = scanner.next();
						String  lastCharacters = taskObj.getLastCharacters(str,5);
						System.out.println("THE SUBSTRING IS "+ lastCharacters);
					}
					catch ( Exception e)
					{
						System.out.println(e.getMessage());
					}
					finally
					{
						break;
					}
			case 7 :
					try
					{
						System.out.print("ENTER A STRING ");
						str = scanner.next();
						String firstThreeChar = taskObj.getFirstCharacters(str,3);
						System.out.println("THE FIRST THREE CHARACTER IS "+ firstThreeChar);
					}
					catch ( Exception e)
					{
						System.out.println(e.getMessage());
					}
					finally
					{
						break;
					}
			case 8 :
					try 
					{
						int index =0;
						System.out.print("ENTER A STRING ");
						str = scanner.next();
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
						}						
						String replacedString = taskObj.replaceString(str,"XYZ",typeOf,noOfChar,index);
						System.out.println("THE NEW REPLACED STRING IS "+ replacedString);
					}
					catch ( Exception e)
					{
						System.out.println(e.getMessage());
					}
					finally
					{
						break;
					}
			case 9 :
					try 
					{				
						System.out.print("ENTER A STRING ");
						str = scanner.next();
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
					catch ( Exception e)
					{
						System.out.println(e.getMessage());
					}
					finally
					{
						break;
					}
			case 10 :
					try 
					{
					System.out.print("ENTER A STRING ");
					str = scanner.next();
					
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
					catch ( Exception e)
					{
						System.out.println("invalid input ");
					}
					break;
			case 12 :
					try 
					{
						System.out.println("ENTER A STRING ");
						str = scanner.next();
						String loweredString = taskObj.toLowerCasedString(str);
						System.out.println("THE LOWER CASE STRING IS "+ loweredString);
					}
					catch ( Exception e)
					{
						System.out.println(e.getMessage());
					}
					finally
					{
						break;
					}
			case 11 :
					try
					{				
						System.out.println("ENTER A STRING ");
						str = scanner.next();
						String upperCasedString = taskObj.toUpperCasedString(str);
						System.out.println("THE UPPER CASED STRING IS "+ upperCasedString);
					}
					catch ( Exception e)
					{
						System.out.println(e.getMessage());
					}
					finally
					{
						break;
					}
			case 13 :
					try
					{
						System.out.println("ENTER A STRING TO REVERSE ");
						str = scanner.next();
						String reversedString = taskObj.toReverseString(str);
						System.out.println("THE REVERSED STRING IS ");
						System.out.println(reversedString);
					}
					catch ( Exception e)
					{
						System.out.println("input error ");
						e.printStackTrace();
					}
					finally
					{
						break;
					}			
			case 14 :
					try{
						System.out.println("ENTER A STRING ");
						str = scanner.nextLine();
						String multipleStringInput = taskObj.getMultipleString(str);
						System.out.println("THE MULTIPLE STRING LINE IS = "+ multipleStringInput );
					}
					catch ( Exception e)
					{
					System.out.println(e.getMessage());
					}
					finally
					{
						break;
					}
			case 15 :
					try{
						System.out.println("ENTER A STRING ");
						str = scanner.nextLine();
						String concatenatedString = taskObj.stringWoSpace(str," ","");
						System.out.println(concatenatedString);
					}
					catch ( Exception e)
					{
						System.out.println(e.getMessage());
					}
					finally
					{
						break;
					}
			case 16 :
					try
					{
						System.out.println("ENTER A STRING ");
						str = scanner.nextLine();
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
					catch ( Exception e)
					{
						System.out.println(e.getMessage());
					}
					finally
					{
						break;
					}
			case 17 :
					try{
						System.out.println("ENTER NO. OF STRINGS ");
						int count = scanner.nextInt();
						scanner.nextLine();
						ArrayList<String> stringArrayList = new ArrayList<>();
						System.out.printf("ENTER %d STRINGS ",count); 
						for ( int i =1 ;i<= count;i++)
						{
							String string = scanner.nextLine();
							stringArrayList.add(string);
						}
						String concatenatedStringList = taskObj.concatStrings(stringArrayList,"-");
						System.out.println(concatenatedStringList);
					}
					catch ( Exception e)
					{
						System.out.println(e.getMessage());
					}
					finally{
						break;
					}
			case 18 :
					try
					{
						System.out.println("ENTER STRING 1 ");
						String stringOne = scanner.nextLine();
						System.out.println("ENTER STRING TWO ");
						String stringTwo = scanner.nextLine();
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
					catch ( Exception e)
					{
						System.out.println(e.getMessage());
					}
					finally
					{
						break;
					}
			case 19 :
					try
					{
						System.out.println("ENTER STRING 1 ");
						String strOne = scanner.nextLine();
						System.out.println("ENTER STRING TWO ");
						String strTwo = scanner.nextLine();
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
					catch ( Exception e)
					{
						System.out.println(e.getMessage());
					}
					finally
					{
						break;
					}
			case 20 :
					try
					{
						System.out.println("ENTER A STRING ");
						str = scanner.nextLine();
						System.out.println("STRING AFTER REMOVING WHITESPACES "+ taskObj.removeWhiteSpace(str));
					}
					catch ( Exception e)
					{
						System.out.println(e.getMessage());
					}
					finally
					{
						break;
					}
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
	}
}