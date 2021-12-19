import java.util.*;//Importing Scanner class
class Comp_fibo
{ //Starting class
    int a,b,n;//Declaring instance variables
    Comp_fibo()//Constructor to initialise variables with user inputed values
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the upper limit to search for composite fibonacci numbers");
        n=sc.nextInt();//user inputed number to check if it is composite fibonacci or not
        a=1;
        b=0;
        sc.close();
    }

    boolean chk_composite(int n)//Method to check if x is composite or not 
    {
        for(int i=2;i<n/2;i++)

            if(n%i==0)
            {
                return true;
            }
        return false;
    }

    int chk_fibo(int n)//Method to check if x is fibonacci number or not
    {
        while(b<n)
            b=a+(a=b);
        if(b==n)
            return 1;
        else
            return 0;
    }

    void display(int num)//Method to display the value of the variable s 
    {
        System.out.println(num);
    }

    public static void main(String args[])
    { //Starting main 
        Comp_fibo obj=new Comp_fibo();//Creating object
        int f=0;
        for(int i=1;i<=obj.n;i++)
        {
            if(obj.chk_fibo(i)==1 && obj.chk_composite(i)==true)//Checking if the number is a composite fibonacci number or not
            {
                f++;
                if(f==1)
                    System.out.println("Composite fibonacci numbers from 1 to "+obj.n+" is");
                obj.display(i);//calling display method
            }
        }
        if(f==0)
            System.out.println("No composite fibonacci number present within the given upper limit");
    }//End of main
}//End of class

            