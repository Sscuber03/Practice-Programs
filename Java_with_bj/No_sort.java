/**
 * Name: Sambit Sarkar
 * Class: 12  
 * Section: Science A
 * Roll number: 40
 * UID Number: 6843968
 */
import java.util.*;//Importing scanner class
class No_sort
{//Starting class
    int num[];//Declaring instance variable
    String Num_name(int a)//Method to return the word form of the single digit number 'a'
    {
        String s[]={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
        return s[a];
    }

    void Sort(int x)//Method to sort the number such that the number is maximum with it's constituent digits
    {
        for(int i=0;i<x;i++)
        {
            for(int j=1;j<(x-i);j++)
            {
                if(num[j-1]<num[j])
                {
                    int t=num[j-1];//Swapping the number using a temporary variable
                    num[j-1]=num[j];
                    num[j]=t;
                }
            }
        }
    }

    public static void main()
    {//Starting main method
        No_sort obj=new No_sort();//Creating object
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();//Taking user input of the number to be sorted
        if(n>1000)//Checking if the inputed number is out of range or not
            System.out.println("Out of range");
        else
        {
            int f=0;
            if(n<0)//Checking if number is negetive or not
            {
                System.out.println("Number is negetive");
                n=Math.abs(n);
                f=1;
            }
            int copy=n,c=0;
            while(copy>0)//While loop to count the number of digits
            {
                copy/=10;
                c++;
            }
            obj.num=new int[c];//initialising global aray with size
            if (f==1)//if number is negetive, printing out the absolute value
                System.out.print("Absolute value is ");
            for(int i=0;i<c;i++)//Loop to extract digit and print out its word form
            {
                obj.num[i]=n/(int)(Math.pow(10,(c-i-1)));
                n%=Math.pow(10,(c-i-1));
                System.out.print(obj.Num_name(obj.num[i])+" ");//Calling method to convert the number to word form
            }
            System.out.println();
            if(f==0)//Checking if number is negetive or not and then printing out the sorted number
            {
                obj.Sort(c);
                System.out.println("Max number possible");
                for(int i=0;i<c;i++)
                {
                    System.out.print(obj.Num_name(obj.num[i])+" ");
                }
            }
        }
    }//End of main emthod
}//End of class

        