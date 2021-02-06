package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<>(); 
		
		hm.put("Name", "Rineesha");
		hm.put("RegdNo", "18B01A1223");
		hm.put("Year", "III");
		hm.put("Branch", "IT");
		
		System.out.println("Hash Map : " + hm);
		
		hm.remove("Year");
		System.out.println("Hash Map after deleting : " + hm);
		
		hm.put("RegdNo", "1223");
		System.out.println("Hash Map after updating : " + hm);
		
		System.out.println("Printing Elements with for loop.......");
		for (Entry<String, String> e : hm.entrySet()) 
            System.out.println(e.getKey() + " " + e.getValue()); 

	}

}
