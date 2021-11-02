import java.util.*;
class James_bond
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the code");
        String a=sc.nextLine();
        int l=a.length();
        String s="";
        int f=0;
        int asc=0;
        for(int i=0;i<l;i++)
        {
            int x=(int)a.charAt(i);
            x-=48;
            asc=asc*10+x;
            if((asc>=65&&asc<=90)||(asc>=97&&asc<=122))
            {
                char d=(char)asc;
                s=s+d;
                asc=0;
                f=0;
            }
            else if(asc==32&&f==0)
                s=s+" ";
            else if(asc>12)
            {
                asc=0;
                i--;
            }
        }
        s=s.toUpperCase();
        System.out.println(s);
    }
}

                