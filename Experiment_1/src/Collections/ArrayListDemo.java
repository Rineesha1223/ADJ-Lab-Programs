package Collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("Rineesha");
		al.add(1223);
		al.add("III year");
		al.add("IT branch");
		al.add(9.37);
		
		System.out.println("Array List : " + al);
		
		al.remove(2);
		System.out.println("Array List after removing with index: " + al);
		
		al.remove("IT branch");
		System.out.println("Array List after removing with element: " + al);
		
		System.out.println("Printing List with for loop");
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}

}
