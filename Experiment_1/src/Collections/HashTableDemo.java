package Collections;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<>(); 
		
		ht.put("Name", "Rineesha");
		ht.put("RegdNo", "18B01A1223");
		ht.put("Year", "III");
		ht.put("Branch", "IT");
		
		System.out.println("Hash Table : " + ht);
		
		ht.remove("Year");
		System.out.println("Hash Table after deleting : " + ht);
		
		ht.put("RegdNo", "1223");
		System.out.println("Hash Table after updating : " + ht);
		
		System.out.println("Printing Elements with for loop.......");
		for (Entry<String, String> e : ht.entrySet()) 
            System.out.println(e.getKey() + " " + e.getValue()); 
		
	}

}
