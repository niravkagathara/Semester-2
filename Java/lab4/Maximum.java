import java.util.*;
public class Maximum {

    void max(int x,int y){
            if(x>y){
                System.out.println("maximum is"+x);
            }
            else{
                System.out.println("maximum is"+y);
            }
    }
    public static void main(String[] args) {
            Scanner s= new Scanner (System.in); 
            System.out.println("enter value of x and y");
            int x=s.nextInt();
            int y=s.nextInt();
            Maximum h=new Maximum();
            h.max(x,y);
        }
}
