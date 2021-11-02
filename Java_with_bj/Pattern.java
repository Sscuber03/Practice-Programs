import java.util.*;
class Pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of lines in the pattern");
        int n=sc.nextInt();
        int ar[]=new int[n];
        int a=((n-1)*2)-1;
        for(int i=0;i<n;i++)
        {
            if(i%2!=0)
            ar[i]=2;
            else
            {
                ar[i]=a;
                a-=4;
            }
        }
        int c;
        if(n%2==0)
        {
            c=n*(n/2)+(n/2);
        }
        else
        {
            c=n*(n/2)+n;
        }
        c=(int)Math.log10(c)+1;
        int m;
        for(int j=1;j<=n;j++)
        {
            m=j;
            for(int k=1;k<=j;k++)
            {
                int l=(int)Math.log10(m)+1;
                System.out.print(m+" ");
                if (k<j)
                {
                    if(k%2!=0)
                    {
                        int p=k-1;
                        m+=ar[p];
                        ar[p]-=2;
                    }
                    else
                    {
                        int p=k-1;
                        m+=ar[p];
                        ar[p]+=2;
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
