/*Difference between == and .equal() method:-
 *-> == operator is used for reference comparison (address comparison). It means == operator
 *	 checks if both objects point to the same memory location or not
 *-> .equals() method is used for content comparison (in String class). It means .equal()
 *	 method is used to check object value.
 *
 *How many predefined methods in Object class:-
 *There are total 11 methods of Object class
 *1. clone();
 *2. equals(Object obj);
 *3. finalize();
 *4. getClass();
 *5. hashCode();
 *6. notify();
 *7. notifyAll();
 *8. toString();
 *9. wait();
 *10. wait(long  timeout)
 *11. wait (long timeout int namos)
 *
 *How .equals() works in Object class:-
 *class Object
 *{
 *	public boolean equals(Object obj)
 *	{
 *		return (this==obj);	//.equals method of Object class is used to compare the reference or address of two objects i.e. if two objects points to the same memory location or not. 
 *	}
 *};
 *How .equals() works in Sting class:-
 *class Sting extends Object
 *{
 *	@Overriding
 *	public boolean equals(Object anObject)
 *	{
 *		if(this==anObject)
 *		return true;	//.equal() method of String class is used for content comparison i.e. it is used to check object value.
 *	}
 *		//other statements
 *};*/

package com.java.string;

public class DiffBetweenEqualToOperatorAnsEquralsMethod_5 {
	public static void main(String[] args) {
		String s1 = new String("deepak");	// 2 objects created one in Heap area where reference s1 is pointing and second in SCP where JVM creates the reference internally. 
		String s2 = new String("deepak");	// 1 object created in Heap area where reference s2 is pointing. 
		System.out.println("s1==s2 is: "+(s1==s2));	//== operator is comparing references or object address which is different.
		System.out.println("s1.equals(s2) is: "+s1.equals(s2));	//.equal() method is comparing the object values or literals.
		
		//When reference point to the same object.
		String s3 ="Amit";
		String s4 ="Amit";
		System.out.println("\ns3==s4 is: "+(s3==s4));	// In this reference s3 and s4 is pointing the same object in SCP area.
		System.out.println("s3.equals(s4) is: "+s3.equals(s4));	// Content or object value comparison.
	}
}
