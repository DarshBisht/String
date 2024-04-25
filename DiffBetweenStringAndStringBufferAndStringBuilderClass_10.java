/*Difference between String, StringBuffer and StringBuilder:-
 *1) String:-
 *	 i) Storage-> Heap Area and SCP
 *	 ii) Object-> Creates immutable objects
 *	 iii) Memory-> If we change/modify the value of String a lot of times it will allocate more memory
 *	 iv) Thread safe-> It is not thread safe (non-synchronized)
 *	 v) Performance-> slow
 *	 vi) Use-> If data is not changing friquently use String class like age, place, date etc. 
 *
 *2) StirngBuffer:-
 *	 i) Storage-> Heap Area
 *	 ii) Object-> Creates mutable objects
 *	 iii) Memory-> Consumes less memory
 *	 iv) Thread safe-> It is thread safe because all methods are synchronized
 *	 v) Performance-> Fast as compared to String
 *	 vi) Use-> If data is changing friquently use StringBuffer class like calc, notepad, editor etc.
 *
 *3) StringBuilder:-
 *	 i) Storage-> Heap Area
 *	 ii) Object-> Creates mutable objects 
 *	 iii) Memory-> Occupy less memory
 *	 iv) Thread safe-> It is not thread safe because all methods are non-synchronized
 *	 v) Performance-> Fast as compared to StringBuffer
 *	 vi) Use-> If data is changing friquently use StringBuffer class*/

package com.java.string;

public class DiffBetweenStringAndStringBufferAndStringBuilderClass_10 {

	public static void main(String[] args) {
		
		//String
		String name1 = "Darshan";
		System.out.println(name1.concat(" Bisht"));
		
		//StringBuffer
		StringBuffer name2 = new StringBuffer("Ram");
		System.out.println(name2.capacity());
		System.out.println(name2.append(" Lal"));
		
		//StringBuilder
		StringBuilder name3 = new StringBuilder("Mohan");
		System.out.println(name3.capacity());
		System.out.println(name3.append(" Singh"));
	}
};