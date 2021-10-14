import java.util.*;  
class ArrayList2
{  
	public static void main(String args[])
	{  
	ArrayList<Integer> list1=new ArrayList<Integer>();   //Creating arraylist  

	System.out.println("Size="+list1.size());
	list1.add(10);  
	list1.add(20);  
	list1.add(30);  

	System.out.println("Size="+list1.size());					
	System.out.println(list1);  		
	}  
}