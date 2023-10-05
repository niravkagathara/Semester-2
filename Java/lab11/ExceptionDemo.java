class CustEx extends Exception{
	String msg;
	CustEx(String msg){
		this.msg=msg;
	}
	public String getM(){
		return msg;
	}

}

public class ExceptionDemo{
	public static void main(String[] args) {
		int a=10,b=0,c=0;
		try{
			if(b==0)
			throw new CustEx("Divide by Zero is not possible");
		}
		catch(CustEx e){
			System.out.println(e.getM());
		}
		System.out.println(c);
		System.out.println("hello");
	}
}