// Write an application that executes two threads. One thread displays "Good Morning" every 1000 milliseconds & another thread displays "Good Afternoon" every 3000 milliseconds. Create the threads by implementing the Runnable interface.

class RunInterface implements Runnable
{
	Thread t;
	RunInterface()
	{
		t=new Thread(this,"Msg");
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Good Morning");
				Thread.sleep(1000);
			}
		}catch(InterruptedException ae)
		{
			System.out.println("Exception :: "+ae.toString());
		}
	}
}


class RunnableInterfaceDemo
{
	public static void main(String[] args) 
	{
			new RunInterface();
		try	
		{

			for(int i=0;i<5;i++)
			{
				System.out.println("Good AfterNoon");
				Thread.sleep(3000);
			}
		}catch(Exception e)
		{
			System.out.println("Exception :: "+e.toString());
		}
	}
}