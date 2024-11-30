package com.stringbuilder.stringbuildertask;
import java.util.*;
import com.exceptionhandling.DataValidationException;
import com.utility.UtilityClass;
public class StringBuilderTask{
	public StringBuilder getStrBuilder(){
		return new StringBuilder();
	}
	public StringBuilder getStrBuilder(String str) {
		return new StringBuilder(str);
	}
	public StringBuilder getStrBuilder(String[] strArray,char delimitingChar) throws DataValidationException{
		StringBuilder strBuilder = getStrBuilder();
		strBuilder = appendToStrBuilder(strBuilder,strArray,delimitingChar);
		return strBuilder;
	}
	public StringBuilder appendToStrBuilder(StringBuilder strBuilder,String[]  strArray) throws DataValidationException{
		UtilityClass.checkNull(strBuilder);
		for (String element : strArray)
		{
			strBuilder.append(element);
		}
		return strBuilder;
	}
	public StringBuilder appendToStrBuilder(StringBuilder strBuilder,String[]  strArray,char delimitingChar) throws DataValidationException{
		UtilityClass.checkNull(strBuilder);
		if ( UtilityClass.getLength(strBuilder) != 0){
			strBuilder.append(delimitingChar);
		}
		int sizeOfArray = UtilityClass.getLength(strArray);
		for (int i = 0;i< sizeOfArray;i++){
			if (i<(sizeOfArray-1)){
				strBuilder.append(strArray[i] + delimitingChar);
			}
			else{
				strBuilder.append(strArray[i]);
			}
			
		}
		return strBuilder;
	}
	public int getLastIndexOf(StringBuilder strBuilder,String str) throws DataValidationException{
		UtilityClass.checkNull(strBuilder);
		return strBuilder.lastIndexOf(str);
	}
	public int getIndexOfStr(StringBuilder strBuilder,String str) throws DataValidationException
	{
		UtilityClass.checkNull(strBuilder);
		return strBuilder.indexOf(str);
	}
	public StringBuilder insertToStrBuilder(StringBuilder strBuilder,String string,int index) throws DataValidationException
	{
		UtilityClass.checkBoundary(UtilityClass.getLength(strBuilder),index+1);
		return strBuilder.insert(index,string);
	}
	public StringBuilder delFromStrBuilder(StringBuilder strBuilder,int start,int end)throws DataValidationException{
		UtilityClass.checkNull(strBuilder);
		return strBuilder.delete(start,end);
	}
	public int getCustomIndexOf(StringBuilder strBuilder, String delimiter, int position)
	{
		//UtilsHub.checkNull(sb);
		//UtilsHub.checkNull(str);
		int index = 0;
		int fromIndex = 0;    
		for (int i=0; i<position; i++)
		{
			index = strBuilder.indexOf(delimiter, fromIndex);
			fromIndex = index+1;
		} 
		return index;
	}
		
	public StringBuilder delFromStrBuilder(StringBuilder strBuilder,int position,String delimiter) throws DataValidationException
	{
		//UtilityClass.checkNull(strBuilder);
		int start = getCustomIndexOf(strBuilder,delimiter,position-1);
		int end = getCustomIndexOf(strBuilder,delimiter,position);
		return delFromStrBuilder(strBuilder,start,end);
	}
	public StringBuilder replaceCharStrBuilder(StringBuilder strBuilder,char oldChar,char newChar) throws DataValidationException
	{
		UtilityClass.checkNull(strBuilder);
		int lengthOfStrBuilder = UtilityClass.getLength(strBuilder);
		char character;
		for ( int i=0;i<lengthOfStrBuilder;i++)
		{
			character = strBuilder.charAt(i);
			if ( character == oldChar)
			{
				strBuilder.setCharAt(i,newChar);
			}
		}
		return strBuilder;
	}
	public StringBuilder reverseStrBuilder(StringBuilder strBuilder) throws DataValidationException
	{
		UtilityClass.checkNull(strBuilder);
		return strBuilder.reverse();
	}
	public StringBuilder replaceStringInStrBuilder(StringBuilder strBuilder,int start,int end,String str) throws DataValidationException{
		UtilityClass.checkNull(strBuilder);
		return strBuilder.replace(start,end,str);
	}		
}		