public class HomeWork{
	public static void main (String [] args){
		int n= 5;
		for(int i=0;i<n; i++){
			for(int j=0;j<n; j++){
				if(i==0 || i==5 || j==0 || j==5){
					System.out.print("3");
				}

				else if(i==1 || i==4 || j==1 || j==4){
					System.out.print("2");
				}

				else if(i==2 || i==3 || j==2 || j==3){
					System.out.print("1");
				}
			}
			System.out.println("");
			}
		}
	}
