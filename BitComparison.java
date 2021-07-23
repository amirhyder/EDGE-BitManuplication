package com.systems.ltd;


import java.io.IOException;


public class BitComparison {
	
	public static void main(String[] args) throws IOException {
		
		String value1="amir";
		String value2="rashid";
		System.out.println("First string: "+value1);
		System.out.println("Second string: "+value2);
		checkCharacters(value1, value2);
	}

	public static void checkCharacters(String str1, String str2) {
		
		int checker = 0;
		byte i = 0;
		for (i = 0; i < str1.length(); ++i) {
			checker |=(1 << (str1.charAt(i) - 'a'));
		}
		
		for (i = 0; i < str2.length(); i++) {
			if ((checker & (1 << str2.charAt(i) - 'a')) > 0) {
				System.out.println("Common Character: " + str2.charAt(i));
			}

		}
		
		


	}


}
