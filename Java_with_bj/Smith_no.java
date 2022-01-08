/**
 * Name: Sambit Sarkar
 * Class: 12  
 * Section: Science A
 * Roll number: 40
 * UID Number: 6843968
 */
import java.util.*;//Importing scanner class
class Smith_no
{//Starting class
    boolean chkSmith(int n)//Method to check if the number is Smith number or not
    {
        if(prime(n)==1)//Calling method to check if the number is prime or not
            return false;
        else
        {
            int s1=sod(n);//Calling method to calculate sum of digits
            int s2=sopf(n);//Calling method to calculate sum of prime factors
            if(s1==s2)
                return true;
            else
                return false;
        }
    }

    int prime(int a)//Method to check if the number is prime or not
    {
        int c=1;
        for(int i=2;i<a/2;i++)
        {
            if(a%i==0)
                c++;
        }
        return c;
    }

    int sod(int s)//Method to calculate the sum of digits of the number
    {
        int k=0;
        while(s>0)
        {
            k+=s%10;
            s/=10;
        }
        return k;//returning the sum
    }

    int sopf(int t)//Method to calculate the sum of the prime factors of the number
    {
        int sum=0;
        int p=2;
        while(t>1)
        {
            while(t%p==0 && p<=t)
            {
                sum+=sod(p);//calculating the sum 
                t/=p;
            }
            p++;
            while(prime(p)!=1)
                p++;           
        }
        return sum;//returing the sum
    }

    public static void main()
    {//Starting the main method
        Smith_no obj=new Smith_no();//Creating object
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the max range to check for Smith numbers");
        int z=sc.nextInt();//Taking user input of the maximum limit 
        int f=0;
        for(int i=1;i<=z;i++)
        {
            if(obj.chkSmith(i))//Calling method to check if Smith number or not
            {
                System.out.print(i+"  ");
                f=1;
            }
        }
        if(f==0)
        System.out.println("There are no Smith number in this range");
        sc.close();
    }
}