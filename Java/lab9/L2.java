public class L2{
	public static void main(String[] args) {
		Eventdetail e=new Eventdetail();
		e.performEvent();
		e.mouseClicked();
		e.mousePressed();
		e.mouseReleased();
		e.mouseMoved();
		e.mouseDragged();
		e.keyPressesd();
		e.keyReleased();
	}
}

interface EventListener{
	void performEvent();
}

interface MouseListener extends EventListener{
	void mouseClicked();
	void mousePressed();
	void mouseReleased();
	void mouseMoved();
	void mouseDragged();
}

interface KeyListener extends EventListener{
	void keyPressesd();
	void keyReleased();
}

class Eventdetail  implements MouseListener,KeyListener{
	public void mouseClicked(){
		System.out.println("utam");		
	}
	public void mousePressed(){
		System.out.println("utam");
	}
	public void mouseReleased(){
		System.out.println("utam");
	}
	public void mouseMoved(){
		System.out.println("utam");
	}
	public void mouseDragged(){
		System.out.println("utam");
	}
	public void keyPressesd(){
		System.out.println("utam");
	}
	public void keyReleased(){
		System.out.println("utam");
	}
	public void performEvent(){
		System.out.println("utam");		
	}
}