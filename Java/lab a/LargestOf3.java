 //WAP to find out largest number from given three numbers without using Logical Operator.
 import java.util.Scanner;
 public class LargestOf3{
 public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter first number :");
      int a = sc.nextInt();
      System.out.println("enter second number :");
      int b = sc.nextInt();
      System.out.println("enter third number :");
      int c = sc.nextInt();
      
      if(a>b){
          if(a>c){
              System.out.println("first is greater");
          }
          else{
             System.out.println("third is greater");
          }
      }
      else{
           if(b>c){
              System.out.println("second is greater");
          }
          else{
             System.out.println("third is greater");
          }
      }

   }
 }