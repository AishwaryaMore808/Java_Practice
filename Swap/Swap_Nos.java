//Write Program to Swap Two Numbers using third variable
public class Swap_Nos
{
    public static void main(String[] args)
    {
        int no1=9;
        int no2=7;
        int temp;
        System.out.println("Nos Before Swapping: "+no1+" "+no2);
        temp=no1;
        no1=no2;
        no2=temp;
        System.out.println("Nos After Swapping: "+no1+" "+no2);
    }
    
}
