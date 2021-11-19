//for-table_of_no
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int res;
	    int n;
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		n=sc.nextInt();
		for(int i=1; i<=10; i++)
		{
		    res=n*i;
		    System.out.println(n+"*"+i+"="+res);
		}
		
	}
}
