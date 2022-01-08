import java.util.*;
class Word2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String x=sc.nextLine();
        StringTokenizer ss=new StringTokenizer(x);
        while(ss.hasMoreTokens())
        {
            String q=ss.nextToken();
            System.out.println(q);
        }
        sc.close();
    }
}
