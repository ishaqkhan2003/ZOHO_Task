package com.stringbuilder.stringbuilderrunner;
import java.util.*;
import com.exceptionhandling.DataValidationException;
import com.utility.UtilityClass;
import com.stringbuilder.stringbuildertask.StringBuilderTask;
public class StringBuilderRunner{
	StringBuilderTask taskObj = new StringBuilderTask();
	public static void main(String[] args){
		StringBuilder strBuilder;
		String string,delimiter;
		StringBuilderRunner runnerObj = new StringBuilderRunner();
		String[] strArray;
		Scanner scanner = new Scanner(System.in);
		boolean bool  = true;
		int i,noOfStr;
		System.out.println("ENTER TASK NUMBER 1-10 AND 11 TO EXIT");
		while(bool){
			System.out.print("ENTER TASK NUMBER ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			try {
			switch (choice){
			case 1 :
					strBuilder =   runnerObj.createStrBuilder();
					runnerObj.printLengthOfStrBldr(strBuilder);
					System.out.print("Enter no of strings to add ");
					noOfStr = scanner.nextInt();
					scanner.nextLine();
					strArray = runnerObj.appendToStrArray(noOfStr,scanner);
					strBuilder = runnerObj.appendString(strBuilder,strArray);
					runnerObj.printLengthOfStrBldr(strBuilder);
					System.out.println("The Final String is " + strBuilder.toString());
					break;
			case 2 :
					System.out.println("Enter a string  ");
					string = scanner.nextLine();
					strBuilder = runnerObj.createStrBuilder(string);
					runnerObj.printLengthOfStrBldr(strBuilder);
					System.out.print("Enter no of strings to add ");
					noOfStr = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Enter delimitting char ");
					delimiter = scanner.nextLine();
					strArray = runnerObj.appendToStrArray(noOfStr,scanner);
					strBuilder = runnerObj.appendString(strBuilder,strArray,delimiter);
					runnerObj.printLengthOfStrBldr(strBuilder);
					System.out.println("The Final String is " + strBuilder.toString());
					break;
			case 3 :
					System.out.print("Enter no of strings to add ");
					noOfStr = scanner.nextInt();
					scanner.nextLine();
					strArray = runnerObj.appendToStrArray(noOfStr,scanner);
					System.out.print("Enter delimitting char ");
					delimiter = scanner.nextLine();
					strBuilder = runnerObj.createStrBuilder(strArray,delimiter);
					runnerObj.printLengthOfStrBldr(strBuilder);
					System.out.print("Enter a string to insert ");
					string = scanner.nextLine();
					System.out.print("Enter position for insertion ");
					int insertIndex = scanner.nextInt();
					scanner.nextLine();
					runnerObj.insertString(strBuilder,string+delimiter,insertIndex+1);
					runnerObj.printLengthOfStrBldr(strBuilder);
					System.out.println("The Final String is " + strBuilder.toString());
					break;
			case 4 : 
					System.out.print("Enter no of strings to add ");
					noOfStr = scanner.nextInt();
					scanner.nextLine();
					strArray = runnerObj.appendToStrArray(noOfStr,scanner);
					System.out.print("Enter delimitting char ");
					delimiter = scanner.nextLine();					
					strBuilder = runnerObj.createStrBuilder(strArray,delimiter);
					runnerObj.printLengthOfStrBldr(strBuilder);	
					strBuilder = runnerObj.delString(strBuilder,1,delimiter);
					runnerObj.printLengthOfStrBldr(strBuilder);
					System.out.println("String after deletion " + strBuilder.toString());
					break;
			case 5 : 
					System.out.print("Enter no of strings to add ");
					noOfStr = scanner.nextInt();
					scanner.nextLine();
					strArray = runnerObj.appendToStrArray(noOfStr,scanner);
					System.out.print("Enter delimitting char ");
					delimiter = scanner.nextLine();					
					strBuilder = runnerObj.createStrBuilder(strArray,delimiter);
					runnerObj.printLengthOfStrBldr(strBuilder);					
					System.out.print("Enter  new delimitting char ");
					char newDelimiter = scanner.next().charAt(0);
					runnerObj.replaceChar(strBuilder,delimiter.charAt(0),newDelimiter);
					runnerObj.printLengthOfStrBldr(strBuilder);
					runnerObj.printStrbuilder(strBuilder);
					break;
			case 6 :					 
					System.out.print("Enter no of strings to add ");
					noOfStr = scanner.nextInt();
					scanner.nextLine();
					strArray = runnerObj.appendToStrArray(noOfStr,scanner);
					System.out.print("Enter delimitting char ");
					delimiter = scanner.nextLine();					
					strBuilder = runnerObj.createStrBuilder(strArray,delimiter);
					runnerObj.printLengthOfStrBldr(strBuilder);
					runnerObj.reverseStrBuilder(strBuilder);
					runnerObj.printLengthOfStrBldr(strBuilder);
					runnerObj.printStrbuilder(strBuilder);
					break;
			case 7 : 
					boolean check = true;
					System.out.print(" ENTER A STRING ");
					string = scanner.nextLine();
					if ( UtilityClass.getLength(string) < 10 ){
					while (check){
					System.out.print("THE LENGTH IS LESS THAN 10 ,PLEASE ENTER A STRING ");
					string = scanner.nextLine();
					if ( UtilityClass.getLength(string) < 10 ){
					}
					else{
						check = false;
					}
					}
					}
					strBuilder = runnerObj.createStrBuilder(string);
					runnerObj.printLengthOfStrBldr(strBuilder);
					strBuilder = runnerObj.delString(strBuilder,6,8);
					runnerObj.printLengthOfStrBldr(strBuilder);
					runnerObj.printStrbuilder(strBuilder);
					break;
			case 8 :
					 check = true;
					System.out.print("ENTER A STRING ");
					string = scanner.nextLine();
					if ( UtilityClass.getLength(string) < 10 ){
					while (check){
					System.out.print("THE LENGTH IS LESS THAN 10 ,ENTER A STRING ");
					string = scanner.nextLine();
					if ( UtilityClass.getLength(string) < 10 ){
					}
					else{
						check = false;
					}
					}
					}
					strBuilder = runnerObj.createStrBuilder(string);
					runnerObj.printLengthOfStrBldr(strBuilder);
					strBuilder = runnerObj.replaceString(strBuilder,6,8,"XYZ");
					runnerObj.printLengthOfStrBldr(strBuilder);
					runnerObj.printStrbuilder(strBuilder);
					break;
						
					
			case 9 : 
					System.out.print("Enter no of strings to add ");
					noOfStr = scanner.nextInt();
					scanner.nextLine();
					strArray = runnerObj.appendToStrArray(noOfStr,scanner);
					System.out.print("Enter delimitting char ");
					delimiter = scanner.nextLine();					
					strBuilder = runnerObj.createStrBuilder(strArray,delimiter);	
					int index = runnerObj.getIndexOf(strBuilder,delimiter);
					runnerObj.printStrbuilder(strBuilder);
					System.out.println("The first index of # is "+ index);
					break;
			case 10 :
					 
					System.out.print("Enter no of strings to add ");
					noOfStr = scanner.nextInt();
					scanner.nextLine();
					strArray = runnerObj.appendToStrArray(noOfStr,scanner);
					System.out.print("Enter delimitting char ");
					delimiter = scanner.nextLine();					
					strBuilder = runnerObj.createStrBuilder(strArray,delimiter);	
					index = runnerObj.getLastIndexOf(strBuilder,delimiter);
					runnerObj.printStrbuilder(strBuilder);
					System.out.println("The last of # is "+ index);
					break;	
			case 11 :
					bool = false;
					break;
			default :
					System.out.println("Enter a valid task ");
					break;					
			}
			}
			catch ( DataValidationException e){
				e.printStackTrace();
			}
		}
	}
	public String[] appendToStrArray(int noOfStr,Scanner scanner){
		System.out.println("Enter "+noOfStr+ " string ");
		String string;
		String[] strArray =  new String[noOfStr];
		for (  int i = 0;i<noOfStr;i++){
			string = scanner.nextLine();
			strArray[i]= string ;
		}
		return strArray;
	}
	public List appendToList(List<String> strList,int noOfStr,Scanner scanner){
		System.out.println("Enter "+noOfStr+ " string ");
		String string;
		for (  int i = 0;i<noOfStr;i++){
			string = scanner.nextLine();
			strList.add(string);
		}
		return strList;
	}
		
	public void printStrbuilder(StringBuilder strBuilder){
		System.out.println("The String is " + strBuilder.toString());
	}
	public void printLengthOfStrBldr(StringBuilder strBuilder)throws DataValidationException{
		try{
			System.out.println("The Length of string is = " + UtilityClass.getLength(strBuilder));
		}
		catch(DataValidationException e){
			throw new DataValidationException("ERROR FROM RUNNER ",e);
		}
	}
	public StringBuilder createStrBuilder() {		
		 return taskObj.getStrBuilder();
	}
	public StringBuilder createStrBuilder(String str) {
		return taskObj.getStrBuilder(str);
	}
	public StringBuilder createStrBuilder(String[] strArray,String delimitingChar) throws DataValidationException{
		return taskObj.getStrBuilder(strArray,delimitingChar);
	}
	public int getLastIndexOf(StringBuilder strBuilder,String string) throws DataValidationException{
		try{
		return taskObj.getLastIndexOf(strBuilder,string);
		}
		catch(DataValidationException e){
			throw new DataValidationException("ERROR FROM RUNNER ",e);
		}
	}
	public int  getIndexOf(StringBuilder strBuilder, String string)throws DataValidationException{
		try{
			return taskObj.getIndexOfStr(strBuilder,string);
		}
		catch(DataValidationException e){
			throw new DataValidationException("ERROR FROM RUNNER ",e);
		}
	}
	public StringBuilder appendString(StringBuilder strBuilder,String[] strArray) throws DataValidationException{
		try{
			return taskObj.appendToStrBuilder(strBuilder,strArray);
		}
		catch(DataValidationException e){
			throw new DataValidationException("ERROR FROM RUNNER ",e);
		}
	}
	public StringBuilder appendString(StringBuilder strBuilder,String[] strArray,String delimitingChar) throws DataValidationException{
		try{
			return taskObj.appendToStrBuilder(strBuilder,strArray,delimitingChar);
		}
		catch(DataValidationException e){
			throw new DataValidationException("ERROR FROM RUNNER ",e);
		}
	}
	public StringBuilder insertString(StringBuilder strBuilder,String string,int index) throws DataValidationException{
		try{
			return taskObj.insertToStrBuilder(strBuilder,string,index);
		}
		catch(DataValidationException e){
			throw new DataValidationException("ERROR FROM RUNNER ",e);
		}
	}
	public StringBuilder delString(StringBuilder strBuilder,int start,int end) throws DataValidationException{
		try{
			return taskObj.delFromStrBuilder(strBuilder,start,end);
		}
		catch(DataValidationException e){
			throw new DataValidationException("ERROR FROM RUNNER ",e);
		}
	}
	public StringBuilder delString(StringBuilder strBuilder,int position,String delimiter) throws DataValidationException{
		try{
			return taskObj.delFromStrBuilder(strBuilder,position,delimiter);
		}
		catch(DataValidationException e){
			throw new DataValidationException("ERROR FROM RUNNER ",e);
		}
	}
	public StringBuilder replaceChar(StringBuilder strBuilder,char oldChar,char newChar) throws DataValidationException{
		try{
			return taskObj.replaceCharStrBuilder(strBuilder,oldChar,newChar);
		}
		catch(DataValidationException e){
			throw new DataValidationException("ERROR FROM RUNNER ",e);
		}
	}
	public StringBuilder reverseStrBuilder(StringBuilder strBuilder) throws DataValidationException{
		try{
			return taskObj.reverseStrBuilder(strBuilder);
		}
		catch(DataValidationException e){
			throw new DataValidationException("ERROR FROM RUNNER ",e);
		}
	}
	public StringBuilder replaceString(StringBuilder strBuilder,int start,int end,String replacementString) throws DataValidationException{
		try{
			return taskObj.replaceStringInStrBuilder(strBuilder,start,end,replacementString);
		}
		catch(DataValidationException e)
		{
			throw new DataValidationException("ERROR FROM RUNNER ",e);
		}
	}
		
}
	
	
						
