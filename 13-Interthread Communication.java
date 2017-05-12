package electricalengineering;

//this class defines the get and set methods
class MethodDefiner{

	int n;
	boolean controllerGetSet = false;
	
	//get method
	synchronized int get(){
		//get initially waits when called
		while (!controllerGetSet)
			try{
				wait();
			}catch (InterruptedException e){
				System.out.println("InterruptedException caught");
			}
		//called after set() method
		System.out.println("Got: " + n);
		//toggles controllerGetSet
		controllerGetSet = false;
		//wakes up thread that called wait, goes to set() method
		notify();
		return n;
	}
	
	//set method
	synchronized void set (int n){
		//skips initially
		while (controllerGetSet)
			try{
				wait();
			}catch(InterruptedException e){
				System.out.println("InterruptedException caught");
			}
		this.n = n;
		//toggles controllerGetSet
		controllerGetSet = true;
		//prints values n that is passed from i
		System.out.println("Put: " + n);
		//wakes up thread that called wait, goes to get() method
		notify();
	}

}

class ThreadGeneratorSetter implements Runnable{
	MethodDefiner md;
	//takes object from main
	ThreadGeneratorSetter(MethodDefiner obMain){
		this.md = obMain;
		//start new thread
		new Thread (this,"ThreadGeneratorSetter" ).start();
	}
	//run thread and set i to 0
	public void run(){
		int i = 0;
		//sets values of i until 10
		while(true && i<10){
			md.set(i++);
		}
	}
	
}

class ThreadGeneratorGetter implements Runnable{
	MethodDefiner md;
	//takes object from main
	ThreadGeneratorGetter(MethodDefiner obMain){
	this.md = obMain;
	new Thread(this, "ThreadGeneratorGetter").start();
	}
	public void run(){
		while (true){
			//constantly getting while not in wait()
			md.get();
		}
	}
}

//main class code
class ThreadExamples{
	public static void main(String args []){
	//create object md
	MethodDefiner md = new MethodDefiner();
	//new instances of Getter and Setter classes
	new ThreadGeneratorSetter(md);
	new ThreadGeneratorGetter(md);
	
	}
}



