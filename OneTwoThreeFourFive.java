import java.util.*;
import java.util.Scanner;

public class OneTwoThreeFourFive{
    public static void main(String[] args)
    {
      // 1)Print a mesage
      System.out.println("Hello World...");

       // 2)print numbers from 1 to 10
      System.out.println("--------------------------------------------------");
      for (int i = 1; i<=10; i++)
      {
        System.out.println(i);
      }

      // 3)print the numbers in reverse
      System.out.println("--------------------------------------------------");
      for (int i = 10; i>0; i--)
      {
        System.out.println(i);
      }

         // 4)print the odd numbers between 1 to 20
      System.out.println("--------------------------------------------------");
      for (int i = 1; i <= 20; i++)
      {
        if(i % 2 == 1)
        {
           System.out.println(i); 
        }
      }







    }

}