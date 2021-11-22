//Write Program to Swap Two Numbers without using third variable
import java.util.*;
public class Swap_Without_Temp
{
    public static void main(String[] args)
    {
        int a; //10
        int b;  //20
        int x;
        int y;
       // int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two nos in array: ");
        a=sc.nextInt();
        b=sc.nextInt();
        x=sc.nextInt();
        y=sc.nextInt(); 
            System.out.println("Nos before swap: "+a+" "+b); 
            System.out.println("Nos before swap: "+x+" "+y);
            a=a+b; //a=30, b=20
            b=a-b; //a=30, b=10
            a=a-b;  //a=20
        
            x=x*y; //x=20
            y=x/y;  //y=5
            x=x/y; //x=4
        System.out.println("Nos after swap: "+a+" "+b); 
        System.out.println("Nos After Swap: "+x+" "+y);
        
    }
    
}
