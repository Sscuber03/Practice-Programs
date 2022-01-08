import java.util.*;
class Exception2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a integer value");
        if(sc.hasNextInt())
        System.out.println("Ok");
        else
        System.out.println("Wrong input!");
        sc.close();
    }
}