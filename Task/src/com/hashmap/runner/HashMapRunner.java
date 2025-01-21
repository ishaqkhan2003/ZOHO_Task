package com.hashmap.runner.HashMapRunner;
import java.util.HashMap;
import com.utility.Utility;
import com.exceptionhandling.DataValidationException;
public class HashMapRunner{
	HashMapTask taskObj = new HashMapTask();
	public static void main(String[] args){
		HashMapRunner runnerObj = new HashMapRunner();
		boolean bool=true;
		int choice;
		while(bool){
			System.out.Print("Enter Task Number ");
			choice = Utility.getIntInput();
			switch(choice){
				case 1:
						runnerObj.operationOne();
						break;
			}
		}
	}
	public void operationOne()throws DataValidationException{
		Map<Integer,String> newHashMap = taskObj.getHashMap();
		
		
	}
	public void printHashMap(Map<K,V> hashMap) throws DataValidationException{
		Utility.checkNull(hashMap);
		System.out.println("The hash map is -"+hashMap);		
	}
	public void printHashMapSize(Map<K,V> hashMap) throws DataValidationException{
		Utility.checkNull(hashMap);
		System.out.println("The size of Hash Map is ");
	}
}
