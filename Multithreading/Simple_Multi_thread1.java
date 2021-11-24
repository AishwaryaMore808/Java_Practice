public class MyThread
{
   public static void main(String[] args)
   {
    hello obj=new hello();
    obj.show();
   }
}
class hi
{
    public void show()
    {
        System.out.println("hi");
    }
}
class hello extends hi
{
    public void show()
    {
        System.out.println("hello");
    }
}
    

