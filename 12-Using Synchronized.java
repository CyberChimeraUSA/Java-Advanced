package electricalengineering;


class PrintClass{
	 void printMethod(String msg){
		System.out.print("[" + msg);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println(e);
		}
		System.out.println("]");
	}
}
/*
class PrintClass{
	synchronized void printMethod(String msg){
		System.out.print("[" + msg);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println("Error");
		}
		System.out.println("]");
	}
}
*/
class ThreadGenerator implements Runnable{
	String msg;
	Thread x;
	PrintClass target_class_var;
	
ThreadGenerator(PrintClass target, String message){
	target_class_var = target;
	msg = message;
	x = new Thread(this);
	x.start();
	
}

public void run(){
	//synchronized(target_class_var){
target_class_var.printMethod(msg);
	}
}
//}


//main class code
class ThreadExamples{
	public static void main(String args []){
		PrintClass targetClass = new PrintClass();
		ThreadGenerator Threadobject1 = new ThreadGenerator(targetClass, "Value 1");
		ThreadGenerator Threadobject2 = new ThreadGenerator(targetClass, "Value 2");
		ThreadGenerator Threadobject3 = new ThreadGenerator(targetClass, "Value 3");
try{
	Threadobject1.x.join();
	Threadobject2.x.join();
	Threadobject3.x.join();
}catch(InterruptedException e){
	System.out.println(e);
	
}
		
	
	}
}



