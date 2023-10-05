class run1 implements Runnable{
	public void run(){
		while(true){
			System.out.println("Good Morning");
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){

			}
		}
	}
}

class run2 implements Runnable{
	public void run(){
		while(true){
			System.out.println("Good Afternoon");
			try{
				Thread.sleep(3000);
			}
			catch(Exception e){
				
			}
		}
	}
}

public class MultiThread{
	public static void main(String[] args) {

		run1 r1=new run1();
		Thread t1=new Thread(r1);
		t1.start();

		run2 r2=new run2();
		Thread t2=new Thread(r2);
		t2.start();
		
	}
}