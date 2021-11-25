import java.util.*;
public class Prime_No 
{
 public static void main(String[] args)
 {
    int no; 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no: ");
    no=sc.nextInt();
    Prime p=new Prime();
    p.checkprime(no);
 }
}
class Prime
{
    boolean flag=false;
    void checkprime(int no)
    {
       
       for(int i=2; i<=no/2; i++)   //2-4
       {
            if(no%i==0)
            {
               flag=true; 
               break;
            }
            else{
                flag=false;
            }
       }
        if(flag==true)
        {
            System.out.println(no +" is not prime no");
        }
        else
        {
            System.out.println(no +" is prime no"); 
        }
        
        
    }
   
    
}
