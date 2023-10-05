import java.util.*;

class time {
	int hour,min;

	time (int h,int m){
		hour=h;
		min=m;
	}
	time (){
		hour=0;
		min=0;
	}
	public time sum(time t2){
		time t3= new time();
		t3.hour=hour+t2.hour;
		t3.min=min+t2.min;
		return(t3);
	}

	void display (){
		System.out.print(hour+ "," +min);
	}

}

public class L7{
	public static void main (String [] args){
		time t1= new time (5,20);
		time t2= new time (4,20);
		time t3= new time();

		t3=t1.sum(t2);
		t3.display();
	}
}