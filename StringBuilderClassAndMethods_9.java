/*There are 3 ways to create String class:-
 *i) String -> Creates immutable objects
 *ii) StringBuffer -> Creates mutable objects and all the methods are synchronized.
 *iii) StringBuilder -> Creates mutable objects and all the methods are non-synchronized.
 *
 *StringBuilder:- To overcome the problem of slow performance of StringBuffer methods.
 *(Due to synchronized methods which is thread safe which slow down the performance of methods)
 *Java introduced StringBuilder concept in JDK 1.5 version and creates all the methods
 *of StringBuilder as non-Synchronized which increases the methods performance.
 *
 *There are same as StringBuffer class total 4 main constructor in StringBuilder class:-
 *1)StringBuilder() :- no args cons.
 *2)StringBuilder(CharSequecne seq) :- we can provide CharSequece
 *3)StringBuilder(String str):- we can provide String
 *4)StringBuilder(int capacity) :- we can provide int
 *
 *There are same predefined methods in StringBuilder class but all the method are non-
 *synchronized.*/

package com.java.string;

public class StringBuilderClassAndMethods_9 {
	
public static void main(String[] args) {
		
		//StingBuilder cons
		//No args
		//capacity() method
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());	//It tells how many characters can be stored by default in the sb object which is 16.
		
		//Parameterized CharSequence
		System.out.println("----------------1");
		StringBuilder sb1 = new StringBuilder('a');
		System.out.println(sb1.capacity());	// It's providing the int ASCII value of character 'a' now it's capacity is 97 it can store 97 characters.
		
		//Parameterized String
		System.out.println("----------------2");
		StringBuilder sb2 = new StringBuilder("hello");
		System.out.println(sb2);
		System.out.println(sb2.capacity());	//16+string length=21
		
		//Parameterized integer
		System.out.println("----------------3");
		StringBuilder sb3 = new StringBuilder(1000);	//Provide the size/capacity
		System.out.println(sb3.capacity());		//now it can store 1000 characters
		
		//append() method
		System.out.println("----------------4");
		System.out.println(sb.capacity());
		sb.append("Darshan Singh Bis");	//length is 17 when length was under till 16 the capacity was also 16 when length became 17 it increases it's size with (old capacity*2+2 or old capacity+1*2).
		System.out.println(sb);
		System.out.println(sb.capacity());	//How StringBuilder increase it's capacity by default : (default capacity(16)*2+2 = 34 or default capacity(16)+1*2)
		
		//delete() method
		System.out.println("----------------5");
		System.out.println(sb.delete(13, 17));
		
		//deleteChar() method
		System.out.println("----------------6");
		System.out.println(sb.deleteCharAt(7));
		
		//equals() method
		System.out.println("----------------7");
		StringBuilder sb4 = new StringBuilder("Darshan");
		StringBuilder sb5 = new StringBuilder("Darshan");
		System.out.println(sb4.equals(sb5));	//false because reference s4 and s5 and not pointing the same object they have different object created.
		
		//insert() method
		System.out.println("----------------8");
		System.out.println(sb4.insert(3, "rr"));
		
		//replace() method
		System.out.println("----------------9");
		System.out.println(sb4.replace(3, 5,""));
		
		//reverse() method
		System.out.println("----------------10");
		System.out.println(sb4.reverse());
		
		//ensuseCapacity() method
		System.out.println("----------------11");
		sb4.ensureCapacity(100);	// to provide the maximum capacity to the s4 StringBufffer Object it's return type is void so we cannot write this in sop directly.
		System.out.println(sb4.capacity());
		
		//setCharAt() method
		System.out.println("----------------12");
		sb5.setCharAt(4, 'a');
		System.out.println(sb5);
		
		//setLength() method
		System.out.println("----------------13");
		sb5.setLength(4);	//Provide maximum length should be 4 of sb5
		System.out.println(sb5);
		
		//trimToSize() method
		System.out.println("----------------14");
		StringBuilder sb6 = new StringBuilder();
		sb6.ensureCapacity(100);
		System.out.println(sb6.append("Hello"));
		System.out.println(sb6.capacity());
		sb6.trimToSize();	// It release the unused capacity in the sb5 StringBuilder 
		System.out.println(sb6.capacity());	// After trimToSize() the capacity of sb6 is now 5
	}
}
