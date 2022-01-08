import java.util.*;
class St_q
{
    int top,ar[];
    void push(int n)
    {
        if(top==9)
            System.out.println("Stack is overflow");
        else
            ar[++top]=n;
    }

    void pop()
    {
        if(top==-1)
            System.out.println("Stack is empty");
        else
        {
            System.out.println(ar[top]);
            top--;
        }
    }

    St_q()
    {
        ar= new int[10];
        top=-1;
    }
}
class Stack
{
    public static void main()
    {
        St_q obj=new St_q();
        Scanner sc=new Scanner(System.in);
        int x=0;
        while (x!=3)
        {
            System.out.println("Enter 1 to input, 2 to output in the stack, 3 to exit the loop");
            x=sc.nextInt();
            switch(x)
            {
                case 1:
                System.out.println("Enter no. to be entered");
                int a=sc.nextInt();
                obj.push(a);
                break;
                case 2:
                obj.pop();
                break;
                case 3:
                System.out.println("End of the stack program");
                break;
                default:
                System.out.println("Wrong choice!");
            }
        }
        sc.close();
    }
}
