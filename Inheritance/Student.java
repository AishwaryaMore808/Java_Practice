//Multilevel Inheritance
import java.util.*;
public class Student 
{
    public static void main(String[] args)
    {
       Stud3 obj=new Stud3();
       obj.stud_data();
       obj.percentage();
       obj.grade();
    }
}
class Stud1
{
    String studname;
    float maths_marks;
    float sci_marks;
    float eng_marks;
    void stud_data()
    {
       System.out.println("Enter student data: "); 
       Scanner sc=new Scanner(System.in);
       studname=sc.next();
       maths_marks=sc.nextFloat();
       sci_marks=sc.nextFloat();
       eng_marks=sc.nextFloat();
       System.out.println("Student Name : "+studname);
       System.out.println("Maths Marks : "+maths_marks);
       System.out.println("Science Marks : "+sci_marks);
       System.out.println("English Marks : "+eng_marks);
    }
}
class Stud2 extends Stud1
{
    float per;
    void percentage()
    {
       per=((maths_marks+sci_marks+eng_marks)/300)*100;
       System.out.println("Percentage of student is: "+per);
    }
}
class Stud3 extends Stud2
{
    String grd;
    void grade()
    {
       if(per>=40)
       {
        System.out.println("Student is pass ");
        if(per>=41 && per<=60)
        {
         System.out.println("Grade of student is: C ");  
        }
        else if(per>=61 && per<=80)
        {
         System.out.println("Grade of student is: B ");
        }
        else if(per>=81 && per<=100)
        {
         System.out.println("Grade of student is: A ");
        }
       }
        else
        {
            System.out.println("Student is fail"); 
        }
    }
}
