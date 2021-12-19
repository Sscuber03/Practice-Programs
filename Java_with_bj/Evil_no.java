import java.util.*;
public class Evil_no
{
    public long Dtob(int a)
    {
        long x=0;
        int c=0;
        while (a>0)
        {
            int d=a%2;
            a/=2;
            x+=(d*Math.pow(10,c++));
        }
        return x;
    }
    public int Count(long a)
    {
        int c=0;
        while(a>0)
        {
           int d=(int)a%10;
           a/=10;
           c+=d;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Evil number or not");
        int n=sc.nextInt();
        Evil_no obj=new Evil_no();
        if(n<=2 && n>100)
        System.out.println("Number out of range");
        else
        {
            long p=obj.Dtob(n);
            int q=obj.Count(p);
            System.out.println("Input: N="+n);
            System.out.println("Binary Equivalent:"+p);
            System.out.println("Number of 1's:"+q);
            if(q%2==0)
            System.out.println("Evil number");
            else
            System.out.println("Not an Evil number");
        }
        sc.close();
    }
}


            