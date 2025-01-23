package com.hashmap.task;
import java.util.HashMap;
import com.exceptionhandling.DataValidationException;
import com.utility.Utility;
import java.util.Map;
import java.util.function.BiFunction;
public class HashMapTask{
	public <K,V>  Map<K,V> getHashMap(){
		return new HashMap<>();
	}
	public <K,V> int getMapSize(Map<K,V>  map)throws DataValidationException{
		return  Utility.getLength(map);
	}
	public <K,V> void putToMap(Map <K,V> map,K key,V value) throws DataValidationException{
		Utility.checkNull(map);
		map.put(key,value);
	}
	public <K,V> V replaceValue(Map<K,V> map,K key,V value) throws DataValidationException{
		Utility.checkNull(map);
		return map.replace(key,value);
	}
	public <K,V> boolean checkContainsKey(Map <K,V> map ,K key) throws DataValidationException{
		Utility.checkNull(map);
		return map.containsKey(key);
	}
	public <K,V> boolean checkContainsValue(Map<K,V> map,V value) throws DataValidationException{
		Utility.checkNull(map);
		return map.containsValue(value);
	}
	public <K,V> void replaceAllValue(Map<K,V> map,BiFunction< K,V, V> biFunction) throws DataValidationException{
		Utility.checkNull(map);
		map.replaceAll(biFunction);
	}
}