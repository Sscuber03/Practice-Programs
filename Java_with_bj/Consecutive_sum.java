import java.util.*;//Importing Scanner class
class Consecutive_sum
{ //Starting class
    public static void main()
    {//Starting main
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();//Taking user input of the number to find consecutive sum
        int s=0;//variable to store sum
        int i=1,j=1;
        int f=0;
        for(;i<(a/2)+1;i++)
        {
            s=0;
            for(j=i;s<a;j++)
            {
                s+=j;//finding the consecutive sum
            }
            if(s==a)//checking if sum is equal to the inputed number
            {
                f=1;
                for(int k=i;k<j;k++)
                {
                    System.out.print(k+"  ");//Printing out
                }
                System.out.println();
            }
        }
        if(f==0)
            System.out.println("No possible combination of consecutive natural numbers ");
    }//End of main
}//End of class

