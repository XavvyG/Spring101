package com.qa.day11.tryfinally;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {

		// try-finally block conventional with resources
		Scanner sc = new Scanner(System.in);
		try {

		} finally {
			try {
				sc.close();
			} catch (IllegalStateException e) {

			}
		}
		
		
		//try with resource block
		// - auto closes the scanner 
		// - doesn't require a catch or finally block, i.e. they are optional]
		try (Scanner sc2 = new Scanner(System.in)){
			
		}
		
		//Multiple catch blocks
		try {
			
		}catch (NullPointerException e) {
			
		}catch (Exception e) {
			
		}finally {
			
		}
	}

}
