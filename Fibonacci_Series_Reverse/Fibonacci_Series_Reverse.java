import java.util.*;
public class Fibonacci_Series_Reverse 
{
    public static void main(String[] args)
    {
        Fib_Ser obj=new Fib_Ser();
        obj.Fib_rev1();
    }   
}
class Fib_Ser
{
    public void Fib_rev1()
    {
        int no1=55; //5
        int no2=34; //3
        int no3;
        
        System.out.println(no1);
        System.out.println(no2);

        Scanner sc=new Scanner(System.in);
        for(int i=no2; i>0; i--)
        {
           if(no2!=0)
           {
            no3=no1-no2;
            System.out.println(no3);            //8-5=3  //5-3=2  //3-2=1 //2-1=1 //1-1=0
            no1=no2;   //no1=5    //no1=3  //no1=2 //no1=1  //no1=1
            no2=no3;   //no2=3     //no2=2  //no2=1 //no2=1  //no2=0
           }
        
        }
    }
//8 5 3 2 1 1 0
// 0+1=1 i=1
// 1+1=2 i=2
// 1+2=3 i=3
// 2+3=5 i=4
// 3+5=8 i=5
// 5+8=13 i=6
//expoutput= 8 5 3 2 1 1 0
//for(i=2;i<number;++i)/
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

