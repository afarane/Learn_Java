variables: local, static. Instance
local : Specific to method
Global variable:

String / StringBuilder / StringBuffer :

	String str = new String("Hello"); // immutable
	StringBuilder builder = new StringBuilder("Hello");	
	StringBuffer buffer = new StringBuffer("Hello");
	
	str.concat("Hi...");
	builder.append("Hi..."); // In Single Threaded env . Better in performance compared to buffer
	buffer.append("Hi..."); // Multiple threading Thread safe 
	
	System.out.println(newStr);
	System.out.println(builder);
	System.out.println(buffer);

Result --> 

	Hello
	HelloHi...
	HelloHi...	

change :

	String newStr = str.concat("Hi...");

Comparing References :

	String str1 = new String ("Hello"); // it is ref variable having address of object
	String str2 = new String ("Hello");
	
	if (str1 == str2) { // comparing references
		System.out.println(true);
	}else {
		System.out.println(false);
	}
	
  
Result --> false

	String str1 = new String ("Hello"); // it is ref variable having address of object
	String str2 = new String ("Hello"); // it is another ref variable having address of object
	
	if (str1.equals(str2)) { // comparing values
		System.out.println(true);
	}else {
		System.out.println(false);
	}
  
Result --> true
  
--------------
DataTypes

--------------
Conditions:
If-Else & Switch

Loops : 
For,while, do-while,

--------------
Class :
- Class should start with Uppercase

--------------
Methods :
Method overriding : create more than one method with same name by changinging method arguments.

--------------
Constructor:
- Constructor does not have return type.
- Name should be same as class.
- Constructor is not member of class.
- Constructor is called automatically when a new instance of an object is created.

Type of Constructors :
1. Default Constructor : No arguments 
2. Parameterized Constructors. 
--------------
this is class variable 

--------------
Static & Non Static Methods :

--------------
Access Modifier 
1. Private : Within class only
2. Public : Can be accessed everywhere even outside Package with inheritance
3. Protected : Can use outside Package with inheritance
4. Default : Can't use outside Package with inheritance also.

--------------
Inheritance :
Note: 
- Cannot inherit private / static/ Final member of class.
--------------
Interface :
Abstract Class:

--------------
Exceptions:
- Run Time Exception :
airthmeticException,
NullPointerException,

- Checked Exceptions :
FileNotFoundException,
ArrayIndexOutOfBoundsException
ClassNotFoundException
OutOfMemoryError
InterruptedException

How to Handle Exception? :
- try catch block

