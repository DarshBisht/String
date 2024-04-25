/*String:- String is non-primitive data types because it references a memory location 
 *where data is stored in the heap memory (or String Constant Pool) i.e, it references 
 *to the memory where an object is actually placed. And thus the variable of a non-
 *primitive data types or object reference variable. This object reference variable lives
 *on the stack memory and the object to which it points always lives on the heap memory
 *The stack holds a pointer to the object on the heap.
 *Thus all non-primitive data types are simply called objects which are created by
 *instantiating a class.
 *
 *Points to note:-
 *1) String is a non-primitive data type.
 *2) String is the sequence of characters or say, String is an array of characters.
 *	 For eg. -> char[] c = {'d','a','r','s','h','a','n'};	// Java have predefined an interface "CharSequence" for sequence of character (to represent the sequence).
 *			 -> String s = new String(c);
 *				is name as... String s = "darshan";
 *3) String is a class : java has already predefined a class of String and String
 *	 parent class is Object which can be inherited and it also implements the
 *	 CharSequence, Serializable, Comparable interface class:-
 *	 Syntax:- public final class String extends Object implements CharSequence, Serializable, Comparable
 *	 {
 *		// We can use predefined methods of Sting class.
 *	 };
 *Serializable:- This interface is used when we need to store a copy of the object and
 *				 send them to another process which runs on the same system or over
 *				 the network.
 *Comparable:- This interface is used to order the objects of the class. It has only one
 *			   method i.e. compareTo();
 *4) We can create String class object by:-
 *	 String s = new String();	// It will create an IMMUTABLE(unchangeable) object.
 *	 String s= "darshan";	// This is also a way of creating an object.
 *5) To create String, there are three classes:-
 *	 i)Sting ii)StingBuffer iii)StringBuilder
 *i)Sting: String s = new String(); or String s = "darshan";
 *ii)StingBuffer: StringBuffer sb = new StringBuffer();
 *iii)StringBuilder: StringBuilder sb = new StringBuilder();
 **/

package com.java.string;

// Uses of String
public class StringIntro_1 {
	public static void main(String[] args) {
		char[] c = {'d','a','r','s','h','a','n'};
		 String s = new String(c);	// Sting is Array of characters and here we are assigning the c value into the string and creating the immutable object.
		 System.out.println(s);
		 String s2 = "Darshan";	// This is also a way of creating an object of String class.
		 StringBuffer sb = new StringBuffer("Rahul");	// We can create object of StringBuffer.
		 System.out.println(sb);
		 StringBuilder sb2 = new StringBuilder("Mohit");	// We can create object of StringBuilder.
		 System.out.println(sb2);
	}
};