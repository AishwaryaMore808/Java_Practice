//Write Program to Swap Two Numbers without using third variable
import java.util.*;
public class Swap_Without_Temp
{
    public static void main(String[] args)
    {
        int a; //10
        int b;  //20
       // int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two nos in array: ");
        a=sc.nextInt();
        b=sc.nextInt();
            
        System.out.println("Nos before swap: "+a+" "+b);     
            a=a+b; //30
            b=a-b; //10
            a=a-b; //20
        
        System.out.println("Nos after swap: "+a+" "+b); 

    }
    
}
