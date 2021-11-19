//Switch-no of days
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
    int dd,mm,yy;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter date(DD,MM,YY): ");
    dd=sc.nextInt();
    mm=sc.nextInt();
    yy=sc.nextInt();
    switch(mm)
    {
       case 1:
       case 3:
       case 5:
       case 7:
       case 8:
       case 10:
       case 12: System.out.println("No of days 31");
                break;
        case 2: if((yy % 4 ==0 && yy % 100!=0)||(yy % 400==0))
		            {
		                System.out.println("28 DAYS");
		            }
		            break;
		    case 4:
		    case 6:
		    case 9:
		    case 11: System.out.println("30 DAYS");
		             break; 
		    default:  System.out.println("Invalid Month");          
		             
		}
	}
}

	
