import java.util.*;
interface TV_remort
{
	public void start();
	public void stop();

}
interface Smart_TV extends TV_remort
{
	public void volume();
	public void channel();
}
class TV implements TV_remort
{
	public void start()
	{
		System.out.println("Tv start");
	}
	public void stop()
	{
		System.out.println("stop tv");
	}
	public void volume()
	{
		System.out.println("start volume");
	}
	public void channel()
	{
		System.out.println("start channel");
	}
}
class P4
{
	public static void main(String[] args) 
	{
		TV t = new TV();
		t.start();
		t.volume();
		t.channel();
		t.stop();
	}
}
output:
Tv start
start volume
start channel
stop tv