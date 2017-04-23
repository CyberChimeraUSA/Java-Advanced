package electricalengineering;


//main class code
class ExceptionExamples{
	//create our method
	static void testMethod() throws IllegalAccessException{
		System.out.println("Inside testMethod ");
		throw new IllegalAccessException("demo code for IllegalAccessException");
		
	}
	static void testMethod2() throws NullPointerException{
		System.out.println("Inside testMethod2 ");
		throw new NullPointerException("demo code for NullPointerException ");
		
	}

	public static void main(String args []){
		
		try{
			testMethod();
		}catch (IllegalAccessException e){
			System.out.println("Caught in Main: " + e);
		}
		try{
			testMethod2();
		}catch(NullPointerException e){
			System.out.println("Caught in Main: " + e);
		}
		
	
	}

}


		
