import arithematic.operation2;
import java.util.Scanner;
class calculator
{
  public static void main (String[]args)
  {
   operation2 op=new operation2();
   Scanner input=new Scanner(System.in);
   System.out.println(" Enter the numbers:");
   op.a=input.nextInt();
   op.b=input.nextInt();
   
   System.out.println(" choose   a Number between(1-4):\n 1.addition\n2.subtraction\n3.multiplication\n4.division");
   int ops=input.nextInt();

   switch(ops)
{
  case 1:
       op.add();
        break;
  case 2:
     op.sub();
      break;
  case 3:
      op.mul();
      break;
  case 4:
      op.div();
      break;
  default:
    System.out.print("invalid input");
    break;
}
}
}