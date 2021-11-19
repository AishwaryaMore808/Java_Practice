//if-else-sum_of_seprated_digits_of_no
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int no;
	    int rem;
	    int sum=0;
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		no=sc.nextInt();
		while(no!=0)
		{
		    rem=no%10;
		    sum=sum+rem;
		    no=no/10;
		}
		
			System.out.println("Addition of digit of no: "+sum);
	}
}
