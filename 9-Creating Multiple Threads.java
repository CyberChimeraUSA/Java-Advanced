package electricalengineering;

class ThreadGenerator implements Runnable{
	
	String threadName;
	Thread x;
	//constructor for ThreadGenerator
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
	System.out.println("Exiting Child Thread");
}
}

//main class code
class ThreadExamples{
	public static void main(String args []){
	//used to construct child thread
	new ThreadGenerator("Thread One");
	new ThreadGenerator("Thread Two");
	new ThreadGenerator("Thread Three");
	new ThreadGenerator("Thread Four");
	//generate a current thread
	Thread y = Thread.currentThread();
	//print current thread
	System.out.println(y);
	try{
		for (int i = 5; i > 0; i--)
		{
			System.out.println("MainThread: " + i);
			//delays for 1 second (1000 ms)
			Thread.sleep(1000);
		}
	}catch(InterruptedException e){
		System.out.println("Main Thread Interrupted");
	}
System.out.println("Main Thread Exiting");
}
}
