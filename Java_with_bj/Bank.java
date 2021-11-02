/**
 * Name: Sambit Sarkar
 * Class: 12  
 * Section: Science A
 * Roll number: 40
 * UID Number: 6843968
 */
import java.util.*;//Importing Scanner class
class Bank
{//Starting class
    void name(int p)
    {//Method to Convert number to words digit wise
        String n[]={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};//String with the number names. 
        int copy=p;
        int c=0;
        while(copy>0)//Digit counter 
        {
            copy/=10;
            c++;
        }
        c--;
        while(c>=0)
        {
            int z=p/(int)(Math.pow(10,c));
            System.out.print(n[z]+" ");//Printing out the numbers in word form 
            p%=(int)(Math.pow(10,c--));
        }
    }

    public static void main()
    {//Starting main method
        Bank obj=new Bank();//Creating object
        Scanner sc=new Scanner(System.in);
        int a[]={2000,500,200,100,50,20,10,5,2,1};//Array for the Denominations
        int b[]=new int[10];
        System.out.println("Enter the amount");
        int x=sc.nextInt();//Taking user input of the value
        int c1=x;
        if(x>99999)//Checking for invalid input
            System.out.println("INVALID INPUT");
        else
        {
            obj.name(x);//Calling name method to print out amount in words
            System.out.println();
            int c=0;
            int co=0;
            while(x>0)//While loop to divide the amount according to the given denominations
            {
                int y=x/a[c];
                if(y!=0)
                {
                    b[c]=y;
                    x%=a[c];
                    co+=y;
                }
                c++;
            }
            System.out.println("DENOMINATION:");
            for(int i=0;i<10;i++)//For loop to print out the denomination divisions
            {
                if(b[i]!=0)
                    System.out.println(a[i]+"*"+b[i]+"="+(a[i]*b[i]));
            }
            System.out.println("TOTAL = "+c1);//Printing out the total amount
            System.out.println("TOTAL NUMBER OF NOTES = "+co);//Printing out the total number of notes
        }
    }//End of main method
}//End of class

        