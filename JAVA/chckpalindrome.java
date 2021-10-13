import java.util.Scanner;
class chckpalindrome
{ 
  public static void main(String args[])
  {
    String str,rev="";
    Scanner sc=new Scanner(System.in);
    System.out.println(" enter string to check");
    str= sc.nextLine();
    int len=str.length();
    for(int i=len-1;i>=0;i--)
    {
      rev=rev+str.charAt(i);
     }
    if(str.equals(rev))
       System.out.println(" string"+""+str+"is a palindrome");
    else
      System.out.println("string"+" "+str+" is not a palindrome");
   }
}