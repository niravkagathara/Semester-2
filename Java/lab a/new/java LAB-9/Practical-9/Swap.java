import java.util.*;  
class Swap   
{  
    public static void main(String a[])   
    {   
        System.out.println("Enter the value of x and y");  
        Scanner sc = new Scanner(System.in);  
        /*Define variables*/ 
        System.out.println("Enter x"); 
        int x = sc.nextInt(); 
        System.out.println("Enter y");
        int y = sc.nextInt();
          
        System.out.println("before swapping numbers: "+"x= "+x +" "+"y= "+y);  
       /*Swapping*/  
        x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping: "+"x= "+x +" "+"y= "+y);   
    }   
}  