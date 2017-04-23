package electricalengineering;


//main class code
class ThreadExamples{
	public static void main(String args []){
		Thread x = Thread.currentThread();
		System.out.println("Default thread name : " + x);
		x.setName("My adjusted Thread");
		System.out.println("Changed thread name : " + x);

		//changed current thread name from main to My adjusted thread
		//priority of 5
		//this thread belongs to group "main"
		try{
		for(int n = 10; n > 0; n--){
			System.out.println("N is " + n);
			System.out.println(x);
			Thread.sleep(1000);
			
		}
		}catch (InterruptedException e){
			System.out.println("Main thread interruption exception");
		}
	
	}

}


		
