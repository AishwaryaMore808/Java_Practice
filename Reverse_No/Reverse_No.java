public class Reverse_No 
{
    public static void main(String[] args)
    {
        int no=1427;
        int rev=0;
        while(no!=0)
        {
            rev=no%10;
            System.out.println(rev);
            no=no/10;
        }

    }
    
}
