/* Three sides of a triangle are entered through the keyboard, WAP to check whether the triangle is isosceles,
equilateral, scalene or right angled triangle.*/
import java.util.*;
public class Triangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first side :");
        int a = sc.nextInt();
        System.out.println("enter a second side :");
        int b = sc.nextInt();
        System.out.println("enter a third side :");
        int c = sc.nextInt();
        
        if(a==b||b==c||a==c){
             System.out.println("Triangle is isosceles");
        }
        if(a!=b && b!=c && a!=c){
             System.out.println("Triangle is scalene");
        }
        if(a==b && b==c && a==c){
            System.out.println("Triangle is equilateral");
        }                                       
        if((a*a)+(b*b)==(c*c)||(b*b)+(c*c)==(a*a)||(a*a)+(c*c)==(b*b)){
            System.out.println("Triangle is right angled triangle");
    }
}
}
