import java.util.Scanner;
class MatMul
{
	public static void main(String[] args)throws ArrayIndexOutOfBoundsException
	{	
		int a1[][]={{1,4,5},{2,6,8}};
		int a2[][]={{1,6,1},{9,44,1},{4,8,1}};
		int product[][]=new int[100][100];
		int r1=a1.length;
		int c1=a1[1].length;
		int c2=a2[0].length;
		for(int i=0;i<r1;i++)
			for(int j=0;j<c2;j++)
			{
				product[i][j]=0;
			}
		for(int i=0;i<r1;i++)
			for(int j=0;j<c2;j++)
				for(int k=0;k<c1;k++)
				{
					product[i][j]+=a1[i][k]*a2[k][j];	
				}
		System.out.println("Product of two matrices is :");
		for(int i=0;i<r1;i++)
		{
			System.out.print("[");
			for(int j=0;j<c2;j++)
			{
				System.out.print(product[i][j]+" ");	
			}
			System.out.println("]");
		}
	}
}
