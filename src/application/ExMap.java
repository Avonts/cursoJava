package application;

import java.util.Map;
import java.util.TreeMap;

public class ExMap {

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("userName", "Maria");
		cookies.put("Email", "maria@gmail.com");
		cookies.put("Phone", "36054885");
		
		cookies.remove("Email");
		cookies.put("Phone", "963628105");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("Phone"));
		System.out.println("Phone number: " + cookies.get("Phone"));
		System.out.println("Email: " + cookies.get("Email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println();
		System.out.println("ALL COOKIES:");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
		
		

	}

}
