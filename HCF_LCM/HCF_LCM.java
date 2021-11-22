import java.util.*;

public class HCF_LCM
{
    public static void main(String[] args)
    {
        int no1;
        int no2;
        int hcf;
        int lcm;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two nos: ");
        no1=sc.nextInt();
        no2=sc.nextInt();
        cal_HCF_LCM obj=new cal_HCF_LCM();
        hcf=obj.HCF(no1,no2);
        lcm=obj.LCM(no1,no2,hcf);
        System.out.println("LCM is:"+lcm);
        System.out.println("HCF is: "+hcf);
    }
} 
class cal_HCF_LCM
{
    
    public int HCF(int no1,int no2)
    {
        while(no1!=no2)
       {
          if(no1>no2)
          {
            no1=no1-no2;
          }
          else{
            no2=no2-no1;
          }
        }
         return no2;
    }
    public int LCM(int no1,int no2,int hcf)
    {
        int lcm_val;
        lcm_val=(no1*no2)/hcf;
        return lcm_val;
    }
}
        
        
    
    
