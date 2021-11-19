//simple calculator
//(create functions(add,sub,mul,div) which takes two i/p & perform calculation then print result)
class cal
{
    //int c;
    void add(int a,int b)
    {
        int c;
        c=a+b;
        System.out.println("Addition is : "+c);
    }
    void sub(int a,int b)
    {
        int c;
        c=a-b;
        System.out.println("Subtraction is : "+c);
    }
    void mul(int a,int b)
    {
        int c;
        c=a*b;
        System.out.println("Multiplication is : "+c);
    }
    void div(int a,int b)
    {
        int c;
        c=a/b;
        System.out.println("Division is : "+c);
    }
    
    
}    
public class Main
{
    public static void main(String[] args) 
	{  
	    cal obj=new cal();
	    obj.add(8,9);
	    obj.sub(7,2);
	    obj.mul(6,2);
	    obj.div(8,4);
	   
	}
}


    	
	

