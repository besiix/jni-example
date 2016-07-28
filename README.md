-----
Into:
-----
The following code and instructions are an example of calling c++ functions in a Java program using JNI.  

-------------
Instructions:
-------------
1) Create Java file which defines the native functions to be used.  
2) Add System.loadLibrary call to load the library.  
	- This will look in your defined java.library.path location.  
	- loadLibrary adds prefix 'lib', and extension '.so' to passed string.  
3) Compile java code.  
4) Create the header file by running javah.  
5) Create the C++ file with functionality for the header file.  
	- Remember to include the created header file.  
	- Functions need to be defined as a JNI export function.  
	- The return variable is formated for Java (e.g. jstring, jint, jboolean).  
	- Must pass in a jni environment pointer and a jobject.  
6) Create a shared library (.so) of the c++ code.  
7) Run the java code. Specify the library location, if not done so in your code.  

---------------
Terminal Lines:
---------------
3) javac JniExample.java  
4) javah JniExample  
6) gcc -I/usr/lib/jvm/java-7-openjdk-amd64/include -shared -o libJniExample.so -fPIC JniExample.cpp  
7) java -Djava.library.path=. JniExample  
