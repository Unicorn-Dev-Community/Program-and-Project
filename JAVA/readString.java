import java.io.*;
class readString
{
    public static void main(String a[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a line of text");
        String s=(String)br.readLine();
        System.out.println("Line is "+s); 
    }
}