package com.java.string;

public class ReverseAString_11 {

	private static void reverse(String name, int length) {
		String name2 = "";

		for (int i = length - 1; i >= 0; i--) {
			name2 += name.charAt(i);
		}
		System.out.println(name2);
	}

	public static void main(String[] args) {
		String name = "deepak";
		reverse(name, name.length());
	}
};
