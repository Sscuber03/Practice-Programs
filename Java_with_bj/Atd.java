import java.util.*;
class Atd
{
    public void convert(String x, int y)
    {
        int l=x.length();
        int c=0;
        int ans=0;
        for (int i=l-1;i>=0;i--)
        {
            if (Character.isDigit(x.charAt(i))==true)
            {
                int a=(int)(x.charAt(i))-48;
                ans+=a*Math.pow(y,c);
                c++;
            }
            else
            {
                ans+=(((int)x.charAt(i))-55)*Math.pow(y,c);
                c++;
            }
        }
        System.out.println(ans);
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number with letters in caps lock");
        String s=sc.nextLine();
        System.out.println("Enter the base of the number");
        int t=sc.nextInt();
        Atd obj=new Atd();
        obj.convert(s,t);
    }
}

    