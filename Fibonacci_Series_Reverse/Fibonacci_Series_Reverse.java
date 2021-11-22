import java.util.*;
public class Fibonacci_Series_Reverse 
{
    public static void main(String[] args)
    {
        Fib_Ser obj=new Fib_Ser();
        obj.fib_rev2();
    }   
}
class Fib_Ser
{
    void Fib_rev1()
    {
        int no1=8;
        int no2=5;
        int no3;
        System.out.println(no1);
        System.out.println(no2);
        Scanner sc=new Scanner(System.in);
        for(int i=1; i<=5; i++)
        {
           no3=no1-no2;
           no1=no2;
           no2=no3;
           System.out.println(no3);
        }
    }

    void fib_rev2()
    {
        int high;
        int low;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter high & low");
        high=sc.nextInt();
        low=sc.nextInt();
        while (low > 0) {
          System.out.println(high);
          int temp = low;
          low = high - low;
          high = temp;
        }

        

    }
}
//0 1 1 2 3 5 8
//8 5 3 2 1 1 0

