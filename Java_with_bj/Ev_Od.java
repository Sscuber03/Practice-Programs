import java.util.*;
class Ev_Od
{
    int Decode(int n)
    {
        int l=0;
        int ret=0;
        int copy=n;
        while(copy>0)
        {
            copy/=10;
            l++;
        }
        int c=n;
        if(l==1)
        {
            ret=(c*2)%10;
        }
        else if(l==2)
        {
            ret=c;
        }
        else if(l%2!=0)
        {
            int m=(l+1)/2;
            int d=(int)(c%Math.pow(10,(m-1)));
            c/=Math.pow(10,(m-1));
            int e=c%10;
            c/=10;
            if(e<5)
                e*=2;
            else
                e=(e*2)%10;
            c=(c*10)+e;
            c=(int)(c*Math.pow(10,(m-1)))+d;
            ret=c;
        }
        else
        {
            int d=c%10;
            c/=10;
            int e=c%10;
            c/=10;
            int f=(int)(c%Math.pow(10,(l-3)));
            int g=(int)(c/Math.pow(10,(l-3)));
            int t=g;
            g=e;
            e=t;
            c=(int)(g*Math.pow(10,(l-3)))+f;
            c=(c*10)+e;
            c=(c*10)+d;
            ret=c;
        }
        return ret;
    }

    public static void main(String args[])
    {
        int ar[]=new int[8];
        Ev_Od obj=new Ev_Od();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the eight elements of the array");
        for(int i=0;i<8;i++)
        {
            ar[i]=sc.nextInt();
            ar[i]=obj.Decode(ar[i]);
        }
        for(int i=0;i<8;i++)
        {
            System.out.println(ar[i]);
        }
        sc.close();
    }
}

        