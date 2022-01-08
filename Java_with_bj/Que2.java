import java.util.*;
class Que2
{
    int f,r,a[],size;
    Que2()
    {
        f=-1;
        r=-1;
        a=new int[100];
    }

    boolean isFull()
    {
        if(r==(size-1))
            return true;
        else
            return false;
    }

    boolean isEmpty()
    {
        if(f==-1||f==r+1)
            return true;
        else 
            return false;
    }

    void enqueue(int n)
    {
        if(isFull()==true)
            System.out.println("Overflow!");
        else
        {
            if(f==-1)
                f++;
            a[++r]=n;
        }
    }

    void dequeue()
    {
        if(isEmpty()==true)
            System.out.println("Queue is empty");
        else
            System.out.println(a[f++]);       
    }

    void display()
    {
        if(isEmpty()==true)
            System.out.println("Queue is empty");
        else
        {
            for(int i=f;i<r;i++)
                System.out.println(a[i]);
        }
    }

    public static void main()
    {
        Que2 obj=new Que2();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        obj.size=sc.nextInt();
        while(true)
        {
            System.out.println("Enter 1 to input, 2 to out, 3 to display, 4 to exit");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter number to be inserted");
                int a=sc.nextInt();
                obj.enqueue(a);
                break;
                case 2:
                obj.dequeue();
                break;
                case 3:
                obj.display();
                break;
                case 4:
                sc.close();
                System.exit(0);
                default:
                System.out.println("Wrong choice!!");
            }
        }
    }
}

        