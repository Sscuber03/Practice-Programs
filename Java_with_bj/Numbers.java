import java.io.*;
public class Numbers 
{
    int N;
    String prime="",palindrome="";
    void writeNum()
    {
        int num;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.print("Enter the Number of elements :");
            N=Integer.parseInt(br.readLine());
            FileWriter fw = new FileWriter("Number.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw=new PrintWriter(bw);
            for (int i = 0; i <N ; i++)
            {
                System.out.print("Enter the "+(i+1)+" element:");
                num=Integer.parseInt(br.readLine());
                pw.println(num);
            }
            pw.close();
            bw.close();
            fw.close();
        }
        catch (Exception e)
        {
            System.err.println(e);
        }
    }
    boolean prime(int n){
        int flag=-1;
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
                flag=1;
                break;
            }
        }
        if (flag==-1)
            return true;
        else
            return false;
    }
    boolean palindrome(int n)
    {
        int d=(int)(Math.log10(n)+1);
        int rev=0,cp=n;
        for (int i = 0; i < d; i++)
        {
            rev=rev*10+(n%10);
            n=n/10;
        }
        if(cp==rev)
            return true;
        else
            return false;
    }
    void readNum()
    {
        int n;
        try
        {
            FileReader fr=new FileReader("Number.txt");
            BufferedReader br=new BufferedReader(fr);
            System.out.println("The numbers are: ");
            for (int i = 0; i < N; i++)
            {
                n=Integer.parseInt(br.readLine());
                System.out.println(n);
                if (prime(n)==true)
                    prime+=" "+n;
                if (palindrome(n)==true)
                    palindrome+=" "+n;
            }
        }
        catch (Exception e)
        {
            System.err.print(e);
        }
        System.out.println("Prime Number are: "+prime);
        System.out.println("Palindrome Numbers are: "+palindrome);
    }
    public static void main(String[] args)
    {
        Numbers nm=new Numbers();
        nm.writeNum();
        nm.readNum();
    }
}