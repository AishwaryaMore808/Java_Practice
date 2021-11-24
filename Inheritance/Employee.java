//Single Inheritance
import java.util.*;
public class Employee 
{
   public static void main(String[] args)
   {
     Emp2 obj2=new Emp2();
     obj2.fullname();
     obj2.displaydata();
   }
    
}
class Emp1
{
    String fname;
    String lname;
    int   empid;  
   Emp1()
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first name & last name & empid: ");
    fname=sc.next();
    lname=sc.next();
    empid=sc.nextInt();
   }
  
}
class Emp2 extends Emp1
{
    public void fullname()
    {
        String fullname;
        fullname=fname+lname;
        System.out.println("fullname is: "+fullname);
        
    }   
    public void displaydata()
   {
     System.out.println("first name is: "+fname);
     System.out.println("last name is: "+lname);
     System.out.println("employee id is: "+empid);
    }
  
}


  













