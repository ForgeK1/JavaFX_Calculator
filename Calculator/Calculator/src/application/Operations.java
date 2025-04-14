package application;

//Description: A static class that helps conduct mathematical calculations
final class Operations 
{
	//Methods
	
	//A method to add two numbers
	public static double add(double a, double b)
	{
		return a + b;
	}
	
	//A method to subtract two numbers
	public static double subtract(double a, double b)
	{
		return a - b;
	}
	
	//A method to multiply two numbers
	public static double multiply(double a, double b)
	{
		return a * b;
	}
	
	//A method to divide two numbers
	public static double divide(double a, double b)
	{
		//Throws an exception if the user tries to divide by zero
		if (b == 0) throw new IllegalArgumentException("Cannot divide by zero.");
		
        return a / b;
	}
	
	//A method to return the remainder of two numbers
	public static double modulus(double a, double b)
	{
		//Throws an exception if the user tries to perform modulus with divisor zero
		if (b == 0) throw new IllegalArgumentException("Cannot perform modulus with divisor 0.");
		
        return a % b;
	}
}
