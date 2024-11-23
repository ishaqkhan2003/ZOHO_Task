package com.stringbuilder.stringbuilderrunner;
import java.util.*;
import com.exceptionhandling.DataValidationException;
import com.utility.UtilityClass;
import com.stringbuilder.stringbuildertask.StringBuilderTask;
public class StringBuilderRunner{
	StringBuilderTask taskObj = new StringBuilderTask();
	public static void main(String[] args){
		List<String> strList = new ArrayList<>();
		StringBuilder strBuilder;
		String string;
		StringBuilderRunner runnerObj = new StringBuilderRunner();

		Scanner scanner = new Scanner(System.in);
		boolean bool  = true;
		int i;
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
					strList.clear();
					strList = runnerObj.appendToList(strList,1,scanner);
					strBuilder = runnerObj.appendString(strBuilder,strList);
					runnerObj.printLengthOfStrBldr(strBuilder);
					System.out.println("The Final String is " + strBuilder.toString());
					break;
			case 2 :
					System.out.println("Enter a string  ");
					string = scanner.nextLine();
					strBuilder = runnerObj.createStrBuilder(string);
					runnerObj.printLengthOfStrBldr(strBuilder);
					strList.clear();
					strList = runnerObj.appendToList(strList,4,scanner);
					strBuilder = runnerObj.appendString(strBuilder,strList,'#');
					runnerObj.printLengthOfStrBldr(strBuilder);
					System.out.println("The Final String is " + strBuilder.toString());
					break;
			case 3 :
					strList.clear();
					strList = runnerObj.appendToList(strList,2,scanner);
					strBuilder = runnerObj.createStrBuilder(strList,' ');
					runnerObj.printLengthOfStrBldr(strBuilder);
					System.out.print("Enter a string to insert ");
					string = scanner.nextLine();
					int test = runnerObj.getIndexOf(strBuilder," ");
					System.out.println("debugging insert "+test);
					strBuilder = runnerObj.insertString(strBuilder,string+' ',test+1);
					runnerObj.printLengthOfStrBldr(strBuilder);
					System.out.println("The Final String is " + strBuilder.toString());
					break;
			case 4 : 
					strList.clear();
					strList = runnerObj.appendToList(strList,2,scanner);
					strBuilder = runnerObj.createStrBuilder(strList,' ');
					runnerObj.printLengthOfStrBldr(strBuilder);	
					strBuilder = runnerObj.delString(strBuilder,strList.get(0));
					runnerObj.printLengthOfStrBldr(strBuilder);
					System.out.println("String after deletion " + strBuilder.toString());
					break;
			case 5 :
					strList.clear();
					runnerObj.appendToList(strList,3,scanner);	
					strBuilder = runnerObj.createStrBuilder(strList,' ');
					runnerObj.printLengthOfStrBldr(strBuilder);
					runnerObj.replaceChar(strBuilder,' ','-');
					runnerObj.printLengthOfStrBldr(strBuilder);
					runnerObj.printStrbuilder(strBuilder);
					break;
			case 6 :
					strList.clear();
					strList = runnerObj.appendToList(strList,3,scanner);	
					strBuilder = runnerObj.createStrBuilder(strList,' ');
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
						//System.out.println("OOPS the entered string is less than 10 characters ");
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
						//System.out.println("OOPS the entered string is less than 10 characters ");
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
					strList.clear();
					strList = runnerObj.appendToList(strList,3,scanner);	
					strBuilder = runnerObj.createStrBuilder(strList,'#');		
					int index = runnerObj.getIndexOf(strBuilder,"#");
					runnerObj.printStrbuilder(strBuilder);
					System.out.println("The first index of # is "+ index);
					break;
			case 10 :
					strList.clear();
					strList = runnerObj.appendToList(strList,3,scanner);	
					strBuilder = runnerObj.createStrBuilder(strList,'#');		
					index = runnerObj.getLastIndexOf(strBuilder,"#");
					runnerObj.printStrbuilder(strBuilder);
					System.out.println("The first last of # is "+ index);
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
	public StringBuilder createStrBuilder(List<String> strList,char delimitingChar) throws DataValidationException{
		return taskObj.getStrBuilder(strList,delimitingChar);
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
	public StringBuilder appendString(StringBuilder strBuilder,List<String> strList) throws DataValidationException{
		try{
			return taskObj.appendToStrBuilder(strBuilder,strList);
		}
		catch(DataValidationException e){
			throw new DataValidationException("ERROR FROM RUNNER ",e);
		}
	}
	public StringBuilder appendString(StringBuilder strBuilder,List<String> strList,char delimitingChar) throws DataValidationException{
		try{
			return taskObj.appendToStrBuilder(strBuilder,strList,'#');
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
	public StringBuilder delString(StringBuilder strBuilder,String str) throws DataValidationException{
		try{
			return taskObj.delFromStrBuilder(strBuilder,str);
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
	
	
						
