package application;

import java.util.*;

public class LinkedHashSet {

	public static void main(String[] args) {
		Set<String> set = new java.util.LinkedHashSet<>();
		
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Frnsco");
		set.add("Beijing");
		set.add("New York");
		
		System.out.println(set);
	}

}
