/**
 * Name: Sambit Sarkar
 * Class: 12  
 * Section: Science A
 * Roll number: 40
 * UID Number: 6843968
 */
import java.util.*;//Importing scanner class
class Goldbach
{//Starting class
    public static void main()
    {//Starting main method
        Goldbach obj=new Goldbach();//Creating object
        int n=0;//Variable to store user input
        int p=3;
        int q=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("N = ");
        n=sc.nextInt();//Taking user input
        if(n%2!=0)//Checking if the given number is odd or not
        {
            System.out.println("Invalid Input, the number inputed is odd");
        }
        else if(n<10 || n>49)//Checking if the number given is out of range or not
        {
            System.out.println("Invalid Input, the number is out of range");
        }
        else
        {
            System.out.println("Prime pairs are: ");
            while(p<n)
            {
                q=n-p;
                if(obj.isPrime(p) && obj.isPrime(q) && p<=q)//Calling method to check if the number is prime or not
                System.out.println(p+","+q);
                p+=2;
            }
        }
        sc.close();
    }
    boolean isPrime(int n)//Method to check if the given number is prime or not
    {
        int f=0;
        for(int i=1;i<=n;i++)//Loop to check divisibility
        {
            if(n%i==0)
            f++;
        }
        if(f==2)
        return true;
        return false;
    }
}