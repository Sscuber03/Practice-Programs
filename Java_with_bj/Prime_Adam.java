import java.util.*;
class Prime_Adam
{
    int Prime(int x)
    {
        int ret=0;
        for(int i=2;i<=(x/2);i++)
        {
            if(x%i==0)
            {
                ret=1;
                break;
            }
        }
        return ret;
    }

    int Rev(int y)
    {
        int r=0;
        while(y>0)
        {
            int d=y%10;
            y/=10;
            r=(r*10)+d;
        }
        return r;
    }

    public static void main()
    {
        Prime_Adam obj=new Prime_Adam();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower limit:");
        int m=sc.nextInt();
        System.out.println("Enter the upper limit:");
        int n=sc.nextInt();
        int c=0;
        for(int i=m;i<=n;i++)
        {
            if(obj.Prime(i)==0)
            {
                int sq=i*i;
                int sqr=obj.Rev(sq);
                int re=obj.Rev(i);
                int rsq=re*re;
                if(rsq==sqr)
                {
                    if(c==0)
                    {
                        System.out.println("The Prime-Adam integers are:");
                    }
                    System.out.print(i+"  ");
                    c++;
                }
            }
        }
        if(c!=0)
        {
            System.out.println();
        }
        System.out.println("Frequency of the Prime-Adam integers: "+c);
        sc.close();
    }
}