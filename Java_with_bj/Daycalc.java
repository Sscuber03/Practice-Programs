import java.util.*;
class Daycalc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter date in ddmmyyyy format");
        int dt=sc.nextInt();
        int y=dt%10000;
        dt/=10000;
        int m=dt%100;
        int d=dt/100;
        int yy=y-1;
        yy%=400;
        int od=0;
        od+=yy/100;
        od*=5;
        yy%=100;
        int l=yy/4;
        yy+=l;
        od+=yy;
        String w[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int mi[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if(y%100!=0&&y%4==0||y%400==0)
        mi[1]=29;
        for(int i=0;i<(m-1);i++)
        od+=mi[i];
        od+=d;
        od%=7;
        System.out.println(w[od-1]);
        sc.close();
    }
}

        