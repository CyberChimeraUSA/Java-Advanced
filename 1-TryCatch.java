package electricalengineering;

import java.util.Scanner;

//main class code
class ExceptionExamples{
	public static void main(String args []){
		int x = 50, y;
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number to be divided by 50 : ");
		y = reader.nextInt();
		
		try{
		double result = x/y;
		System.out.println(result);
		}
		catch(ArithmeticException e){
			System.out.println("Division by Zero");
		}
		
	}
}

		
