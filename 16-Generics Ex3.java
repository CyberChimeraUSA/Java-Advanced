package electricalengineering;

//Gen<Paramater List>
//Replaced when object of type Gen is created
class Gen<ParamList1, ParamList2>{
	
	ParamList1 obj1; //declare object of type T
	ParamList2 obj2;
	//Constructor
	Gen(ParamList1 ob1, ParamList2 ob2){ //Pass constructor a reference to object of type ParamList
		//Passed intOb from main
		obj1 = ob1;
		obj2 = ob2;
	}	
	
	ParamList1 getob1(){
		return obj1;
	}
	
	ParamList2 getob2(){
		return obj2;
	}
	
	void showType(){
		System.out.println("Type from ParamList1 is " + obj1.getClass().getName());
		System.out.println("Type from ParamList2 is " + obj2.getClass().getName());
	}
	
}

	

//main class code
class GenericExamples{
	public static void main(String args []){
		
		//Gen reference for Integers
		Gen<Integer, Integer> intOb;
		//create object and assign reference
		//uses autoboxing of Integer object
		intOb = new Gen<Integer, Integer>(100, 500);
		
		//shows type of data
		intOb.showType();
		
		//get value in iOb
		//unbox, get value of 100
		int v = intOb.getob1();
		System.out.println("Value: " + v);
		
		int t = intOb.getob2();
		System.out.println("Value: " + t);
//*******************************************************
		
		//Gen reference for Integers
		Gen<Integer, String> intOb2;
		//create object and assign reference
		//uses autoboxing of Integer object
		intOb2 = new Gen<Integer, String>(100, "Hello World");
		
		//shows type of data
		intOb2.showType();
		
		//get value in iOb
		//unbox, get value of 100
		int x = intOb2.getob1();
		System.out.println("Value: " + x);
		
		String z = intOb2.getob2();
		System.out.println("Value: " + z);
		
				
}
}

