package java_practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Array_Duplicate {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Nitin");
		al.add("rohan");
		al.add("rahul");
		al.add("Nitin");
		al.add("rohan");
		System.out.println(al);

		HashSet<String> hs = new HashSet<String>();
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			String str = (String) itr.next();
			if (!hs.add(str)) {
				System.out.println("the duplicate element is: " + str);
			}
		}

	}
}
