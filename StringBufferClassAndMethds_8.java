/*Ways to create String in java:-
 *i) String ii) StringBuffer iii)StringBuilder
 *
 *Difference between String & StringBuffer:- Main difference is : String Objects are
 *immutable and StringBuffer Objects are mutable and all the methods are synchronized
 *in StringBuffer class.
 *
 *Synchronized in java guarantees that no two thread can execute a synchronized method
 *which requires the same lock simultaneously or concurrently. And thus, synchronization
 *increases waiting time of thread and effects performance of the system (thread safe).
 *
 *When we should use String and StringBuffer?
 *If the data does not change or change one or two times only, use String.
 *If data is constantly or friquently  changing like in calculator, notepad etc,
 *we should use StringBuffer.
 *
 *There are total 4 main constructor in StringBuffer class:-
 *1)StringBuffer() :- no args cons.
 *2)StringBuffer(CharSequecne seq) :- we can provide CharSequece
 *3)StringBuffer(String str):- we can provide String
 *4)StringBuffer(int capacity) :- we can provide int
 *
 *There are many method in StringBuffer class below are few methods:-
 *NOTE:- In StringBuffer class there many some same methods as in Sting class like length(),
 *indexOf(), charAt() etc. and that method also work same as Sting class so don't get confuse
 *but equals() etc, method it does not work same as in String class.
 *1) append() :- It works same as concat() method  but in StringBuffer we can not use
 *	 concat() method so we use here append() method instead of concat() method and in this
 *	 it does not create another object while modifying the objects.
 *2) capacity() :- It check the StringBuffer storage capacity that how many characters
 *	 can be stored in StringBuffer object. the default capacity of StringBuffer is 16.
 *3) delete() :- The delete(int start, int end) method is used to delete the start to
 *	 end characters of stringBuffer.
 *4) deleteCharAt() :- The deleteCharAt(int index) method used to delete the specified
 *	 character in the stringBuffer.
 *5) insert() :- The insert(int index, char[] seq) method is used to insert the string value
 *	 according to given index number.
 *6) replace() :- The replace(int startindex, int endindex, String str ) method used to replace
 *	 the specified characters in the StringBuffer.
 *7) reverse() :- The reverse() method is used to reverse the StringBuffer. 
 *
 *equals() :- StringBuffer class does not override equals method of Object class but
 *	 String class override the equals method of Object class. Thay's why it works as ==
 *	 comparison operator it compares the reference or address of the object.*/

package com.java.string;

public class StringBufferClassAndMethds_8 {

	public static void main(String[] args) {
		
		//StingBuffer cons
		//No args
		//capacity() method
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());	//It tells how many characters can be stored by default in the sb object which is 16.
		
		//Parameterized CharSequence
		System.out.println("----------------1");
		StringBuffer sb1 = new StringBuffer('a');
		System.out.println(sb1.capacity());	// It's providing the int ASCII value of character 'a' now it's capacity is 97 it can store 97 characters.
		
		//Parameterized String
		System.out.println("----------------2");
		StringBuffer sb2 = new StringBuffer("hello");
		System.out.println(sb2);
		System.out.println(sb2.capacity());	//16+string length=21
		
		//Parameterized integer
		System.out.println("----------------3");
		StringBuffer sb3 = new StringBuffer(1000);	//Provide the size/capacity
		System.out.println(sb3.capacity());		//now it can store 1000 characters
		
		//append() method
		System.out.println("----------------4");
		System.out.println(sb.capacity());
		sb.append("Darshan Singh Bis");	//length is 17 when length was under till 16 the capacity was also 16 when length became 17 it increases it's size with (old capacity*2+2 or old capacity+1*2).
		System.out.println(sb);
		System.out.println(sb.capacity());	//How StringBuffer increase it's capacity by default : (default capacity(16)*2+2 = 34 or default capacity(16)+1*2)
		
		//delete() method
		System.out.println("----------------5");
		System.out.println(sb.delete(13, 17));
		
		//deleteChar() method
		System.out.println("----------------6");
		System.out.println(sb.deleteCharAt(7));
		
		//equals() method
		System.out.println("----------------7");
		StringBuffer sb4 = new StringBuffer("Darshan");
		StringBuffer sb5 = new StringBuffer("Darshan");
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
		StringBuffer sb6 = new StringBuffer();
		sb6.ensureCapacity(100);
		System.out.println(sb6.append("Hello"));
		System.out.println(sb6.capacity());
		sb6.trimToSize();	// It release the unused capacity in the sb5 StringBuffer 
		System.out.println(sb6.capacity());	// After trimToSize() the capacity of sb6 is now 5
	}
};