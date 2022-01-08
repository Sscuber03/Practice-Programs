import java.io.*;
class Exception1
{
    public static void main()
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.println("Enter a integer value");
            int a=Integer.parseInt(br.readLine());
            System.out.println(a);
        }
        catch(Exception e)
        {
            System.out.println("Wrong input"+e);
        }
    }
}
