import java.util.Scanner;
class Amount
{
    String change(int a)
    {
        String x[]={"ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
        String y[]={"one","two","three","four","five","six","seven","eight","nine"};
        String z[]={"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String s="";
        int b=a%10;
        a/=10;
        if(a==0)
        {
            if(b>0)
            {
                s=s+y[b-1];
            }
            else
            {
                s="zero";
            }
        }
        else if(a==1)
        {
            s=s+z[b-1];
        }
        else
        {
            if(b>0)
            {
                s=s+x[a-1]+" "+y[b-1];
            }
            else
            {
                s=s+x[a-1];
            }
        }
        return s;
    }

    String amt(String net)
    {
        long n=Integer.parseInt(net);
        int a=(int)(n/(Math.pow(10,5)));
        n%=(Math.pow(10,5));
        int b=(int)(n/(Math.pow(10,3)));
        n%=(Math.pow(10,3));
        int c=(int)(n/100);
        int d=(int)(n%100);
        String x="";
        if(a>=1)
            x=x+change(a)+" lakhs ";
        if(b>=1)
            x=x+change(b)+" thousand ";
        if(c>=1)
            x=x+change(c)+" hundred ";
        if(d>=1)
            x=x+change(d);
        return x;
    }
    public static void main(String args[])
    {
        Amount obj=new Amount();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount");
        String s=sc.nextLine();
        int l=s.length();
        int d=Integer.parseInt(s.substring(l-2,l));
        s=s.substring(0,l-3);
        l-=3;
        int a=l%7;
        String res="";
        while(s.length()>0)
        {
            String t="";
            if(a!=0)
            {
                t=s.substring(0,a);
                s=s.substring(a);
                a=0;
            }
            else
            {
                t=s.substring(0,7);
                s=s.substring(7);
            }
            res=res+obj.amt(t);
            if(s.length()>0)
            {
                res=res+" crore ";
            }
        }
        res=res+" rupees and "+obj.change(d)+" paise.";
        System.out.println(res);
        sc.close();
    }
}

        