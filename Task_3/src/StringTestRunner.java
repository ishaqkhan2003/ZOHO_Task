package runner;
import task.StringTask;
import java.util.Scanner;
import java.util.*;
public class StringTestRunner
{
	public static void main(String[] args)
	{
		StringTask taskObj = new StringTask();
		Scanner scanner = new Scanner(System.in);
		String str;
		char character;
		boolean bool  = true;
		while(bool)
		{
		System.out.println("Enter the task number");
		int choice = scanner.nextInt();
		scanner.nextLine();
		switch (choice)
			{
			case 1:
					int length = taskObj.lengthOfString(args[0]);
					System.out.println("THE LENGTH OF THE STRING IS = "+ length);
					break ;
			case 2 :
					System.out.println("ENTER A STRING TO CONVERT");
					str = scanner.next();
					char[] chrArray = taskObj.toCharacterArray(str); 
					for ( char c : chrArray)
					{
						System.out.print(c);
						System.out.print(",");
					}
					System.out.println();
					break;
			case 3 :
					System.out.println("ENTER A STRING TO PRINT PENULTIMATE CHAR");
					str = scanner.next();
					 character = taskObj.penultimateChar(str);
					System.out.println("THE PENULTIMATE CHARACTER IS = "+ character);
					break;
			case 4 :
					System.out.println("ENTER A STRING ");
					str = scanner.next();
					System.out.println("ENTER A CHAR TO FIND NUMBER OF OCCURENCE :");
					 character = scanner.next().charAt(0);
					int occurance = taskObj.numberOfOccurance(str,character);
					System.out.printf("THE NUMBER OF TIMES %c OCCURRED IS = %d",character,occurance);
					System.out.println();
					break;
			case 5 :
					System.out.println("ENTER A STRING ");
					str = scanner.next();
					System.out.println("ENTER A CHAR TO FIND GREATEST POSITION OF IT :");
					character  = scanner.next().charAt(0);	
					System.out.printf("THE LAST OCCURANCE OF %c IS AT THE INDEX %d ",character,taskObj.getGreatestPosition(str,character));
					System.out.println();
					break;
			case 6 :
					System.out.println("ENTER A STRING ");
					str = scanner.next();
					String  lastFiveChar = taskObj.getLastFiveChar(str);
					System.out.println("THE SUBSTRING IS "+ lastFiveChar);
					break;
			case 7 :
					System.out.println("ENTER A STRING ");
					str = scanner.next();
					String firstThreeChar = taskObj.getFirstThreeChar(str);
					System.out.println("THE FIRST THREE CHARACTER IS "+ firstThreeChar);
					break;
			case 8 :
					System.out.println("ENTER A STRING ");
					str = scanner.next();
					String replacedString = taskObj.replaceString(str);
					System.out.println("THE NEW REPLACED STRING IS "+ replacedString);
					break;
			case 9 :
					System.out.println("ENTER A STRING ");
					str = scanner.next();
					boolean flag = taskObj.checkStartsWith(str);
					if ( flag == true)
						System.out.println("THE GIVEN STRING STARTS WITH ent");
					else 
						System.out.println("THE GIVEN STRING DOESNOT START WITH ent");
					break;
			case 10 :
					System.out.println("ENTER A STRING ");
					str = scanner.next();
					boolean check = taskObj.checkEndsWith(str);
					if ( check ==  true)
						System.out.println("THE GIVEN STRING ENDS WITH le ");
					else 
						System.out.println("THE GIVEN STRING DOESNOT ENDS WITH le");
					break;
			case 12 :
					System.out.println("ENTER A STRING ");
					str = scanner.next();
					String loweredString = taskObj.toLowerCasedString(str);
					System.out.println("THE LOWER CASE STRING IS "+ loweredString);
					break;
			case 11 :
					System.out.println("ENTER A STRING ");
					str = scanner.next();
					String upperCasedString = taskObj.toUpperCasedString(str);
					System.out.println("THE UPPER CASED STRING IS "+ upperCasedString);
					break;
			case 13 :
					System.out.println("ENTER A STRING ");
					str = scanner.next();
					String reversedString = taskObj.toReverseString(str);
					System.out.println("THE REVERSED STRING IS "+ reversedString);
					break;
			case 14 :
					System.out.println("ENTER A STRING ");
					str = scanner.nextLine();
					System.out.println("THE MULTIPLE STRING LINE IS = "+str);
			case 15 :
					System.out.println("ENTER A STRING ");
					str = scanner.nextLine();
					String concatenatedString = taskObj.stringWoSpace(str);
					System.out.println(concatenatedString);
					break;
			case 16 :
					System.out.println("ENTER A STRING ");
					str = scanner.nextLine();
					String[] stringArray = taskObj.toConvertStringArray(str);
					System.out.println("THE CONVERTED STRING ARRAY IS =  ");
					System.out.print("{");
					for ( String s : stringArray)
					{
						System.out.print("\"" + s + "\"");
						System.out.print(",");
						
					}
					System.out.println("}");
					break;
			case 17 :
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
					String concatenatedStringList = taskObj.concatStrings(stringArrayList);
					System.out.println(concatenatedStringList);
					break;
			case 18 :
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
						System.out.println("THE TWO STRING ARE NOT EQUAL ");
					break;
			case 19 :
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
						System.out.println("THE TWO STRING ARE NOT EQUAL ");
					break;
			case 20 :
					System.out.println("ENTER A STRING ");
					str = scanner.nextLine();
					System.out.println("STRING AFTER REMOVING WHITESPACES "+ taskObj.removeWhiteSpace(str));
					break;
			case 21 :
					bool = false;
					break;
			
			}
		}
	}
}