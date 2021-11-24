public class Super
{
    public static void main(String[] args)
    {
        frdddata s=new frdddata();
        s.displaydata();
    }
}
class selfdata
{
    String name="AISH";
    
}
class frdddata extends selfdata
{
    String name="CHAITU";
    void displaydata()
    {
        System.out.println("Friend Name is: "+name);
        System.out.println("My Name is: "+super.name);
    }

}
