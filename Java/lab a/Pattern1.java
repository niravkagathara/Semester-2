import java.util.Scanner;

public class Pattern1
{
	public static void main(String[] args)
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the number : ");
		n=sc.nextInt();

		int a=0,b,c;
		b=2*n-1;
		c=b-1;
		int sq[][]=new int[b][b];

		while(n!=0)
		{
			for(i=a;i<=c;i++)
			{
				for(j=a;j<=c;j++)
				{
					if(i==a||i==c||j==a||j==c)
					{
						sq[i][j]=n;
					}
				}
			}
			a++;
			c--;
			n--;
		}

		for(i=0;i<b;i++)
		{
			for(j=0;j<b;j++)
			{
				System.out.print(sq[i][j]+" ");
			}
			System.out.println("");
		}
	}
}