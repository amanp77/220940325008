class ExceptionDemo4
{
public static void show() throws ArithmeticException, NullPointerException
{
	System.out.println("Am Show");
	throw new ArithmeticException("Arithmetic Exception thrown from show");
}
public static void main(String args[])
{
	try
	{
	show();
	}
	catch(ArrayIndexOutOfBoundsException exyz)
	{
	System.out.println(exyz);
	System.out.println("Arithmetic Exception thrown from show cathced in main and handled");
	}
	
	System.out.println("Program Ended Successfully");
}
}