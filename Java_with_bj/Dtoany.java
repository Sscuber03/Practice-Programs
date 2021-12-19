import java.util.*;
class Dtoany
{
    public int lo(int x, int b)
    {
        int res=0,c=0;
        while(x>0)
        {
            int d=x%b;
            x/=b;
            res+=(int)(Math.pow(10,c)*d);
            c++;
        }
        return res;
    }

    public String hi(int x,int b)
    {
        String res="";
        while(x>0)
        {
            int d=x%b;
            x/=b;
            if (d<10)
            {
                res=Integer.toString(d)+res;
            }
            else if(d>=10)
            {
                char r=(char)(d+55);
                res=r+res;
            }
        }
        return res;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to convert it from decimal to any base");
        int a=sc.nextInt();
        System.out.println("Enter the base you want to convert to");
        int z=sc.nextInt();
        Dtoany obj=new Dtoany();
        int p=0;
        String q="";
        if (z<=10)
        {
            p=obj.lo(a,z);
            System.out.println(a+" in base "+z+" is = "+p);
        }
        else
        {
            q=obj.hi(a,z);
            System.out.println(a+" in base "+z+" is = "+q);
        }
        sc.close();
    }
}

        