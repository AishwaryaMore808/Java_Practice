import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
       
      rect r=new rect();
      circle c=new circle();
      
      r.rect_peri_area();
      c.cir_area();
      c.test();
    }

} 
class shapeobj
{
    float l=8;
    float w=6;
    float r=2;
    int no;
    Scanner sc=new Scanner(System.in);
    // void dimentions()
    // {
    //      System.out.println("Enter Length: ");
    //      l=sc.nextFloat();
    //      System.out.println("Enter Width: ");
    //      w=sc.nextFloat();
    //      System.out.println("Enter Radious: ");
    //      r=sc.nextFloat();
    //      System.out.println(l);
    //      System.out.println(w);
    //      System.out.println(r);

    //  }
    void test()
    { 
       
        System.out.println("no");
        no=sc.nextInt();
        System.out.println(no);

    }
}

class rect extends shapeobj
{
    float rect_peri;
    float rect_area;
    int no;
    public void rect_peri_area()
    {
        rect_peri=(2*(l+w));
        rect_area=(l*w);
        no=no+2;
        System.out.println("Perimeter of rectangle is: "+rect_peri);
        System.out.println("Area of rectangle is: "+rect_area);
        System.out.println("no"+no);
    }
    
}
class circle extends shapeobj
{
    double pi=3.144;
    double cir_peri;
    double cir_arr;
    public void cir_area()
    {
        cir_peri=(2*pi*r);
        cir_arr=(pi*r*r);
        System.out.println("Perimeter of circle is: "+cir_peri);
        System.out.println("Area of circle is: "+cir_arr);
    }
}

    


