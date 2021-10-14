class MyClass4
{
	int x;
	public MyClass4()
	{
		x=5;
	}
}
class ConstructClass
{
	public static void main(String[] args)
	{
		MyClass4 obj1=new MyClass4();
		MyClass4 obj2=new MyClass4();
		System.out.println(obj1.x);
		System.out.println(obj2.x);
	}
}