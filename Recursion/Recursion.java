public class Recursion 
{
    public static void main(String[] args)
    {
        int no=5;
        int fact;
        fact_rec f=new fact_rec();
        fact=f.recursion(no);
        System.out.println("Factorial of no : "+fact);
    }
    
}
class fact_rec
{
    int recursion(int no)
    {
        if(no>=1)
        {
            return no * recursion(no - 1);
        }
        else
        {
            return 1;
        }
    }
    
}
