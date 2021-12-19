import java.util.*;
class Decode
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the code");
        String s=sc.nextLine();
        String ns="";
        int r=0,r1=0,l=0,u=2;
        while(u<=s.length())
        {
            r=Integer.parseInt(s.substring(l,u));
            if(r==32&&r!=r1)
            ns+=" ";
            else if(r<65&&u<s.length())
            {
                u++;
                r=Integer.parseInt(s.substring(l,u));
                continue;
            }
            else if(r>122&&u<s.length())
            {
                l++;
                r=Integer.parseInt(s.substring(l,u));
                continue;
            }
            if((r>=65&&r<=90)||(r>=97&&r<=122))
            {
                char a=(char)r;
                ns+=a;
            }
            l=u;
            u+=2;
            r1=r;
        }
        System.out.println(ns.toUpperCase());
        sc.close();
    }
}
