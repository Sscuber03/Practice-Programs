import java.util.*;
class Forced_Palin
{
    int v=0;
    int l=0;
    void valid(String x)
    {
        l=x.length();        
        if(x.charAt(l-1)=='.'||x.charAt(l-1)=='!'||x.charAt(l-1)=='?')
        {
            for(int i=0;i<(l-1);i++)
            {
                char p=x.charAt(i);
                if(((int)p>=65&&(int)p<=90)||p==' ')
                {
                    continue;
                }
                else
                {
                    v=1;
                    break;
                }
            }
        }
        else
        {
            v=1;
        }
    }
    void wrdext(String y)
    {      
        String res="";
        y=y.substring(0,l-1);
        y=y+" ";
        String w="";
        for(int i=0;i<l;i++)
        {
            if(y.charAt(i)==' ')
            {
                w=palin(w);
                res=res+w+" ";
                w="";
            }
            else
            {
                w=w+y.charAt(i);
            }
        }
        System.out.println(res);
    }
    String palin(String a)
    {
        int cc=0;
        String z="";
        int le=a.length();
        if(a.charAt(le-1)==a.charAt(le-2))
        {
            cc=(2*le)-2;
        }
        else
        {
            cc=(2*le)-1;
        }
        char s[]=new char[cc];
        for(int i=0;i<cc;i++)
        {
            if(cc%2==1&&i<(cc/2)+1)
            {
                s[i]=a.charAt(i);
            }
            else
            {
                s[i]=s[cc-i-1];
            }
        }
        for(int j=0;j<cc;j++)
        {
            z=z+s[j];
        }
        return z;
    }
    public static void main()
    {
        Forced_Palin obj=new Forced_Palin();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String in=sc.nextLine();
        obj.valid(in);
        if(obj.v==1)
        System.out.println("Invalid input");
        else
        {
            System.out.println(in);
            obj.wrdext(in);
        }
    }
}