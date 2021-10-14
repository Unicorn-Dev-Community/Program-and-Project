class CmdRead
{
	public static void main(String[] args)
	{
		String s1=args[0];
		String s2=args[1];
		String s3=null;
		s3=s1.concat(s2);
		System.out.println("The concatenated string is : "+s3);
	}
}