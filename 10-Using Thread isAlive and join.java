package electricalengineering;

class ThreadGenerator implements Runnable{
	String threadName;
	Thread x;
	
	ThreadGenerator(String threadInput){
		threadName = threadInput;
		//constructs a child thread
		x = new Thread(this, threadName);
		//prints the child thread
		System.out.println("Child Threads: " + x);
		//calls the run method
		x.start();
	}
	
	public void run(){
		try{
			for (int i = 5; i > 0; i--){
				System.out.println(threadName + ": " + i);
				//delays 0.1 seconds (100 ms)
				Thread.sleep(100);
			}
		}catch(InterruptedException e){
			System.out.println("Child Interrupted");
		}
		System.out.println("Exiting Child Thread" + threadName);
	}
}

//main class code
class ThreadExamples{
	public static void main(String args []){

		ThreadGenerator Threadob1 = new ThreadGenerator("Thread One");
		ThreadGenerator Threadob2 =new ThreadGenerator("Thread Two");
		ThreadGenerator Threadob3 =new ThreadGenerator("Thread Three");
		
		
		System.out.println("Thread one isAlive(): " + Threadob1.x.isAlive());
		System.out.println("Thread two isAlive(): " + Threadob2.x.isAlive());
		System.out.println("Thread three isAlive(): " + Threadob3.x.isAlive());
		
		

		try{
			for (int i = 5; i > 0; i--)
			{
				Threadob1.x.join();
				Threadob2.x.join();
				Threadob3.x.join();
			}
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupted");
		}
		
		System.out.println("Thread one isAlive(): " + Threadob1.x.isAlive());
		System.out.println("Thread two isAlive(): " + Threadob2.x.isAlive());
		System.out.println("Thread three isAlive(): " + Threadob3.x.isAlive());
		System.out.println("Main Thread Exiting");
}
}

