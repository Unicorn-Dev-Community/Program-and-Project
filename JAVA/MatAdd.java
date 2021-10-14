import java.util.Scanner;
class MatAdd
{
	public static void main(String[] args)
	{	
		int a1[][]={{7,8,9},{5,6,4}};
		int a2[][]={{1,2,3},{5,6,8}};
		int sum[][]=new int[100][100];
		int r1=a1.length;
		int c1=a1[0].length;
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				sum[i][j]=a1[i][j]+a2[i][j];	
			}
		}
		System.out.println("Sum of two matrices is :");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(sum[i][j]+" ");	
			}
		}
	}
}
