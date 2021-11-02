/**
 * Name: Sambit Sarkar
 * Class: 12  
 * Section: Science A
 * Roll number: 40
 * UID Number: 6843968
 */
class Worker
{//Starting the base class
    protected String name;//Initialising instanmce variables
    protected double basic;
    public Worker(String n,double b)//Parameterised constructor
    {
        name=n;
        basic=b;
    }
    public void display()//Method to display the name and the basic pay
    {
        System.out.println("Name = "+name);
        System.out.println("Basic = "+basic);
    }
}//End of class
