//WAP to prevent creation of second object

class ObjectException
{
	void display()
	{
		System.out.println("Object Creating");
	}
}

class ObjectCreationDemo
{
	public static void main(String[] args) 
	{
		ObjectException[] obj1= new ObjectException[2];

		int count=0;
		try
		{
			//System.out.println(obj1.length);
			for(int i=1;i<=obj1.length;i++)
			{
				obj1[i]=new ObjectException();
				obj1[i].display();
				count=count+1;
				if(count==2)
				{
					throw new Exception();
				}
			}		
		}catch(Exception e)
		{
			System.out.println("Exception :: "+e.toString());
		}
		
	}
}