/*String Constant pool(SCP) or String Literal Pool:- It is an area in heap memory where
 *java stores String literal values.
 *
 *Memory storage in java:-
 *class Test
 *{
 *	int a=10;
 *	static b=20;
 *
 *	void show()
 *	{
 *		int c=30;
 *		//other statements
 *	}
 *	
 *	public static void main(String[] args);
 *	{
 *		Test t =  new Test();
 *		t.show();
 *	}
 *};
 *int a=10; (instance variable):- It will store in Heap Area
 *static int b=20; (static variable):- It will store in Method Area
 *int c=30; (local variable):-	It will store in Stack Area
 *main():-	It will store in Stack Area
 *Test t = new Test(); (object):- It will store in Heap Area
 *t.show(); (current running method):- It will store in Stack Area
 *
 *String Constant Poll memory management:-
 *->In java 1.6 version SCP was present in Method Area(PERMGEN-Permanent generation) and
 *	it's store was constant, after that in java 1.7 version SCP was shifted into Heap Area
 *	in this SCP can increase or decrease it's size accordingly.
 *->Now at this current time String Constant Pool (SCP) is presented in Heap Area.
 *->SCP is an special area in the Heap Area memory which is used to store the Sting objects.
 *
 *How object creation work in the background in Heap and SCP Area and some important points:-
 *1. String s = new String("darshan"); :- While creating the object in this way by using
 *	 new keyword  2 objects will be created first in Heap area and second in SCP pool
 *	 because we are passing the literal  inside String("darshan") so that will goto
 *	 inside the SCP and reference s will point to the heap area object as s->darshan 
 *	 and in SCP area JVM will create a reference internally and point that object darshan.
 *2. String s2 = "rahul"; :- In this we are creating literal object that will go directly
 *	 inside the SCP Area so this will create only one object now s2 will directly point
 *	 to the rahul in SCP area not JVM (This object creation is being used mostly because
 *	 it creates only one object which saves the memory (memory management)).
 *3. The Sting objects present in the SCP are not applicable for Garbage Collection
 *	 because a reference variable internally is maintained by JVM  (And in SCP object can
 *	 come in use in the future that is why object get saved inside SCP permanently).
 *4. String s3 = new String("Mohit"); :- By this object creation 2 object will be created
 *	 same as String s = new String("darshan"); as explained above.
 *5. String s4 = new String("Mohit"); :-  While this object creation only one object will
 *	 be created in Heap area and reference s4 will point to object Mohit. But note this 
 *	 object creation will not create object in SCP because already same literal or Mohit
 *	 object is presented in the SCP area so there is one more point to note that SCP only
 *	 takes unique objects only that can be used by multiple references for eg:- person 1 
 *	 and person 2 that both live in same place - Delhi so p1 and p2 reference will point
 *	 to Delhi object (Object immutable concept is there- The data which can not be changed
 *	 or modify).
 *6. Sting s5 = "Mohit"; :- While creating the literal object first it will check or search
 * 	 is inside the SCP that any same literal object is presented if Yes then it will not
 *   create the object (zero object creation) and reference s5 will directly point to 
 *   the Mohit object not JVM.
 *7. Sting s6 = "Mohit"; :- Zero object creation and reference s6 will directly point to
 *	 the Mohit object.
 **/

package com.java.string;

//String object creations
public class StringConstatPool_2 {
	public static void main(String[] args) {
		String s = new String("darshan");	// 2 object creation one in heap and second in SCP
		System.out.println(s);
		String s1 = "rahul";	// 1 object creation in SCP area.
		System.out.println(s1);
		String s2 = new String("Mohit");	// 2 object created.
		System.out.println(s2);
		String s3 = new String("Mohit");	// 1 Object created in heap area only.
		System.out.println(s3);
		String s4 = "Mohit";	// 0 object created Mohit already exists in SCP.
		System.out.println(s4);
		String s5 = "Mohit";	// 0 object created Mohit already exists in SCP.
		System.out.println(s5);
		
	}
};
