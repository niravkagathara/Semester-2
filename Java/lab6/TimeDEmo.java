import java.util.*;
class Time {
    int hh;
    int mm;
    Time() 
    {
        hh=0;
        mm=0;
    }
    Time(int hh,int mm){
        this.hh=hh;
        this.mm=mm;
    }
    void addTime(Time t,Time t1)
    {
        this.hh=t1.hh+t.hh;
        this.mm=t1.mm+t.mm;
        if (mm>= 60) {
            hh+= mm / 60;
            mm %= 60;
        }

    }
}

public class TimeDEmo{ 
    public static void main (String []args ) {
    
        Scanner sc=new Scanner(System.in);
        System.out.print("enter time 1's hour:");
        int h=sc.nextInt();
        System.out.print("enter time 1's min:");
        int m=sc.nextInt();
        Time t1=new Time(h,m);
        System.out.print("enter time 2's hour:");
        h=sc.nextInt();
        System.out.print("enter time 2's min:");
        m=sc.nextInt();
        Time t2=new Time(h,m);
        Time t3=new Time();
        t3.addTime(t1,t2);
        System.out.print(t3.hh+" "+t3.mm);
}
    
}
/*Write a program in Java to demonstrate use of this keyword. Check whether this can access the Static variables of the class or not.*/
