import java.util.*;
class InterfaceExample implements Data
{
    String name;
    int ph_no;
    public void get_data()
    {
        Scanner sc=new Scanner(System.in);
        name=sc.next();
        ph_no=sc.nextInt();
    }
    public void put_data()
    {
        System.out.println("Name is: "+name);
        System.out.println("Phone no is: "+ph_no);
    }
    public static void main(String[] args)
    {
        InterfaceExample obj=new InterfaceExample();
       obj.get_data();
       obj.put_data();

    } 
    
}
interface Data
    {
        void get_data();
        void put_data();
    }

    
    
 
