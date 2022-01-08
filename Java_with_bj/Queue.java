/**
 * Name: Sambit Sarkar
 * Class: 12  
 * Section: Science A
 * Roll number: 40
 * UID Number: 6843968
 */
import java.util.*;//Importing scanner class
class Queue
{//Starting class
    int a[];//Declaring iknstance variables
    int f;
    int r;
    int size;
    Queue(int z)//Parameterised constructor
    {
        f=0;
        r=0;
        size=z;
        a=new int[size];
    }
    void enqueue()//Method to input an element in the queue
    {
        Scanner s=new Scanner(System.in);
        if(r==size)//Ckecking if queue is full or not
        System.out.println("The queue is full");
        else
        {
            System.out.println("Enter the element to be inserted");
            a[r]=s.nextInt();
            r++;
        }
        s.close();
    }
    void dequeue()//Method to take out an element from the queue
    {
        if(r==0)//Checking if queue is empty or not
        System.out.println("Queue is empty");
        else
        {
            System.out.println("The elements dequeued is "+a[f]);
            f++;
            if(r==size && f==r)
            f=r=0;
        }
    }
    void display()//Method to print out queue elements
    {
        if(r==0)
        System.out.println("The Queue is empty");
        else
        {
            System.out.println("Elements in the queue are");
            for(int i=f;i<r;i++)
            System.out.println(a[i]);
        }
    }
    public static void main()
    {//Starting main method
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the queue");
        int n=sc.nextInt();//Taking user input of the size of the queue
        Queue obj=new Queue(n);//Creating object
        int x=0;//Variable to store the option chosen by the user
        while(x!=4)//While loop to take user input of choice and continue the program until the user chooses to exit it
        {
            System.out.println("Enter 1 to enqueue,2 to dequeue,3 to display the queue;4 to exit the program");
            x=sc.nextInt();//Taking user input of the choice
            switch(x)
            {
                case 1:
                obj.enqueue();//Calling method to input an element in the queue
                break;
                case 2:
                obj.dequeue();//Calling method to take out an element from the queue
                break;
                case 3:
                obj.display();//Calling method to print out the queue
                break;
                case 4:
                System.exit(0);//Exiting the program
                break;
                default:
                System.out.println("Wrong choice!!");//Output for qrong choice
            }
        }
        sc.close();
    }//End of main method
}//End of class