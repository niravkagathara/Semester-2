class A1 extends Thread{
	public void run(){
		try{
			for(int i=0;i<10;i++){
				System.out.println("Good Morning...");
				sleep(1000);
			}
		}
		catch(Exception e){

		}
	}
}
class B1 implements Runnable{
	public void run(){
		try{
			for(int i=0;i<10;i++){
				System.out.println("Good Afternoon...");
				Thread.sleep(3000);
			}
		}
		catch(Exception e){
			
		}
	}
}

public class ThreadDemo{
	public static void main(String[] args) {
		A1 a1=new A1();
		a1.start();
		B1 b1=new B1();
		Thread t=new Thread(b1);
		t.start();
	}
}