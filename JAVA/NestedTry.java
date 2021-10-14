class NestedTry
{
	public static void main(String[] args)
	{
	   try
	   {
		try
		{
		   System.out.println("Going to divide");
		   int b=32/0;
		}
		catch(ArithmeticException e)
		{
		   System.out.println("Divide by Zero Error");
		}
		try
		{
		  int a[]=new int[5];
		  a[0]=5;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		   System.out.println("Array out of bound error");
		}
		System.out.println("other statement");
	   }
	   catch(Throwable e)
	   {
		System.out.println("handled");
	   }
	   System.out.println("normal flow");
	}
}
		   