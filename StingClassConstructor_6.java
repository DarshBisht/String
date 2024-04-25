/*In String there any some predefined constructor are available but below are some 
 *1) public Sting(){};
 *2) public Sting(String s){};
 *3) public Sting(StringBuffer sb){};
 *4) public Sting(StringBuilder sb){};
 *5) public Sting(char[] ch){};
 *6) public Sting(byte[] b){};
 *
 *Why char array is preferred over string for strong passwords?
 *String objects are immutable in java and therefore if a password is stored as plain
 *test it will be available in memory until Garbage collector clears it, but String
 *objects are stored in String Literal Pool for re-usability and garbage collection
 *is not applicable in SCP, which is a security threat.
 *With an array, you can explicitly wipe the data after you're done with it. You can
 *overwrite the array with anything you like, and the password won't be present
 *anywhere in the system, even before garbage collection.*/

package com.java.string;

public class StingClassConstructor_6 {

	public static void main(String[] args) {
		
		//String no-args cons
		String s = new String();
		System.out.println(s.length());
		
		//String parameterized cons
		String s1 ="Sonu";
		String s2 = new String("Sonu");
		System.out.println(s1+" "+s2);
		
		//Convert mutable object to immutable object
		StringBuffer sb = new StringBuffer("deepak"); // mutable object creation
		StringBuilder sb1 = new StringBuilder("deepak");
		String s3 = new String(sb);	//Immutable object creation.
		String s4 = new String(sb1);
		System.out.println(s3+" "+s4);
		
		//Use of Sting byte[] cons
		byte[] b = {65,66,67};
		System.out.println(b);
		String s5 = new String(b);	// byte value will convert into String
		System.out.println(s5);
		
		//Use of Sting char[] cons
		char[] c = {'a', 'b', 'c'};
		System.out.println(c);
		String s6 = new String(c);
		System.out.println(s6);
		
		//Why char array is preferred over string for strong passwords?
		char[] pass1 = new char[] {'a','b','c'};
		String pass2 = new String("abc");
		System.out.println("pass1 :- "+pass1);	//char array prints the object not object's inside value
		System.out.println("pass2 :- "+pass2);	// String prints the object's inside value
	}
}
