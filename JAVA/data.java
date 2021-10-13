package assignment;

/*
Fill in the following blanks marked to create a working code.

The program sorts an integer array.
Steps to do:
       1. Create a Sorter class
       2. It should have private boolean member descending
       (If true sort the array in descending order else sort in 
        ascending order). This should be set at the time of creating
        sorter object.
       3. A public method int [] sort(int [] array) that sorts the array
          in ascending or descending order depending on the boolean
          variable descending.
          (Hint : You can create private methods SortAscending and 
          SortDescending that sorts arrays in ascending and descending 
          order respectively. Call them in conditionally in the sort method
(Write your own code. Do not make use of built in methods to implement
 the algorithm)
*/
import java.util.Scanner;

class Sorter
{
    private boolean descending;

    Sorter(boolean descending)
    {
        /*
         Write code here
        */
        this.descending = descending;
    }
    public int [] sort(int [] array)
    {
        int [] sortedarray = new int[array.length];
        /*
       Write code here
       */
      if  (descending == true )
      {
          sortedarray = SortDescending(array);
      }  
      else
      {
        sortedarray = SortAscending(array);
      }

       return sortedarray;
    }

    private int [] SortAscending(int [] array)
    {
        int [] sortedarray = new int[array.length];
         /*
        Write code here
        */
        sortedarray = array;
        for (int i = 0; i < sortedarray.length; i++)   
{  
for (int j = i + 1; j < sortedarray.length; j++)   
{  
int tmp = 0;  
if (sortedarray[i] > sortedarray[j])   
{  
tmp = sortedarray[i];  
sortedarray[i] = sortedarray[j];  
sortedarray[j] = tmp;  
}  
}
}

        return sortedarray;

    }

    private int [] SortDescending(int [] array)
    {
        int [] sortedarray = new int[array.length];
         /*
        Write code here
        */
        sortedarray = array;
        for (int i = 0; i < sortedarray.length; i++)   
{  
for (int j = i + 1; j < sortedarray.length; j++)   
{  
int tmp = 0;  
if (sortedarray[i] < sortedarray[j])   
{  
tmp = sortedarray[i];  
sortedarray[i] = sortedarray[j];  
sortedarray[j] = tmp;  
}  
}
}


        return sortedarray;

    }
}




class Assignment_1
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        Sorter s = new Sorter(true);
        int size;
        System.out.println("Enter the number of elements in the array");
        size = in.nextInt();
        int [] array = new int[size];

        System.out.println("Enter the elements of the array");
        for (int i=0; i<size; i++)
        {
            array[i] = in.nextInt();
        }
        in.close();
        System.out.println("\nThe elements of the original array");
        for(int x:array)
        {
            System.out.print(x+" ");
        }

        array = s.sort(array);
        //the following code should print the elements in sorted order
        System.out.println("\nThe elements of the sorted array");
        for(int x:array)
        {
            System.out.print(x+" ");
        }
        System.out.println();
      
    }
}