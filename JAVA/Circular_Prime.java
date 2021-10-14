import java.util.Scanner;
class Circular_Prime
{
    Scanner sc=new Scanner(System.in);
    boolean isPrime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        return true;
        else 
        return false;
    }
    int circulate(int n)
    {
        Scanner sc=new Scanner(System.in);
        String s=Integer.toString(n);
        String p=s.substring(1)+s.charAt(0);
        int a=Integer.parseInt(p);
        return a;
    }
    void isCircularPrime(int n)
    {
        int f=0,a=n;
        do{
            System.out.println(a);
            if(isPrime(a)==false)
            {
                f=1;
                break;
            }
            a=circulate(a);
        }while(a!=n);
        if(f==1)
        System.out.println(n+" is not a Circular Prime");
        else
        System.out.println(n+" is a Circular Prime");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Circular_Prime obj=new Circular_Prime();
        System.out.println("Enter a number");
        int n=sc.nextInt();
        obj.isCircularPrime(n);
    }
}