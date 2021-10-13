//package class_materials;
//create a class complex which supports operations like addition, subtraction, compliment
// division and multiplication
class complex {
    float real;
    float imag;
    //constructor
    complex(float real, float imag)
    {
        //this refers to the present object 
        this.real = real;
        this.imag = imag;
    }

    //Add a complex with the present one
    //the function returns another instance of class complex
        complex add(complex f)
           {
               complex sum = new complex(1,1);
               sum.real = this.real + f.real;
               sum.imag = this.imag + f.imag;
               System.out.println("\n");
               System.out.print("Addition");
               return sum;
           }
    //Multiply a complex with the present one
    complex multiply(complex f)
    {
        complex prod = new complex(1,1);
        prod.real = this.real*f.real - this.imag*f.imag;
        prod.imag = this.real*f.imag + f.imag*this.real;
        System.out.println("\n");
        System.out.print("Multiplication");
        return prod;
    }

    //Subtraction of a complex from the present complex
    complex substraction(complex f)
    {
        complex sub = new complex(1,1);
        sub.real = this.real - f.real;
        sub.imag = this.imag - f.imag;
        System.out.println("\n");
        System.out.print("Substraction");
        return sub;
    }


    //Divide the present complex by another complex.
    complex division(complex f)
    {
        complex div = new complex(1,1);
        float deno = (f.real*f.real + f.imag*f.imag);
        div.real = (this.real*f.real + this.imag*f.imag)/deno;
        div.imag = (f.real*this.imag - this.real*f.imag)/deno;
        System.out.println("\n");
        System.out.print("Division");
        return div;
    }
    complex compliment(complex f)
    {
        complex comp = new complex(1,1);
        comp.real = f.real;
        comp.imag = f.imag*(-1);
        System.out.println("\n");
        System.out.print("compliment");
        return comp;

    }


    void printcomplex()
    {
        System.out.println("\n");
        System.out.println(this.real + " + "+this.imag + " i");
        System.out.println("\n");
    }


}







public class OOPS_1 {
    public static void main(String [] args)
    {
       complex f = new complex(1,4); //  1/4
       complex g = new complex(1,4); // 1/4
       complex add = f.add(g);
       add.printcomplex();
       complex sub = f.substraction(g);
       sub.printcomplex();
       complex div = f.division(g);
       div.printcomplex();
       complex mul = f.multiply(g);
       mul.printcomplex();
       complex comp = f.compliment(g);
       comp.printcomplex();

    
    
    }
    
}
