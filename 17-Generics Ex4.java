package electricalengineering;

//Gen<Paramater List>
//Replaced when object of type Gen is created
class Gen<ParamList1 extends Number>{
		
	ParamList1[] nums; //array of numbers
	


	Gen(ParamList1[] ob1){ //Pass constructor a reference to an array
		nums = ob1;
		
	}	
double average(){
	double sum = 0.0;
	
	for(int i =0; i < nums.length;i++)
		sum += nums[i].doubleValue();
	
	return sum / nums.length;
}
	
}

	

//main class code
class GenericExamples{
	public static void main(String args []){
		
	Integer inums[] = {1,2,3,4,5};
	Gen<Integer> iob = new Gen<Integer>(inums);
	double v = iob.average();
	System.out.println("Integer Object is " + v);
	
	Double dnums[] = {1.1,2.2,3.3,4.4,5.5};
	Gen<Double> dob = new Gen<Double>(dnums);
	double z = dob.average();
	System.out.println("Double Object is " + z);

}
}

