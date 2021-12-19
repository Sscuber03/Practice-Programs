import java.util.*;
class AnytoAny
{
    String dtoa(int x,int y)
    {
        String ans="";
        while(x>0)
        {
            int d=x%y;
            x/=y;
            char ch;
            String str="";
            if(d>9)
            {
                ch=(char)(d+55);
                ans=ch+ans;
            }
            else
            {
                str=Integer.toString(d);
                ans=str+ans;
            }
        }
        return ans;
    }
    int atod(String x,int y)
    {
        int l=x.length();
        int c=0;
        int ans=0;
        for(int i=l-1;i>=0;i--)
        {
            if(Character.isDigit(x.charAt(i))==true)
            {
                int a=(int)(x.charAt(i))-48;
                ans=a*(int)Math.pow(y,c);
                c++;
            }
            else
            {
                ans+=(((int)x.charAt(i))-55)*Math.pow(y,c);
                c++;
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
        AnytoAny obj=new AnytoAny();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be converted, it's base, and the base it has to be converted to");
        String s=sc.nextLine();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1==10)
        {
            int n=Integer.parseInt(s);
            String out=obj.dtoa(n,n2);
            System.out.println(out);
        }
        else if(n2==10)
        {
            int o=obj.atod(s,n1);
            System.out.println(o);
        }
        else
        {
            int x=obj.atod(s,n1);
            String y=obj.dtoa(x,n2);
            System.out.println(y);
        }
        sc.close();
    }
}
