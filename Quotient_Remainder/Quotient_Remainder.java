    //Write Program to Compute Quotient and Remainder
    import java.util.*;
    public class Quotient_Remainder
    {
        public static void main(String[] args)
        {
            int divident;
            int divisor;
            int quotient;
            int rem;
            Scanner sc=new Scanner(System.in);
            System.out.println("Divident & Divisor :" );
            divident=sc.nextInt();
            divisor=sc.nextInt();
            quotient=divident / divisor;
            rem=divident % divisor;
            System.out.println("Quotient is: "+quotient);
            System.out.println("Remainder is: "+rem);

        }
    }

    
    

