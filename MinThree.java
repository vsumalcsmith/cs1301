import java.util.Scanner;

public class MinThree
{
  public static void main(String[] args)
  {
     int num1, num2, num3, min = 0;
     
     Scanner input = new Scanner(System.in);
     
     System.out.println("enter three integers :");
     
     num1 = input.nextInt();
     num2 = input.nextInt();
     num3 = input.nextInt();
     
     if(num1 < num2)
         if(num1 < num3)
           min = num1;
         else
           min = num3;
     else
         if(num2 < num3)
           min = num2;
         else
           min = num3;
System.out.println("minimum value is " + min);
}
}

