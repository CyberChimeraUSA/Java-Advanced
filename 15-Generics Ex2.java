package electricalengineering;

//Gen<Paramater List>
//Replaced when object of type Gen is created
class Gen<ParamList>{
	
	ParamList obj; //declare object of type T
	
	//Constructor
	Gen(ParamList ob1){ //Pass constructor a reference to object of type ParamList
		//Passed intOb from main
		obj = ob1;
	}
	
	ParamList getob(){
		return obj;
	}
	
	void showType(){
		System.out.println("Type from ParamList is " + obj.getClass().getName());
	}
	
}
	
	

//main class code
class GenericExamples{
	public static void main(String args []){
		
				//Gen reference for Integers
				Gen<Integer> intOb;
				//create object and assign reference
				//uses autoboxing of Integer object
				intOb = new Gen<Integer>(100);
				
				//shows type of data
				intOb.showType();
				
				//get value in iOb
				//unbox, get value of 100
				int v = intOb.getob();
				System.out.println("Value: " + v);
				//**********************************************
				Gen<String> stringOb;
				
				stringOb = new Gen<String>("Java Generics Test");
				
				stringOb.showType();
				
				String string1 = stringOb.getob();
				System.out.println("Value: " + string1);
				//**********************************************
				Gen<Double> doubleOb;
				
				doubleOb = new Gen<Double>(99.9);
				
				doubleOb.showType();
				
				Double double1 = doubleOb.getob();
				System.out.println("Value: " + double1);
				
				
}
}

