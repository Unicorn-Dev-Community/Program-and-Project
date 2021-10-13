class  Complex_Op
{
    float real,imag;	
	Complex_Op()
	{
		real=0;
		imag=0;
	}
	Complex_Op(float Comp1,float Comp2)
	{
		real=Comp1;
		imag=Comp2;
	}	
	void  AddNumbers(Complex_Op C1,Complex_Op C2)
	{   
		this.real = (C1.real + C2.real); 
		this.imag = (C1.imag + C2.imag);
		System.out.println("Add Answer is:("+this.real+") + ("+this.imag+")i" );		
	}
	void SubtractNumbers(Complex_Op C1,Complex_Op C2)
	{  
		this.real = (C1.real - C2.real); 
		this.imag = (C1.imag - C2.imag);
		System.out.println("Sub Answer is:("+this.real+") + ("+this.imag+")i" );		
	}
	void MultiplyNumbers(Complex_Op C1,Complex_Op C2)
	{  
		this.real = (C1.real*C2.real - C1.imag*C2.imag); 
		this.imag = (C1.real*C2.imag + C2.real*C1.imag);
		System.out.println("Mul Answer is:("+this.real+") + ("+this.imag+")i" );	
	}
	void DivideNumbers(Complex_Op C1,Complex_Op C2)
	{   
		float deno;
		deno = (C2.real*C2.real + C2.imag*C2.imag);
		this.real = (C1.real*C2.real + C1.imag*C2.imag)/deno; 
		this.imag = (C2.real*C1.imag - C1.real*C2.imag)/deno;
		System.out.println("Div Answer is:("+this.real+") + ("+this.imag+")i" );	
    }
    void Compliment(Complex_Op C1,Complex_Op C2)
    {
        this.real = C1.real;
        this.imag = C2.imag*(-1);
        System.out.println("Comp Answer is:("+this.real+") + ("+this.imag+")i" );
    }
}
public class complex {
    public static void main(String [] args)
    {   Complex_Op cal = new Complex_Op();
        Complex_Op Object1  = new Complex_Op(1,4);
        Complex_Op Object2  = new Complex_Op(1,4);
        cal.AddNumbers(Object1,Object2);
        cal.SubtractNumbers(Object1,Object2);
        cal.MultiplyNumbers(Object1,Object2);
        cal.DivideNumbers(Object1,Object2);
        cal.Compliment(Object1,Object2);

    }
}
