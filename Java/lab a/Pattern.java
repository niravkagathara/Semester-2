import java.util.*;
public class Pattern{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      System.out.println("enter number :");
      int n = sc.nextInt();
      int a,i,j;  
        for (i = 1; i <= n; i++){

            for (j = 1; j <= n; j++){

                a = i < j ? i : j;   
             System.out.print(n - a + 1+ " ");   
}  
        for (j = n - 1; j >= 1; j--){  

                a = i < j ? i : j;   
            System.out.print(n - a + 1+ " ");   
}   
          System.out.println();   
}  
        for (i = n - 1; i >= 1; i--){

            for (j = 1; j <= n; j++){

                a = i < j ? i : j;   
            System.out.print(n - a + 1+ " ");   
}   
        for (j = n - 1; j >= 1; j--){

                a = i < j ? i : j;   
            System.out.print(n - a + 1+ " ");   
}   
          System.out.println();   
}   
    }
}