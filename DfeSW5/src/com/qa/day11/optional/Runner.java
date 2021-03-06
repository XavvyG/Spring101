package com.qa.day11.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

/* OPTIONALS
 * JAVA INTERMEDIATE
 */

public class Runner {
	public static void main(String[] args) {
		String item;

		if (Math.random() >= 0.5) {
			item = "Hello";

		} else {
			item = null;
		}
		Optional<String> itemString = Optional.ofNullable(item);
		
		//Mapping Optionals
//		Optional<String> upperCaseItemString = itemString.map(str -> str.toUpperCase());
//		
//		Optional<Integer> lengthOfString = itemString.map(str -> str.length());
//		
//		System.out.println(itemString.get());
//		System.out.println(upperCaseItemString.get());
//		System.out.println(lengthOfString.get());

		// orElseThrow method
//		String output = itemString.orElseThrow(()-> new RuntimeException());
//		System.out.println(output);

		// orElse method
//		String output = itemString.orElse(new String("No value"));
//		System.out.println(output);

		// isPresent method
//		String output = "No value";
//		if (itemString.isPresent()) {
//			output = itemString.get();
//		}
//		System.out.println(output);

		// try catch method
//		try {
//			String output = itemString.get();
//			System.out.println(output);
//		}catch (NoSuchElementException e) {
//			System.out.println(e.getMessage());
//		}
	}
}
