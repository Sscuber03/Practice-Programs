import java.util.*;
class Dta
{
    public void convert(int x,int y)
    {
        String ans="";
        while(x>0)
        {
            int d= x%y;
            x/=y;
            char ch;
            String str="";
            if (d>9)
            {
                ch= (char)(d+55);
                ans=ch+ans;
            }
            else
            {
                str= Integer.toString(d);
                ans=str+ans;
            }
        }
        System.out.println("The converted number is "+ans);
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number in decimal base");
        int a=sc.nextInt();
        System.out.println("Enter the base you want to convert to");
        int b=sc.nextInt();
        Dta obj=new Dta();
        obj.convert(a,b);
    }
}

            