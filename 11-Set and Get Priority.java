package electricalengineering;

class ThreadGenerator implements Runnable{
	
	Thread x;
	
	ThreadGenerator(){
		x = new Thread(this, "child thread");
		System.out.println("Child Thread: " + x);
		//set priority form 1(lowest) to 10 (highest)
		x.setPriority(1);
		x.start();
	}

public void run(){
	try{
		for (int i = 5; i > 0; i--){
			System.out.println("Child Thread: " + i);
			System.out.println("Child Thread Priority: " + x.getPriority());
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

	new ThreadGenerator();
	Thread y = Thread.currentThread();
	int x = y.getPriority();
	System.out.println(y);
	try{
		for (int i = 5; i > 0; i--)
		{
			System.out.println("MainThread: " + i);
			System.out.println("Main Thread Priority: " + x);
			//delays for 1 second (1000 ms)
			Thread.sleep(1000);
		}
	}catch(InterruptedException e){
		System.out.println("Main Thread Interrupted");
	}
System.out.println("Main Thread Exiting");
}
}