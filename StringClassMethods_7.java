/*In String class there many predefined method below are few methods of String class:-
 *
 *1) .length() :- the Sting length() method counts the numbers of characters in the String
 *	 and returns it in integer. This method returns the length of any string which is
 *	 equal to the number of 16-bit Unicode characters in the string.
 *
 *2) .isEmpty() :- The isEmpty() method of String class is included in java string since
 *	 JDK 1.6. This method returns true if given string is empty, else it returns false,
 *	 or can say that this method returns true if the length of the string is 0.
 *
 *3) .trim() :- trim() method of string class eliminates only leading and trailing spaces.
 *	 The Unicode value of space character is '\u0020'. The trim() method in java checks
 *	 this Unicode value before and after the string, if it exists then removes the spaces
 *	 and return the omitted String.
 *
 *Some comparison methods:-
 *4) equals() :- The equals() method compares the content of given two strings. If any
 *	 character is not matched, it returns false. If all characters are matched, it
 *	 returns true. (equals() and == is different) It returns boolean value.
 *5) equalsIgnoreCase() :- The equalsIgnoreCase() method is used to compare a specified
 *	 String to another String, ignoring case considerations i.e. lower case to upper case.
 *	 Two String are considered equal ignoring case if they are of the same length and
 * 	 corresponding characters in the two Strings are equal ignoring case.(It returns boolean value)
 *6) compareTo() :- compareTo () and compareToIgnoreCase() method is used for comparing
 *	 two Strings lexicographically. Each character of both the strings is converted into
 *	 a Unicode value for comparison. If both the strings are equal then this method return
 *	 0 else it returns positive or negative value. (It returns int value)
 *7) CompareToIgonewCase();
 *
 *String addition & Get substring from String methods:-
 *8) concat() :- concat(String str) method concatenates on string to the end of another
 *	 string. This method returns a string with the value of the string passed into the
 *	 method, appended to the end of the string.
 *9) join() :- join(CharSequence delimiter, CharSequence... elements) is the static method
 *	 which concatenates the given elements with the delimiter and returns the concatenated
 *	 string. It was included in JDK 1.8 version.
 *	 Note:- If an element is null, then null is added and if delimiter is null then it will
 *	 throw "java.langNullPointerException"
 *10) subSequence() :- The subSequence(int beginIndex, int endIndex) method returns a
 *	  CharSequence. The subsequence starts with the char value at the specified index
 *	  and ends with the char value at (end-1).
 *	  It throws java.lang.StringOuntOfBoundsException exception if any index position
 *	  value is negative.(It returns char value)
 *11) substring() :- There are two substring methods os String class i.e. substring(int beginIndex)
 *	  and substring(int beginIndex, int endIndex). It returns a new string that is a
 *	  substring of this string. The substring begins at the specified beginIndex and
 *	  extends to the character at index endIndex - 1.(It returns String value)
 *
 *Methods to update Strings:-
 *12) replace() :- replace(char oldChar, char newChar) method returns a string replacing
 *	  all the old characters or CharSequence to new Characters or CharSequence.
 *	  This method was introduced in JDK 1.5 version.
 *13) replaceFirst() :- replaceFirst(String regex(regex means regular expression), String replacement) method replaces
 *	  the first substring that fits the specified regular expression with the replacement
 *	  String. If the specified regular expression(regex) is not valid, then it will provide
 *	  "java.util.regex.PatternSyntaxExcepiton" exception.
 *14) replaceAll() :- replaceAll(String regex, String replacement) method replaces all the
 *	  substrings that fits the specified regular expression with the replacement String
 *	  If the specified regular expression(regex) is not valid, then it will provide
 *	  "java.util.regex.PatternSyntaxException" exception.
 *
 *String searching methods:-
 *15) indexOf() :- The indexOf() method returns the positive of the first occurrence of
 *	  specified character(s) in a string or return -1, if the character does not occur.
 *16) lastIndexOf() :- The lastIndexOf() method returns the positive of the last occurrence
 *	  of the specified character(s) in a string or return -1, if the character does not occur. 
 *17) charAt() :-	The charAt() method returns the character at the specified index.
 *	  The index value should lie between 0 and length()-1.
 *18) contains() :- The contains() method search the sequence of characters in the given
 *	  string. It returns true if sequence of char values are found in this string
 *	  otherwise returns false. 
 *19) startsWith() :- The startsWith() method tests if a string starts with the specified
 *	  prefix beginning from 1st index. if yes then it will return true else it will return false.
 *20) endsWith() :-The endsWith() method checks whether the string ends with a specified
 *	  suffix. If yes then method will return true otherwise it will return false.
 *
 *String conversion:-
 *Case Conversion:
 *21) toLowerCase() :-The toLowerCase() method converts all characters of the string
 *	  into a lowercase letter.
 *22) toUpperCase() :-	The toUpperCase() method converts all characters of the string
 *	  into a uppercase letter.
 *Type Conversion:
 *23) valueOf() :- The valueOf() method converts different types of values into string.
 *	  By the help of String.valueOf() method, we can convert int or long or float or
 *	  double or object or any other type into string.
 *	  NOTE:valueOf() method is static method thats why we can call valueOf() method
 *	  	   directly by string class.
 *24) toCharArray() :- The toCharArray() method converts the given string into a
 *	  sequence of characters. The returned array length is equal to the length of the string.*/

package com.java.string;

public class StringClassMethods_7 {
	
	public static void main(String[] args) {
		String name = "abc";
		String email = "abc@gamil.com";
		String pass = " abc.123  ";
		String a = null;
		System.out.println(name.length());	// It provide the value in the form of integer so .length() method can be sorted in the integer.
//		System.out.println(a.length());	// If String value is null so .length() method will throw the NullPointerException Exception.
		System.out.println(email.isEmpty());	// It provide the boolean value which can be stored in boolean.
//		System.out.println(a.isEmpty());	// If String value is null so .isEmpty() method will throw the NullPointerException Exception.
		System.out.println(pass.trim());	// This .trim() method removes the first and last spaces in the String.
		System.out.println(pass.length());
		System.out.println(pass.trim().length());	// In this it removed the first and last spaces and gave the length of the String.
//		System.out.println(a.trim());	// If String value is null so .trim() method will throw the NullPointerException Exception.
	}
};

//Sting class method programs
class StringMethodProgram {
	public static void main(String[] args) {
	
	String name1 = " Darshan ";
	
	
	// .length() method	(Provide integer form)
//	int i = name1.length();
//	if(i==0)
	if(name1.length()==0)
		System.out.println("Name is empty");
	else
		System.out.println("Name is valid");
	
	
	// .isEmpty() method (Provide boolean form)
//	boolean b = name1.isEmpty();
//	if(b==false)
	if(name1.isEmpty())
		System.out.println("Name is empty");
	else
		System.out.println("Name is valid");
	
	
	// .trim() method (Provide String form )
	String name2 = "Darshan";
	if(name1.trim().equals(name2))
 		System.out.println("Name is valid");
		else
			System.out.println("Name is invalid");
	
	
	// .trim().length() method
	String name3 ="  ";
	if(name3.trim().length()==0)	// In using .trim().length() method it will not count spaces now.
 		System.out.println("Name is empty");
		else
			System.out.println("Name is valid");
	
	
	// .trim().isEmpty() method
	if(name3.trim().isEmpty())
 		System.out.println("Name is empty");
		else
			System.out.println("Name is valid");
	
	
	}
};


//Some comparison methods in String class
class StringClassMethods2 {
	public static void main(String[] args) {
		
		//equals() method
		String name1 = "deepak";
		String name2 = "amit";
		System.out.println(name1.equals(name2));
		
		// Through equals method you can check String is empty or not.
		if(name1.equals(""))
			System.out.println("Name is empty");
		else
			System.out.println("Name is not empty");
		
		//equalsIgnoreCase() method
		String name3 = "deepak";
		String name4 = "Deepak";
		System.out.println(name3.equalsIgnoreCase(name4));
		
		//compareTo() method
		String s1 = "a";	//97	// if there is a word like apple so it will only compare the first character of the word eg:- s1 = "appler"; s2 = "A" : s1.compareTo(s2) = 32 and if first character is matched with the second character then it compares the send character of the word for eg:- s1 = "aB"; and s2 = "aC"; : s1.compareTo(s2) = -1 
		String s2 = "a";	//65
		System.out.println(s1.compareTo(s2));	// s1>s2 (giving positive value) 
		System.out.println(s2.compareTo(s1));	// s2<s1 (giving negative value)
		System.out.println(s1.compareTo(s1));	// s1==s1 (giving 0 value because it is equal)
		
		//You can find the length using compare to method
		String name5 = "Darshan";
		String name6 = "";
		System.out.println("Length of the String name5: "+name5.compareTo(name6));
		
		//compareToIgnoreCase() method
		System.out.println(s1.compareToIgnoreCase(s2));
		String s3 = "aBC";	// In this it compares the whole word but ignoring the upper and lower case.
		String s4 = "Abc";
		System.out.println(s3.compareToIgnoreCase(s4));
	}
};


//String addition & Get substring from String methods:-
/*BODMAS: It stands for Bracket, of, Division, Multiplication, Addition and Subtraction.
 * 		  It refers to the order of operations to solve an expression. It tells which
 * 		  process to perform first to evaluate a given numerical expression.*/
class StringClassMethods3 {
	public static void main(String[] args) {
	
		//Using + operator
		System.out.println((10-5+5)+2*2+10/2);
		String s1 = "deepak";
		String s2 = " java";
		System.out.println(s1+s2);
		System.out.println(s1+10);
		System.out.println(s1+10+20);
		System.out.println(10+20+s1);
		System.out.println(10+s1+20);
		System.out.println(s1+20/10);
//		System.out.println(s1+10-5);	// throw error
		
		//Using concat() method
		System.out.println(s1.concat(s2));
		
		//Using join() method
		System.out.println(String.join(",",s1,s2,s1,s2));
//		System.out.println(String.join(null,s1,s2));	//It will throw NullPointerException.
		System.out.println(String.join("/", s1, null));
		
		//Using subSequence() method
		String s3 = "This is a Demo";
		System.out.println(s3.subSequence(0, 8));
		System.out.println(s3.subSequence(3, 9));
		System.out.println(s3.substring(5));	// In this it will print start index no. 5 to the end index (just give the stating index no.)
		System.out.println(s3.substring(0, 4));	// In this it will print given start index no. to last given index no with minus 1 value i.e. 4-1 =3.
	}
};


//Methods to update Strings
class StringClassMethods4 {
	public static void main(String[] args) {
		
		//replace() method
		String s1 = "This is a Demo";
		System.out.println(s1.replace("is", "was"));	//This is a Demo
		
		//replaceFirst() method
		System.out.println(s1.replaceFirst("is", "was"));	//Thwas is a Demo (in this we can use regex)
		
		//replaceAll() method
		System.out.println(s1.replaceAll("is", "was"));	//Thwas was a Demo
		System.out.println(s1.replaceAll("is(.)", "was"));	//Thwaswasa Demo (In replaceAll method we can use regex- regular expression- in this it is removing the spaces where it finds "is".) 
		System.out.println(s1.replaceAll("is(.*)", "was"));	//Thwas (In this regex when it will find first "is" in the String it will place with all the sting with was which present after the is)
	}
};


//String searching methods
class StringClassMethods5 {
	public static void main(String[] args) {
		
		String s1 = "deepak";

		//indexOf() method
		System.out.println(s1.indexOf("amit"));	// If string not match or char not found it returns -1.
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.indexOf("ep"));
		
		//lastIndexOf() method
		System.out.println(s1.lastIndexOf('e'));
		
		//charAt() method
		System.out.println(s1.charAt(5));
		
		//contains() method
		System.out.println(s1.contains("ep"));
		
		//statsWtih() method
		System.out.println(s1.startsWith("d"));
		
		//endsWith() method
		System.out.println(s1.endsWith("ak"));
	}
};


//String conversion
class StringClassmethods6{
	public static void main(String[] args) {
		
		String s1 = "DARshan";
		
		//Case Conversion:-
		//toLowerCase() method
		System.out.println(s1.toLowerCase());
		
		//toUpperCase() method
		System.out.println(s1.toUpperCase());
		
		//Type Conversion:-
		//valueOf() method
		int a = 10, b = 20;
		System.out.println(a+b);	// addition performed
		String s2 = String.valueOf(a);
		String s3 = String.valueOf(b);
		System.out.println(s2+s3);	// concatenation performed
		
		//toCharArray() method
		char[] c = s1.toCharArray();
		System.out.println(c);
	}
};