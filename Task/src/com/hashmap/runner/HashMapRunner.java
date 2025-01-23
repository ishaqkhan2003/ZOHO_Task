package com.hashmap.runner;
import java.util.HashMap;
import com.utility.Utility;
import java.util.Scanner;
import java.util.Map;
import java.util.function.BiFunction;
import com.hashmap.task.HashMapTask;
import com.customeobject.CustomeObject;
import com.exceptionhandling.DataValidationException;
public class HashMapRunner{
	HashMapTask taskObj = new HashMapTask();
	public static void main(String[] args){
		HashMapRunner runnerObj = new HashMapRunner();
		boolean bool=true;
		int choice;
		while(bool){
			try{
			System.out.print("Enter Task Number ");
			choice = Utility.getIntInput();
			switch(choice){
				case 1:
						runnerObj.operationOne();
						break;
				case 2:
						runnerObj.operationTwo();
						break;
				case 3:
						runnerObj.operationThree();
						break;
				case 4:
						runnerObj.operationFour();
						break;
				case 5:
						runnerObj.operationFive();
						break;
				case 6:
						runnerObj.operationSix();
						break;
				case 7:
						runnerObj.operationSeven();
						break;
				case 8:
						runnerObj.operationEight();
						break;
				case 9:
						runnerObj.operationNine();
						break;
				case 10:
						runnerObj.operationTen();
						break;
				case 21:
						bool =  false;
						break;
			}
			}
			catch ( DataValidationException e){
				e.printStackTrace();
			}
		}
	}
	public void operationOne()throws DataValidationException{
		try{
		Map<Integer,String> newHashMap = taskObj.getHashMap();
		printHashMap(newHashMap);
		printHashMapSize(newHashMap);
		}
		catch ( DataValidationException e){
			e.printStackTrace();
		}
		
	}
	public void operationTwo() throws DataValidationException	 {
		try{
			Map<String,String> newHashMap = taskObj.getHashMap();
			System.out.print("Enter number of pairs to add  ");
			int noOfPair = Utility.getIntInput(),i;
			String key ,value;
			for (i=0;i<noOfPair;i++){
				System.out.print("Enter key  (String)");
				key = Utility.getStrInput();
				System.out.print("Enter  value (String)");
				value = Utility.getStrInput();
				taskObj.putToMap(newHashMap,key,value);
			}
		printHashMap(newHashMap);
		printHashMapSize(newHashMap);
 		}
		catch ( DataValidationException e){
			e.printStackTrace();
		}
	}
	public void operationThree() throws DataValidationException	 {
		try{
			Map<Integer,Integer> newHashMap = taskObj.getHashMap();
			System.out.print("Enter number of pairs to add  ");
			int noOfPair = Utility.getIntInput(),i,key,value;
			for (i=0;i<noOfPair;i++){
				System.out.print("Enter key  (Integer)");
				key = Utility.getIntInput();
				System.out.print("Enter  value (Integer)");
				value = Utility.getIntInput();
				taskObj.putToMap(newHashMap,key,value);
			}
		printHashMap(newHashMap);
		printHashMapSize(newHashMap);
 		}
		catch ( DataValidationException e){
			e.printStackTrace();
		}
	}
	public void operationFour() throws DataValidationException{
		try{
			Map<String,Integer> newHashMap = taskObj.getHashMap();
			System.out.print("Enter number of pairs to add  ");
			int noOfPair = Utility.getIntInput(),i,value;
			String key;
			for (i=0;i<noOfPair;i++){
				System.out.print("Enter key  (String)");
				key = Utility.getStrInput();
				System.out.print("Enter  value (Integer)");
				value = Utility.getIntInput();
				taskObj.putToMap(newHashMap,key,value);
			}
		printHashMap(newHashMap);
		printHashMapSize(newHashMap);
			
		}
		catch ( DataValidationException e){
			e.printStackTrace();
		}
	}
	public void operationFive() throws DataValidationException{
		try{
			Map<Integer,CustomeObject> newHashMap = taskObj.getHashMap();
			System.out.print("Enter number of pairs to add ");
			int noOfPair = Utility.getIntInput(),i,key;
			for(i = 0;i<noOfPair;i++){
				System.out.print("Enter key  (Integer)");
				key = Utility.getIntInput();
				taskObj.putToMap(newHashMap,key,new CustomeObject("customeObj_"+(i+1)));
				
			}
		printHashMap(newHashMap);
		printHashMapSize(newHashMap);
			
		}
		catch(DataValidationException e){
			e.printStackTrace();
		}
	}
	public void operationSix() throws DataValidationException{
		try{
			Map<String,String> newHashMap = taskObj.getHashMap();
			addStrToHashMap(newHashMap);
			System.out.print("Enter key whose value need to be null ");
			String nullKey = Utility.getStrInput();
			String check = taskObj.replaceValue(newHashMap,nullKey,null);
			if ( check ==  null){
				System.out.println("The given key is not present ");
			}
			printHashMap(newHashMap);
			printHashMapSize(newHashMap);
			
		}
		catch(DataValidationException e){
			e.printStackTrace();
		}
	}
	public void operationSeven() throws DataValidationException{
		try{
			Map<String,String> newHashMap = taskObj.getHashMap();
			addStrToHashMap(newHashMap);
			System.out.println("Making a key as null And non null value for it ");
			taskObj.putToMap(newHashMap,null,"Non Null valur");
			printHashMap(newHashMap);
			printHashMapSize(newHashMap);			
		}
		catch ( DataValidationException e){
			e.printStackTrace();
		}
	}
	public void operationEight() throws DataValidationException{
		try{
			Map<String,String> newHashMap = taskObj.getHashMap();
			addStrToHashMap(newHashMap);
			System.out.print("Enter a key to check if it exist in HasMap ");
			String checkKey = Utility.getStrInput();
			if( taskObj.checkContainsKey(newHashMap,checkKey)){
				System.out.println("The given key is present ");
			}
			else{
				System.out.println("The given key is not present ");
			}
		}
		catch( DataValidationException e){
			e.printStackTrace();
		}
	}
	public void operationNine() throws DataValidationException{
		try{
			Map<String,String> newHashMap = taskObj.getHashMap();
			addStrToHashMap(newHashMap);
			System.out.print("Enter a value to check if it exist in HasMap ");
			String checkValue = Utility.getStrInput();
			if( taskObj.checkContainsValue(newHashMap,checkValue)){
				System.out.println("The given value is present ");
			}
			else{
				System.out.println("The given value is not present ");
			}
		}
		catch ( DataValidationException e){
			e.printStackTrace();
		}
	}
	public void operationTen() throws DataValidationException{
		try{
			Map<String,String> newHashMap = taskObj.getHashMap();
			addStrToHashMap(newHashMap);
			
			BiFunction<String,String,String> biFunction = (key,value)->value = Utility.getStrInput();
			taskObj.replaceAllValue(newHashMap,biFunction);
			printHashMap(newHashMap);
			printHashMapSize(newHashMap);	
			
		}
		catch (DataValidationException e){
			e.printStackTrace();
		}
	}
	
	public <K,V> void printHashMap(Map<K,V> hashMap) throws DataValidationException{
		Utility.checkNull(hashMap);
		System.out.println("The hash map is - "+hashMap);		
	}
	public <K,V> void printHashMapSize(Map<K,V> hashMap) throws DataValidationException{
		Utility.checkNull(hashMap);
		System.out.println("The size of Hash Map is "+taskObj.getMapSize(hashMap));
	}
	public  void addStrToHashMap(Map<String,String>  newHashMap) throws DataValidationException{
		Utility.checkNull(newHashMap);
			System.out.print("Enter number of pairs to add  ");
			int noOfPair = Utility.getIntInput(),i;
			String key,value;
			for (i=0;i<noOfPair;i++){
				System.out.print("Enter key  (String)");
				key = Utility.getStrInput();
				System.out.print("Enter  value (String)");
				value = Utility.getStrInput();
				taskObj.putToMap(newHashMap,key,value);
			}
			System.out.println("The Orginal HashMap is ");
			printHashMap(newHashMap);
			//printHashMapSize(newHashMap);
		
	}

}
