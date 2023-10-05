import java.util.*;
public class simpleIntrest {

        void intrest(Double x,Double y,Double z){
            
            double ans;
            ans=(x*y*z)/100;
            System.out.println(ans);
        }
        public static void main(String[] args) {
            Scanner s= new Scanner (System.in); 
            System.out.println("enter value of p,r and n");
            double x=s.nextDouble();
            double y=s.nextDouble();
            double z=s.nextDouble();
            simpleIntrest h=new simpleIntrest();
            h.intrest(x,y,z);
        }
}
