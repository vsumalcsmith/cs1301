import java.util.Scanner;

public class Hi{
   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   System.out.println("enter the number:" );
   int num = input.nextInt();
   
   if (num % 5 == 0)
      System.out.println("Hi five");
   if (num % 2 == 0)
      System.out.println("Hi even");
   }
 }
