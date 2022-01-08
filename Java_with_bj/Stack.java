/**
 * Name: Sambit Sarkar
 * Class: 12  
 * Section: Science A
 * Roll number: 40
 * UID Number: 6843968
 */
import java.util.*;//Importing scanner class
class Stack
{//Starting class
    int a[];//Declaring instance variables
    int t;
    int size;
    Stack(int n)
    {//Parameterised constructor
        size=n;
        t=-1;
        a=new int[size];
    }

    void push()//Method to push an element in the stack
    {
        Scanner s=new Scanner(System.in);
        if(t==size-1)//Checking if stack is full
            System.out.println("Stack is full");
        else
        {
            System.out.println("Enter the number to be entered");
            int n=s.nextInt();
            a[++t]=n;
        }
        s.close();
    }

    void pop()//Method to pop out an element from the stack
    {
        if(t==-1)//Checking if stack is empty
            System.out.println("Stack is empty");
        else
        {
            System.out.println("Popped element = "+a[t]);
            t--;
        }
    }

    void display()//Method to print out the stack elements
    {
        if(t==-1)
            System.out.println("Stack is empty");
        else
        {
            System.out.println("Stack elements are");
            for(int i=0;i<=t;i++)
            {
                System.out.println(a[i]);
            }
        }
    }

    public static void main()
    {//Starting main method
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        int sz=sc.nextInt();//Taking user input of the size of the stack
        Stack obj=new Stack(sz);//Creating object 
        int x=0;//Variable to store the option chosen by the user
        while(x!=4)//While loop to take user input of choice and continue the program until the user chooses to exit it
        {
            System.out.println("Enter 1 to input,2 to pop, 3 to display the stack, 4 to exit the program");
            x=sc.nextInt();//Taking user input of the choice
            switch(x)
            {
                case 1:
                obj.push();//Calling method to push element to the stack
                break;
                case 2:
                obj.pop();//Calling emthod to pop and print an element from the stack
                break;
                case 3:
                obj.display();//Calling method to print out the stack
                break;
                case 4:
                System.exit(0);//Exiting the program
                break;
                default:
                System.out.println("Wrong Choice!!");//Output for wrong choice
            }
        }
        sc.close();
    }//End of main method
}//End of class