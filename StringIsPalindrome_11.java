package com.java.string;

public class StringIsPalindrome_11 {

	private static void palindrome(String name1, int length) {
		String name2 = "";

		for (int i = length - 1; i >= 0; i--) {
			name2 += name1.charAt(i);
		}
		if(name1.equalsIgnoreCase(name2))
		System.out.println(name1+" is a Palindrome string");
		else
			System.out.println(name1+" is not a Palindrome string");
	}

	public static void main(String[] args) {
		String name1 = "Naman";
		palindrome(name1, name1.length());
	}

}
