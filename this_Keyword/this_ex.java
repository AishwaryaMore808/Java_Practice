public class this_ex 
{
    public static void main(String[] args)
    {
        student s1=new student(123,"aish","computer");
        student s2=new student(124,"chaitu","mech");
        s1.displaydata();
        s2.displaydata();
          
    } 
    
}
class student
{
    int rolln;
    String name;
    String branch;
    student(int rollno,String name,String branch)
    {
        this.rollno=rollno;
        this.name=name;
        this.branch=branch;
    }
    void displaydata()
    {
        System.out.println("Roll No: "+rollno+" "+"Name : "+name+" "+" "+"branch : "+branch);
    }
    
}
