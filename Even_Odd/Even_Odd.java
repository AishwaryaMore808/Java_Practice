//Write Program to Check Whether a Number is Even or Odd, same for finding between a range
import java.util.*;
class Even_Odd
{
    public static void main(String[] args)
    {
        Even_Odd_Numbers obj=new Even_Odd_Numbers();
        obj.Even_Odd_No();
        obj.Even_Odd_From_Range();
    }
        
}  
 class Even_Odd_Numbers
 {
    void Even_Odd_No()
        {
            int no=67;
            if(no%2==0)
            {
                System.out.println(no+" is even ");   
            }
            else{
                System.out.println(no+" is odd ");
            }
        }
        void Even_Odd_From_Range()
        {
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements: ");
        for(int i=0;i<=9;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]+" is even ");
            }
            else{
                System.out.println(arr[i]+" is odd ");
            }
        }
    }
 }

