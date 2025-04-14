package application;

//Description: A class to test a variety of methods from each class
public class Tester 
{
	public static void main(String[] args)
	{
		/*--A section to test out methods from the Operations class--*/
		
		System.out.println("4 + 2 = " + Operations.add(4, 2));
		
		System.out.println("4 - 2 = " + Operations.subtract(4, 2));
		
		System.out.println("4 * 2 = " + Operations.multiply(4, 2));
		
		System.out.println("4 / 2 = " + Operations.divide(4, 2));
		
		System.out.println("4 % 2 = " + Operations.modulus(4, 2));
		
		
	}
}
