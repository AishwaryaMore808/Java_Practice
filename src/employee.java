public class employee {

	public static void main(String[] args) {
	 employeedetails obj=new employeedetails();
	 obj.setempname("aish");
	 obj.setempid(9);
	 System.out.println(obj.toString());
  }
}
class employeedetails 
{
	int empid;
	String empname;
	String getempname()
	{
		return empname;
	}
	void setempname(String empname)
	{
		this.empname=empname;
	}
	int getempid()
	{
		return empid;	
	}
	void setempid(int empid)
	{
		this.empid=empid;
	}
	public String toString()
	{
		String str=" Employee Name= "+getempname()+" Employee id= "+getempid();
		return str;
		
	}
	
}
