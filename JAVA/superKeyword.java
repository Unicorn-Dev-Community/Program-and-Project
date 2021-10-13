class superKeyword
{
    public static void main(String[] args) 
    {
        childclass c1=new childclass();
    }
}

class parentclass
{
    parentclass()
    {
        System.out.println("Message form parent class");
    }
    parentclass(int a, int b)
    {
        System.out.println("sum form parent class"+(a+b));
    }
}

class childclass extends parentclass
{
    childclass()
    {
        System.out.println("Message form Child class");
    }
}
