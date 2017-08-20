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
	
	for (int i = 0; i < nums.length;i++)
		sum += nums[i].doubleValue();
	return sum/nums.length;
}
	
	
boolean isAverageSame(Gen<?> ob){
	if (average() == ob.average())
		return true;
	return false;
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
		
		Float fnums[] = {1.0F,2.0F,3.0F,4.0F,5.0F};
		Gen<Float> fob = new Gen<Float>(fnums);
		double x = fob.average();
		System.out.println("Float Object is " + x);
		
		System.out.println("Averages of iob and dob are:  ");
		if(iob.isAverageSame(dob))
			System.out.println("Same");
		else
			System.out.println("Different");
		
		System.out.println("Averages of iob and fob are:  ");
		if(iob.isAverageSame(fob))
			System.out.println("Same");
		else
			System.out.println("Different");

		System.out.println("Averages of dob and fob are:  ");
		if(dob.isAverageSame(fob))
			System.out.println("Same");
		else
			System.out.println("Different");
}
}

