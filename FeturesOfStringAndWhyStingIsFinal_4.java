/*Why String class is final:- String class has got special features which is not
 *available to other java classes and making the String class final prevents subclasses
 *that could break these assumptions
 *
 *String class is final because we don't want that the features of Sting class should be 
 *modified if it gets modified so anyone can change the object immutablity and all other
 *features of String class so by doing final String class no one can inherit it or override it.
 *
 *Difference between final and immutable:- 
 *final is used for variable, method and class and immutable is only used for objects.
 *
 *Features of String:-
 *1) String Constant Pool (SCP):- It is special memory location in heap area which stores
 *	 String Literals.
 *2) Immutable Object:- The String objects are immutable which means once String object
 *	 is created it's data or state  can't be changed but a new string object is created.
 *3) + Operator for String:- Multiple String can be concatinated using + operator.
 *4) Security:- The parameters used for network connections, database connection URLs,
 *	 usernames/passwords, etc are represented in Strings. if it was mutable, these
 *	 parameters could be changed easily.
 *5) Class loading:- String is used as an arguments for class loading. If mutable it could
 *	 result in the wrong class being loaded (because mutable objects change their state).
 *6) Synchronization and Concurrency:- Making String immutable automatically makes them
 *	 thread safe thereby solving the synchronization issues.
 *7) Memory management:- When compiler optimizes or String objects, it seems that if tow
 *	 objects have the same value (a="test", and b="test") and thus we need only one
 *	 string object (for both a and b, these two will point to the same object).*/

package com.java.string;

public class FeturesOfStringAndWhyStingIsFinal_4 {};	// This class is not for use only for class file naming purpose.

//Difference between final and immutable
class StingFinalImmutable {
	public static void main(String[] args) {
		
		//When StringBuffer is not final
		StringBuffer sb = new StringBuffer("deepak");	// StringBuffer class is not a immutable so we can modify the object/value here.
		sb=sb.append(" java");
		System.out.println(sb);
		
		//When StringBuffer is final
		final StringBuffer sb2 = new StringBuffer("deepak");
//		sb2=sb2.append(" Sir");	// When StringBuffer is final we can not reassign it because we can not change the final things but we can create the object of it.
		sb2.append(" Sir");	// object created.
		System.out.println(sb2);
		
		//Using  String
		final String s = new String("Ram");
//		s=s.concat(" Mohan");	// When String is final we can not reassign it.
		s.concat(" Mohan");		// Creating object but can not be reassigned.
		System.out.println(s);
	}
};