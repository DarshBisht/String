package com.java.string;

import java.util.HashMap;
import java.util.Map;

public class FindMaxOccurringCharacter_12 {

	public static void main(String[] args) {
		
		//First approach
		String s = "abbccc";
		s=s.replaceAll("\\s","");	//"\\s" this is at regix used to remove the spaces if we do not remove spaces our program will count the spaces also.
		int[] arr = new int[127];	// by default 0 will be assigned to the array
		
		for(int i=0; i<s.length(); i++) {	//0,1,2,3,4,5,6
			arr[s.charAt(i)]=arr[s.charAt(i)]+1;	//arr[97]=0+1, arr[98]=0+1, arr[98]=1+1, arr[99]=0+1, arr[99]1+1, arr[99]=2+1
		}
		
		int max = Integer.MIN_VALUE;
		char c = ' ';
		for(int i=0; i<s.length(); i++) {
			if(arr[s.charAt(i)]>max) {
				max=arr[s.charAt(i)];
				c=s.charAt(i);
			}
		}
		System.out.println("Maxi. character repeated is: "+c);
		
		
		//Second approach
		String s2 = "This is a second approach";
		s2=s2.replaceAll("\\s", "");
		
		HashMap<Character,Integer> hm = new HashMap<>();
		
		for(int i=0; i<s2.length(); i++) {
		
			if(hm.containsKey(s2.charAt(i))) {
				hm.put(s2.charAt(i), hm.get(s2.charAt(i))+1);
			}
			else
				hm.put(s2.charAt(i), 1);
		}
		
		int max_count=Integer.MIN_VALUE;
		char max_char=' ';
		for(Map.Entry<Character, Integer> me: hm.entrySet()) {
			
			if(me.getValue() > max_count) {
				max_count=me.getValue();
				max_char=me.getKey();
			}
		}
		System.out.println("Maximum charcter repreated is: "+max_char);
	}
};