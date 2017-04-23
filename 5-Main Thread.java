package electricalengineering;


//main class code
class ThreadExamples{
	public static void main(String args []){
		//code will display current thread and changed thread name
		Thread x = Thread.currentThread();
		System.out.println("Default thread name : " + x);
		x.setName("My adjusted Thread");
		System.out.println("Changed thread name : " + x);
		}

}

//changed current thread name from main to My adjusted thread
//priority of 5
//this thread belongs to group "main"
		
