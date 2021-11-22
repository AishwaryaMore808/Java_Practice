//Sum of natural nos
import java.util.concurrent.TimeUnit;
import java.util.*;
class Natural_no
{
    public void sum(int n,int[] arr)
    {
        int sum=0;
        for(int i=0; i<n; i++)
        {
         sum=sum+arr[i];
        }
        System.out.println("Sum of natural no is: "+sum);
        
        
    }
}

public class Main
{
	public static void main(String[] args) {
	    int count;
	    Scanner sc=new Scanner(System.in);
	    
		System.out.println("Enter count of no to be add: ");
		count=sc.nextInt();
		
		int arr[]=new int[count];
		
		System.out.println("Enter nos: ");
		for(int i=0; i<count; i++)
		{
		    arr[i]=sc.nextInt();
		}
		
		Natural_no obj=new Natural_no();
		
		long startTime = System.nanoTime();
		
		obj.sum(count,arr);
		
		long endTime = System.nanoTime();
		
		long timeElapsed = endTime - startTime;
 
        System.out.println("Execution time in nanoseconds: " + timeElapsed);
        
	}
}
