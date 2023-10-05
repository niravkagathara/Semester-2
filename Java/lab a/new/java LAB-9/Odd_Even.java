class odd implements Runnable{
	public void run(){
		for(int i=1;i<=20;i++){

			if(i%2==0){

				System.out.println("Even ="+i);
			}
			try{
				Thread.sleep(100);
			}
			catch(Exception e){

			}
		}
	}
}

class even implements Runnable{
	public void run(){
		for(int i=1;i<=20;i++){

			if(i%2!=0){

				System.out.println("Odd ="+i);
			}
			try{
				Thread.sleep(100);
			}
			catch(Exception e){
				
			}
		}
	}
}

public class Odd_Even{
	public static void main(String[] args){

		odd a1=new odd();
		Thread t1=new Thread(a1);
		t1.start();

		even a2=new even();
		Thread t2=new Thread(a2);
		t2.start();
	}
}