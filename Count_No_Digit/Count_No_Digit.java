public class Count_No_Digit 
{
    public static void main(String[] args)
    {
        int no=12349;
        int count=0;
       
        while(no>=1)
        {
          no=no/10;
          count++;
          //System.out.println(no);
        }
        System.out.println("No of digit in a no: "+count);
    }
    
}
