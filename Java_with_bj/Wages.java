/**
 * Name: Sambit Sarkar
 * Class: 12  
 * Section: Science A
 * Roll number: 40
 * UID Number: 6843968
 */
import java.util.*;//Importing scanner class
class Wages extends Worker
{//Starting daughter class
    protected int hrs;//Intialising instance variables
    protected double rate,wage;
    public Wages(String n,double b,int h,double r)//Parameterised constructor
    {
        super(n,b);//Calling super class to call the constructor of the base class
        hrs=h;
        rate=r;
    }
    public double overtime()//Method to calculate overtime
    {
        return (hrs*rate);
    }
    public void display()//Method to display details
    {
        super.display();//Calling super class to call the display method of the base class
        System.out.println("Hours = "+hrs);
        System.out.println("Rate = "+rate);
        System.out.println("Wage = "+(overtime()+super.basic));//Calling method to calculate overtime
    }
    public static void main()
    {//Starting main method
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the Worker");
        String s=sc.nextLine();//Taking user input of the name of the worker
        System.out.println("Enter the Basic pay of the worker");
        int x=sc.nextInt();//Taking the user input of the basic pay of the worker
        System.out.println("Enter the Overtime hours");
        int y=sc.nextInt();//Taking user input of the overtime hours
        System.out.println("Enter the Rate of overtime pay");
        int z=sc.nextInt();//Taking user input of the overtime pay
        Wages obj=new Wages(s,x,y,z);//creating object of this class
        obj.display();//Calling the display method of this class
    }//End of main method
}//End of daughter class
