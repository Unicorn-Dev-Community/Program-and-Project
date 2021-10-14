import java.io.*;
public class ThrowsEg
{
	static void vote(int age)throws IllegalAccessException
	{
		if(age<18)
			throw new IllegalAccessException("should be atleast 18 years old");
		else
			System.out.println("You can vote");
	}
	public static void main(String[] args)
	{
		try
		{
			vote(15);
		
		}
		catch(IllegalAccessException e)
		{
			System.out.println("Exception caught"+e);
		}
	}
}