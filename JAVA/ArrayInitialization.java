
public class ArrayInitialization {
  
    public static void main(String[] args) {
        
        //Array declaration
        String[] arrayOfStrings;
        //Array creation
        arrayOfStrings = new String[5];
        //Array Initialization
        arrayOfStrings [0] = "Canada";
        arrayOfStrings [1] = "London";
        arrayOfStrings [2] = "Ohio";
        arrayOfStrings [3] = "Nigeria";
        arrayOfStrings [4] = "Madrid";
      
        //Print the element of the array
        for (int i = 0; i < 5; i++) {
            System.out.println(arrayOfStrings[i]);
        }
    }
}
