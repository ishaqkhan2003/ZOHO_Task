package com.stringbuilder.stringbuildertask;
import java.util.*;
import com.exceptionhandling.DataValidationException;
import com.utility.UtilityClass;
public class StringBuilderTask
{
	public StringBuilder getStrBuilder()
	{
		return new StringBuilder();
	}
	public StringBuilder getStrBuilder(String str) 
	{
		return new StringBuilder(str);
	}
	public StringBuilder getStrBuilder(List<String> strList,char delimitingChar) throws DataValidationException
	{
		StringBuilder strBuilder = getStrBuilder();
		strBuilder = appendToStrBuilder(strBuilder,strList,delimitingChar);
		return strBuilder;
	}
	public StringBuilder appendToStrBuilder(StringBuilder strBuilder,List<String> strList) throws DataValidationException
	{
		UtilityClass.checkNull(strBuilder);
		for (String element : strList)
		{
			strBuilder.append(element);
		}
		return strBuilder;
	}
	public StringBuilder appendToStrBuilder(StringBuilder strBuilder,List<String> strList,char delimitingChar) throws DataValidationException
	{
		UtilityClass.checkNull(strBuilder);
		if ( UtilityClass.getLength(strBuilder) != 0){
			strBuilder.append(delimitingChar);
		}
		int sizeOfList = strList.size();
		for (int i = 0;i<sizeOfList;i++)
		{
			if (i<(sizeOfList-1))
			{
				strBuilder.append(strList.get(i) + delimitingChar);
			}
			else
			{
				strBuilder.append(strList.get(i));
			}
			
		}
		return strBuilder;
	}
	public int getLastIndexOf(StringBuilder strBuilder,String str) throws DataValidationException
	{
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
	public StringBuilder delFromStrBuilder(StringBuilder strBuilder,String str) throws DataValidationException
	{
		UtilityClass.checkNull(strBuilder);
		int index = getIndexOfStr(strBuilder,str);
		return strBuilder.delete(index,UtilityClass.getLength(str));
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
		
		
		