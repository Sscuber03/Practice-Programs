import java.util.*;
class Word
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
        }
        else if(a==1&&b!=0)
        {
            s=s+z[b-1];
        }
        else
        {
            if(b>0)
            {
                s=s+x[a-1]+" "+y[b-1];
            }
            else{
                s=s+x[a-1];
            }
        }
        return s;
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to know word form");
        long n=sc.nextLong();
        Word obj=new Word();
        int a=(int)(n/(Math.pow(10,5)));
        n%=(Math.pow(10,5));
        int b=(int)(n/(Math.pow(10,3)));
        n%=(Math.pow(10,3));
        int c=(int)(n/100);
        int d=(int)(n%100);
        String x="";
        if(a>=1)
            x=x+obj.change(a)+" lakhs ";
        if(b>=1)
            x=x+obj.change(b)+" thousand ";
        if(c>=1)
            x=x+obj.change(c)+" hundred ";
        if(d>=1)
            x=x+obj.change(d);
        System.out.println(x);
    }
}


        