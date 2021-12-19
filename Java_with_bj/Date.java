import java.util.*;
class Date
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of days");
        int d=sc.nextInt();
        System.out.println("Enter the year in four digits");
        int y=sc.nextInt();
        System.out.println("Entert the number of days after");
        int dd=sc.nextInt();
        System.out.println("Day number:"+d);
        System.out.println("Year:"+y);
        System.out.println("Date after (N Days):"+dd);
        String m[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        int day[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int s=365;
        int nd=d+dd;
        if ((y%400==0||y%100!=0)&&(y%4==0))
        {
            s++;
            day[1]=29;
        }
        if(d>s)
            System.out.println("Day number out of range");
        else if(nd>s)
            System.out.println("Date after( N Days) out of range");
        else
        {
            int c=0;
            int copy=d;
            while (copy>day[c])
            {
                copy-=day[c];
                c++;
            }
            int c2=0;
            int copy2=nd;
            while (copy2>day[c2])
            {
                copy2-=day[c2];
                c2++;
            }
            System.out.println("Date: "+copy+"TH "+m[c]+", "+y);
            System.out.println("Date after "+dd+" days: "+copy2+"TH "+m[c2]+", "+y);
        }
        sc.close();
    }
}
