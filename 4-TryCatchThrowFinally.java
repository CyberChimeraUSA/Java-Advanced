package electricalengineering;


//main class code
class ExceptionExamples{
	//create our method
	static void method1(){
		try{
			System.out.println("Inside method1");
			int i = 1 + 2;
			System.out.println("1 + 2 = " + i);
			throw new RuntimeException("Demo Code");
		}finally{
			System.out.println("method1 Finally called after try");
		}
	}
	static void method2(){
		try{
			System.out.println("Inside method2");
			int j = 3 + 4;
			System.out.println(" 3 + 4 = " + j);
			return;
			//throw new RuntimeException("Demo Code");
		}finally{
			System.out.println("method2 Finally called after try");
		}
	}

	

	public static void main(String args []){
		try{
			method1();
		}catch (RuntimeException e){
			System.out.println("Exception " + e);
		}
		System.out.println();
		try{
		method2();
		}catch (RuntimeException e){
			System.out.println("Caught second exception");
		}
	
	
	}

}


		
