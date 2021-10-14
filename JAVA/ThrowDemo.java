class ThrowDemo
{
	static void show()
	{
		try
		{
		   throw new NullPointerException("demoexception");
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught inside show");
			throw e;
		}
	}
	public static void main(String[] args)
	{
		try
		{
			show();
		}
		catch(NullPointerException e)
		{
			System.out.println("Recaught in main"+e);
		}
	}
}
