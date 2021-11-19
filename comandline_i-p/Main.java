//take input from user & display info
import java.util.*;
class info
{
    String name;
    int rollno;
    double marks1;
    float marks2;
    float marks3;
    Scanner sc=new Scanner(System.in);
    void getinfo()
    {
        	System.out.println("Enter name: ");
            name=sc.nextLine();
            System.out.println("Enter rollno: ");
            rollno=sc.nextInt();
            System.out.println("Enter marks1,marks2,marks3: ");
            marks1=sc.nextDouble();
            marks2=sc.nextFloat();
            marks3=sc.nextFloat();
    }
    void displayinfo()
    {
        	System.out.println("name: "+name);
        	System.out.println("rollno: "+rollno);
        	System.out.println("marks1: "+marks1);
        	System.out.println("marks2: "+marks2);
        	System.out.println("marks3: "+marks3);
    }
    
}
public class Main
{
	public static void main(String[] args) {
	    info obj=new info();
	    obj.getinfo();
	    obj.displayinfo();
	
	}
}
