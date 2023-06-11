package com.collections.demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
	
		//HashMap implements Map interface
		//We store data in the form of key & value pair
		
		Map myMap = new HashMap();
		
		myMap.put("appBrowser", "Edge");
		myMap.put("appUrl", "https://www.speaklanguages.com/english/");
		myMap.put("appUserEmailID", "johnnitesh2@gmail.com");
		myMap.put("apppassword", "Testing@123");
		myMap.put("appUserName", "nitesh");
		
		//If you try to add new value to an existing key, the old value will be replaced with new value
		myMap.put("appBrowser", "Chrome");
		
		System.out.println(myMap);
		
		System.out.println(myMap.get("appBrowser"));
		System.out.println(myMap.get("appUserName"));
		
		System.out.println(myMap.containsKey("appUserEmailID"));
		System.out.println(myMap.containsKey("postalCode"));
		
		System.out.println(myMap.containsValue("Edge"));
		System.out.println(myMap.containsValue("nitesh"));
		
		System.out.println(myMap.remove("appUserName", "nitesh"));
		
		System.out.println(myMap);

	}

}
