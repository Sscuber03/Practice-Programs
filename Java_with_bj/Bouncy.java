/**
 * Name: Sambit Sarkar
 * Class: 12  
 * Section: Science A
 * Roll number: 40
 * UID Number: 6843968
 */
import java.util.*;//Importing Scanner class
class Bouncy
{//Starting class 
    public static void main(String args[])
    {//Starting main method
        Bouncy obj=new Bouncy();//Creating object
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int n=sc.nextInt();//User input of the number to be checked
        if(obj.isincrease(n))//Checking if Increasing 
        {
            System.out.println("The number "+n+" is Increasing and not Bouncy");
        }
        else if(obj.isdecrease(n))//Checking if Decreasing
        {
            System.out.println("The number "+n+" is Decreasing and not Bouncy");
        }
        else
        {
            System.out.println("The number "+n+" is Bouncy");
        }
        sc.close();
    }
    boolean isincrease(int x)//Method to check if number is Increasing or not
    {
        boolean f=true;
        int l=x%10;//Last digit of the number
        x/=10;
        while(x>0)
        {
            int d=x%10;
            if(d>l)
            {
                f=false;
                break;
            }
            l=d;
            x/=10;
        }
        return f;        
    }
    boolean isdecrease(int x)//Method to check if number is Decreasing or not
    {
        boolean f=true;
        int l=x%10;//Last digit of the number
        x/=10;
        while(x>0)
        {
            int d=x%10;
            if(d<l)
            {
                f=false;
                break;
            }
            l=d;
            x/=10;
        }
        return f;
    }
}//End of class

    