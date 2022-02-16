import java.util.*;
interface bank
{
	static int amt=10;
	public void deposite();
public void withdraw();
}
 class operation implements bank
{
	 int depo_amt;
	 int withdraw_amt;
	 Scanner sc=new Scanner(System.in);
	 public void deposite()
	{
			System.out.println("Enter Amount:");
			depo_amt=sc.nextInt();
			
			depo_amt=amt+depo_amt;
			System.out.println("Deposite Amount is: "+depo_amt);
	}
	 public void withdraw()
	 {
		 
		 System.out.println("Enter Amount to Withdraw: ");
		 withdraw_amt=sc.nextInt();
		 if(withdraw_amt<=depo_amt)
		 {
			 System.out.println("withdrawal Amount :" +withdraw_amt); 
			 depo_amt=depo_amt-withdraw_amt;
			 System.out.println("Amount After Withdraw: " +depo_amt);
		 }
		 else
		 {
			 System.out.println("Cannot Proceed Your Transaction:");
		 }
		
	 }
}
public class bankoperation 
{
 
  public static void main(String[] args) {
		
	  operation obj=new operation();
       obj.deposite();
       obj.withdraw();
	}

}
