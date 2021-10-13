import java.util.Scanner;
class Prime
{
	public static void main(String arg[])	
	{
        System.out.println("Enter a number ");

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        primeCal(n);
	}
    static void primeCal(int num)
    {
        int count = 0;
        for(int i=2; i*i<=num; i++)
        {
            if(num%i==0)
            {
                count++;
                break;
            }
        }
        if(count==1)
            System.out.println("prime number ");
        else
            System.out.println("Not a prime number ");        
    }    
}