//WAP to accept n numbers in an array. Now, enter a number and search whether the number is present or not in the list of array elements by using linear search
import java.util.*;
public class Present {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.print("enter array element");
        int n=sc.nextInt();
        int Size[]=new int[n];

        for(int i=0;i<n;i++){
            Size[i]=sc.nextInt();
        }
        System.out.print("enter a num");
        int v=sc.nextInt();
        Present M=new Present();
        int x=M.search(Size,n);
        if(x==-1){
        System.out.print("element not found");
        }
        else{
            System.out.print("element found"+x);
        }
    }
    int search(int a[],int x){
        int i=0;
        for(i=0;i<a.length;i++)
        {
            if(a[i]==x){
                return i;
            }

        }
        return-1;
    }
}
