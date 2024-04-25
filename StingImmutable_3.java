/*What is String Immutable:- Immutability concept is used for "String Objects" i.e. String
 *objects are immutable. It means once String Object is created; it's data or state can't
 *be changed but a new String object is created.
 *
 *When to try to modify the original value of String with concat() method: concat() method
 *just create a new object of original value of String and in that it concate the literal
 *value which does not effect to original object or value. And then it will also check
 *in SCP that current given literal value is available in SCP if not present the it will
 *create one object in SCP with concat literal eg:-
 *String s = new String("Rahul");
 *s.concat(" Sharma"); // It will create one more object in heap with Rahul and conate
 *						  the Sharma with will and after that it will check in SCP that
 *						  Sharma is present there in our case not present then it will
 *						  create one object in SCP with Sharma only not Rahul Sharma.
 *
 *Why Sting objects are immutable:-
 *Strings are immutable in java because String objects are cached in String pool. Since
 *cached String literals are shared between multiple persons there is always a risk,
 *where one person's action would affect all another persons For example, if one person
 *changes its city from "Mohali" to "Delhi" all other persons will also get affected.*/
package com.java.string;

// String Immutable
public class StingImmutable_3 {
	public static void main(String[] args) {
		//We cannot modify or change the String object in Heap and SCP area.
		String s = new String("Rahul");	// It creates 2 objects
		System.out.println(s);	
		s.concat(" Sharma");	// concat() method is predefined method in String class it creates an object in Heap with "Rahul Sharma" and second object in SCP with " Sharma", it will not effect the original value of the String.
		System.out.println(s);	// When you try to print s reference value it prints only "Rahul".
		s=s.concat(" Sharma");	// When you assign s.concate() into s reference now you can print "Rahul Sharma" on console because now s will point to the new object which is "Rahul Sharma".
		System.out.println(s); 	// Printing s reference value ("Rahul Sharma")
		String s1=s.concat(" Verma");	// In this you are creating different name new object, one object will be created in SCP with " Verma"  and in heap area with "Rahul Sharma Verma" because previous s pointing to object "Rahul Sharma" and now s1 will point to "Rahul Sharma Verma" object.
		System.out.println(s1);	// Printing s1 value ("Rahul Sharma Verma")
		
		String s2 = "Darshan";	// S2 is pointing object "Darshan" in SCP Area.
		System.out.println(s2);	
		s2=s2.concat(" Singh");	// Now s2 will point to new object "Darshan Singh";
		System.out.println(s2);
		s2=s2 + " Bisht";	// Now s2 will point to new object "Darshan Singh Bisht".
		System.out.println(s2);
		
		//Why String is immutable
		String city1 = "Mohli";	// 1 object created	note if one changes it's value so it'll not affect to others it will create other object that's why Sting objects are immutable
		String city2 = "Mohli";	// 0 object created this city2 is referring to one object in SCP.
		String city3 = "Mohli";	// 0 object created this city3 is referring to one object in SCP.
		System.out.println(city1+ " "+city2+" "+city3);	// they three city1,2,3 is using same object
		String city4 = "Dehli";	// 1 object is created
		String city5 = "Dehli";	// 0 object is created
		System.out.println(city4+" "+city5);
	}
};
