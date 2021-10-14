import java.util.Scanner;
public class LargeSmallNum{

	public static void numcheck(int a,int b){
		int largest=(a>b)?a:b;
		System.out.println("largest number is:"+largest);
		int smallest=(a<b)?a:b;
		System.out.println("Smallest number is:"+smallest);
	}

	public static void main(String[]args){
		int x,y;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number:");
		x = s.nextInt();
		System.out.print("Enter a number:");
		y = s.nextInt();

		numcheck(x,y);
	}
}
		

	
		
