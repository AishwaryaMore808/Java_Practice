//Write Program to Find ASCII Value of a Character
import java.util.*;
public class ASCII_Value 
{
    public static void main(String[] args)
    {
        char alpha1='A';
        int ascii2;
        char alpha2;
        
        Scanner sc=new Scanner(System.in);

        int ascii1=alpha1;

        System.out.println("Enter Alphabet: ");
        alpha2=sc.next().charAt(0);

        ascii2=alpha2; 

        System.out.println("Ascii value of character "+alpha1+" is "+ascii1);
        System.out.println("Ascii value of character "+alpha2+" is "+ascii2);
    }
    
}
