package electricalengineering;

/*
 Class NullPointerException

java.lang.Object
	java.lang.Throwable
		java.lang.Exception
			java.lang.RuntimeException
				java.lang.NullPointerException
				
All Implemented Interfaces:
Serializable

public class NullPointerException
extends RuntimeException

Thrown when an application attempts to use null in a case where an object is required. These include:
	-Calling the instance method of a null object.
	-Accessing or modifying the field of a null object.
	-Taking the length of null as if it were an array.
	-Accessing or modifying the slots of null as if it were an array.
	-Throwing null as if it were a Throwable value.

Applications should throw instances of this class to indicate other illegal uses of the null object. 
NullPointerException objects may be constructed by the virtual machine as if suppression were disabled 
and/or the stack trace was not writable.
 
  source: https://docs.oracle.com/javase/7/docs/api/java/lang/NullPointerException.html
 */


//main class code
class ExceptionExamples{
	
	 static void testMethod(){
		try{
			throw new NullPointerException("demo text");
		}catch (NullPointerException e){
			System.out.println("Caught:  inside testMethod");
			throw e;
		}
		
	}
	public static void main(String args []){
		
		try{
			testMethod();
		}catch (NullPointerException e){
			System.out.println("Caught in Main: " + e);
		}
	}


}

		
