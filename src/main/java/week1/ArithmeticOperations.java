package week1;

public class ArithmeticOperations 
{

	int number1=5;
	int number2=2;
    
    
	public void Addition()
	{
		int add = number1+number2;
		System.out.println(add);

	}
	public int Substract()
	{
		int sub=number1-number2;
		System.out.println(sub);
		return sub;

	}
	public int Multiply()
	{
		int multiply=number1*number2;
		
		System.out.println(multiply);
		return multiply;
	}
	public void MultiplyNumber1ByNumber2()
	{
		int multi = number1*number2;
		System.out.println(multi);

	}
	public int DivideNumberTwoBy(int divident)
	{
		int divident1 = divident/2;
		System.out.println(divident1);
		return divident1;
	}
}
