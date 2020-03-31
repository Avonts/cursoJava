package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class AulaSet {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<>();

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");

		for (String p : set) {
			System.out.println(p);
		}

	}

}
