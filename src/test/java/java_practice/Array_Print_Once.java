package java_practice;

import java.util.*;
import java.util.Map.Entry;

public class Array_Print_Once {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 4, 1, 2, 1, 3, 3 };

		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (Integer n : arr) {
			Integer count = m.get(n);
			if (count == null)
				m.put(n, 1);
			else
				m.put(n, ++count);
		}

		Set<Entry<Integer, Integer>> entrySet = m.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate element is: " + entry.getKey() + " & Number of Occurenece is: " + entry.getValue());
			}
		}
	}

}
