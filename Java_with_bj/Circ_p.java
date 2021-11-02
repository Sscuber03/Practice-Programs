import java.util.*;
class Circ_p
{
    public int prime(int x)
    {
        int c=1;
        for (int i=2;i<x/2;i++)
        {
            if(x%i==0)
                c++;
        }
        return c;
    }

    public int cir(int x,int c)
    {
        int a=(x%10)*(int)Math.pow(10,c-1);
        x/=10;
        a+=x;
        return a;
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is circular prime or not");
        int a=sc.nextInt();
        Circ_p obj=new Circ_p();
        int copy=a,c=0;
        while(copy>0)
        {
            copy/=10;
            c++;
        }
        int f=0;
        for (int i=0;i<c;i++)
        {
            if(obj.prime(a)==1)
                a=obj.cir(a,c);
            else
            {
                f=1;
                break;
            }
        }
        if(f==1)
            System.out.println("Given number is not a circular prime number");
        else
            System.out.println("Given number is a circular prime number");
    }
}

        