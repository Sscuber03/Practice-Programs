import java.util.*;
class Day
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int n=sc.nextInt();
        System.out.println("Enter the second number");
        int m=sc.nextInt();
        System.out.println("Enter your choice");
        char c=sc.next().charAt(0);
        switch(c)
        {
            case '+':
            System.out.println(n+m);
            break;
            case '-':
            System.out.println(n-m);
            break;
            case '*':
            System.out.println(n*m);
            break;
            default:
            System.out.println("Wrong choice!!");
        }
        sc.close();
    }
}



