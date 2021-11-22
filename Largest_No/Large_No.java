import java.util.*;
public class Large_No
 {
    public static void main(String[] args)
    {
        int no1;
        int no2;
        int no3;
    
        Scanner sc=new Scanner(System.in);
       // System.out.println("Enter three nos: ");
        System.out.print("Enter three nos: ");
        
        no1=sc.nextInt();
        no2=sc.nextInt();
        no3=sc.nextInt();

        Large_class obj=new Large_class();
        obj.Large(no1,no2,no3);
    }
}
class Large_class
{
    public void Large(int no1,int no2, int no3)
    {
            if(no1>no2 && no1>no3)
            {
              System.out.println("Largest no is: "+no1);
            }
            else if(no2>no1 && no2> no3)
            {
            System.out.println("Largest no is: "+no2);
            }
            else
           {
            System.out.println("Largest no is: "+no3);
            
           }
        
    }
    

}
        
  

