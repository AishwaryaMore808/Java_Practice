import java.util.*;
public class Fibonacci_Series
 {
    public static void main(String[] args)
    {
        Fib_Calculate obj=new Fib_Calculate();
        obj.Fib();
    }
    
}
class Fib_Calculate
{
    public void Fib()
    {
        int no1=0;
        int no2=1;
        int no3=0;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter series count: ");
        n=sc.nextInt();
        System.out.println(no1);
        System.out.println(no2);
        for(int i=1; i<=n; i++)
        {
            no3=no1+no2;  // n=3 no1=0 no2=1 0 1 no3=0+1=1 no3=1 
            no1=no2;     // no1=1 
            no2=no3;      //no2=1
            System.out.println(no3+" ");
        }
                  //0 1 1 2 3
               
    }
}
