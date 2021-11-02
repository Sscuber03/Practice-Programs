import java.util.*;//Importing Scanner class
public class Series
{ //Starting class
    int n;//declaring instance variables
    int x;
    double s;//variable to store the sum of the series
    void input()//Method to take user input
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms");
        n=sc.nextInt();
        System.out.println("Enter value of x");
        x=sc.nextInt();
    }

    double calculate(int a,int b)//Method to calculate the value of a to the power b
    {
        if (b==0)
            return 1;
        else
            return (a*calculate(a,b-1));
    }

    int calculate(int n)//Method to calculate facorial value of a
    {
        if (n==0)
            return 1;
        else if (n==1)
            return 1;
        else
            return (n*calculate(n-1));
    }

    void sum_of_series()//Method to calculate the sum of the series
    {
        for(int i=0;i<n;i++)
        {
            if (i%2==0)
                s+=(calculate(x,(2*i)))/(calculate(2*i));
            else
                s-=(calculate(x,(2*i)))/(calculate(2*i));
        }
        display(s);//Calling display method
    }

    void display(double a)//Method to display value of variable a
    {
        System.out.println("Sum of the series is "+a);
    }
}//Ending class

    