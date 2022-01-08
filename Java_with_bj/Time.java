import java.util.*;
class Time
{
    int h;
    int m;
    Time()
    {
        h=0;
        m=0;
    }

    String ch(int a)
    {
        String x[]={"ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
        String y[]={"one","two","three","four","five","six","seven","eight","nine"};
        String z[]={"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String s="";
        int b=a%10;
        a/=10;
        if(a==0)
        {
            if(b>0)
            {
                s=s+y[b-1];
            }
        }
        else if(a==1&&b!=0)
        {
            s=s+z[b-1];
        }
        else
        {
            if(b>0)
            {
                s=s+x[a-1]+" "+y[b-1];
            }
            else{
                s=s+x[a-1];
            }
        }
        return s;
    }

    void display()
    {
        String mm="";
        String hh="";
        System.out.print(h+":"+m+"\t\t\t");
        if(m>30)
        {
            mm=ch(60-m);
            h+=1;
            if(h>12)
            {
                h-=12;
            }
        }
        else
        {
            mm=ch(m);
        }
        hh=ch(h);
        if(m==0)
        {
            System.out.println(hh+" o' clock");
        }
        else if(m==15)
        {
            System.out.println("quarter past "+hh);
        }
        else if(m==30)
        {
            System.out.println("half past "+hh);
        }
        else if(m==45)
        {
            System.out.println("Quarter to "+hh);
        }
        else if(m<30)
        {
            System.out.println(mm+" minute(s) past "+hh);
        }
        else 
        {
            System.out.println(mm+" minute(s) to "+hh);
        }
    }
    public static void main()
    {
        Time obj=new Time();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the hour");
        obj.h=sc.nextInt();
        System.out.println("Enter the minutes");
        obj.m=sc.nextInt();
        if(obj.h<1||obj.h>12||obj.m<1||obj.m>59)
        {
            System.out.println("Invalid input");
        }
        else
        {
            obj.display();
        }
        sc.close();
    }
}