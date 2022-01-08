/**
 * Name: Sambit Sarkar
 * Class: 12  
 * Section: Science A
 * Roll number: 40
 * UID Number: 6843968
 */
import java.util.*;//Importing Scanner class
class Keith_no
{//Starting class
    int digitc(int a)//Method to count number of digits in the number
    {
        int co=0;
        while(a>0)
        {
            co++;
            a/=10;
        }
        return co;
    }
    public static void main()
    {//Starting main method
        Keith_no obj=new Keith_no();//Creating object
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int n=sc.nextInt();//User input of the number to be checked
        int x=obj.digitc(n);//Calling method to count digits in the number
        int a[]=new int[x];//Array to store the digits and the fibonacci series
        int copy=n;
        int c=x-1;
        int f=0;
        while(copy>0)//While loop to store the digits of the number to the array
        {
            a[c]=copy%10;
            copy/=10;
            c--;
        }
        int z=0;
        while(z<n)//While loop to calculate the next elements of the series
        {
            z=0;
            for(int i=0;i<x;i++)
            {
                z+=a[i];//Calculating the sum of the previous elements
                if(i==x-1)
                a[i]=z;
                else
                a[i]=a[i+1];//Shiftingthe elements of the array
            }
            if(a[x-1]==n)//Checking if the inputed number is equal to the last number of the series
            {
                System.out.println("The given number is a Keith number");
                f=1;
                break;
            }
        }
        if(f==0)//Checking if the number is not a Keith number
        System.out.println("The given number is not a Keith Number");
        sc.close();
    }//End of main method
}//End of class
    