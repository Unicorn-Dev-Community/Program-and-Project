					/*	CONCEPT OF ITERATOR.	*/

import java.util.*;
class ArrayList1
{
	public static void main(String aa[])
	{
	ArrayList<String> names = new ArrayList<String>();    //Creating Arraylist

	int n = names.size();
	System.out.println("Initial size ="+n);

//WE CAN ALSO WRITE THE ABOVE 2 STATEMENTS AS COMPRESSED BELOW.

//System.out.println("Initial size = "+names.size());

	names.add("APPLE");
	names.add("BOT");
	names.add("COAT");

	names.remove(0);  //names.remove(APPLE);

	System.out.println("Current size = "+names.size());
	names.add("DUCK");
	System.out.println("Updated size = "+names.size());
	
	//System.out.println(names);

	names.add("EAGLE");
	System.out.println("Reupdated size = "+names.size());

	//System.out.println(names);
	
	Iterator i = names.iterator();  //Traversing list through Iterator
	while(i.hasNext())
	{
	System.out.println(i.next());
	}
    }
}

		/*	HOW TO ADD AND REMOVE THE ELEMENTS	*/

/*

import java.util.*;
class ArrayList1
{
	public static void main(String aa[])
	{
	ArrayList<String> names = new ArrayList<String>();    //Creating Arraylist

	int n = names.size();
	System.out.println("Initial size ="+n);

//WE CAN ALSO WRITE THE ABOVE 2 STATEMENTS AS COMPRESSED BELOW.

//System.out.println("Initial size = "+names.size());

	names.add("APPLE");
	names.add("BOT");
	names.add("COAT");

	names.remove(0);  //names.remove(APPLE);

	System.out.println("Current size = "+names.size());
	names.add("DUCK");
	System.out.println("Updated size = "+names.size());
	
	System.out.println(names);

	names.add("EAGLE");
	System.out.println("Reupdated size = "+names.size());

	System.out.println(names);
    }
}

*/



/*

import java.util.*;  
class ArrayList1
{  
	public static void main(String args[])
	{  
	ArrayList<String> names=new ArrayList<String>();   //Creating arraylist  	
	int n=names.size();
	System.out.println("Initial size="+n);
	names.add("Bineesh");
	names.add("Anil");
	System.out.println("Current size="+names.size());
	
	//System.out.println(names);
	
				
	Iterator i=names.iterator();  //Traversing list through Iterator  
	while(i.hasNext())
	{  
		System.out.println(i.next());  
	}

            
	}  
}

*/


 