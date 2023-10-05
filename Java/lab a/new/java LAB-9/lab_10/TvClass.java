interface TV_remote{
	public void start();
	public void stop();
}
interface Smart_TV_remote extends TV_remote{
	public void volume();
	public void selectchannel();


}
class TV implements Smart_TV_remote
{
	public void start()
	{
		System.out.println("Smart TV remote started");
			
		}
		public void stop()
	{
		System.out.println("Smart TV remote stop");
			
		}
		public void volume()
	{
		System.out.println("Smart TV remote volume changed");
			
		}
		public void selectchannel()
	{
		System.out.println("Smart TV remote select channel");
			
		}
	}

class TvClass{
	public static void main(String[] args){
		TV t=new TV();
		t.start();
		t.volume();
		t.selectchannel();
		t.stop();
	}
}