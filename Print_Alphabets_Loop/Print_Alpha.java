public class Print_Alpha 
{
    public static void main(String[] args)
    {
        //FROM ASCII VALUE
        char ch1='A';
        char ch2='Z';
        int ch1_ascii=ch1;
        int ch2_ascii=ch2;
        System.out.println(ch1_ascii+" "+ch2_ascii);
        for(int i=ch1_ascii; i<=ch2_ascii; i++)
        {
            System.out.println(ch1);
            ch1++;
        }
        //FROM LOOP=A-Z
        for(char i='A'; i<='Z'; i++)
        {
            System.out.println(i);
        }
    }
    
}
