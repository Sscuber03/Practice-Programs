import java.util.*;
class Smith
{
    public int prime(int x)
    {
        int c=1;
        for(int i=2;i<=x/2;i++)
        {
            if (x%i==0)
                c++;
        }
        return c;
    }

    public int digitsum(int x)
    {
        int s=0;
        while(x>0)
        {
            s=s+(x%10);
            x/=10;
        }
        return s;
    }

    public static void main()
    {
        Smith obj=new Smith();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check Smith number or not");
        int a=sc.nextInt();
        if(obj.prime(a)==1)
            System.out.println("Smith number cannot be checked as it is a prime number");
        else
        {
            int sum=0,t=0;
            sum=obj.digitsum(a);
            int p=2;
            while(a>1)
            {
                if(a%p==0)
                {
                    if (p>9)
                    {
                        t+=obj.digitsum(p);
                    }
                    else
                    {
                        t+=p;
                    }
                    a/=p;
                }
                else
                {
                    p++;
                    while(obj.prime(p)!=1)
                        p++;
                }
            }
            if (sum==t)
                System.out.println("Given number is a Smith number");
            else
                System.out.println("Given number is not a Smith number");
        }
    }
}
