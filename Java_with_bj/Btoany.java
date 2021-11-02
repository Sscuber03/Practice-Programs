import java.util.*;
class Btoany
{
    public int btod(int x)
    {
        int c=0,res=0;
        while(x>0)
        {
            int d=x%10;
            x/=10;
            res=res+(int)(Math.pow(2,c)*d);
            c++;
        }
        return res;
    }

    public int lo(int x,int b)
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

    public String hi(int x, int b)
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

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number in binary to convert to any base");
        int a=sc.nextInt();
        System.out.println("Enter the base you want to convert to");
        int z=sc.nextInt();
        Btoany obj=new Btoany();
        int dec=obj.btod(a);
        if(z<10)
        {
            int p=obj.lo(dec,z);
            System.out.println(a+" in base "+z+" is = "+p);
        }
        else if(z>10)
        {
            String q=obj.hi(dec,z);
            System.out.println(a+" in base "+z+" is = "+q);
        }
        else
        {
            System.out.println(a+" in base "+z+" is = "+dec);
        }
    }
}

           