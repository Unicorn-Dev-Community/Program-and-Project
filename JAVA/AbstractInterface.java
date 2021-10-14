interface Math
{
	void add(int a,int b);
}
abstract class A implements Math
{
	abstract void subtract(int a,int b);
}
class B extends A
{
	public void add(int a,int b)//if we declare it as void print we get error 
				    //since all method in interface is public it should be
				    //declared public in class B
	{
		System.out.println("Sum= "+(a+b));
	}
	void subtract(int a,int b)
	{
		System.out.println("Difference= "+(a-b));
	}
}
class AbstractInterface
{
	public static void main(String[] args)
	{
		B ob=new B();
		ob.add(10,20);
		ob.subtract(40,6);
	}
}