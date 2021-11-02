import java.util.*;
class Que_l
{
    int f,r,ar[];
    Que_l()
    {
        f=-1;
        r=-1;
        ar=new int[5];
    }

    void create(int n)
    {
        if(r==4)
            System.out.println("Queue is full");
        else
        {
            ar[++r]=n;
            if(f==-1)
                f++;
        }
    }

    void delete()
    {
        if(f==-1)
            System.out.println("Queue is empty");
        else
        {
            System.out.println(ar[f]);
            if(f==r)
            f=r=-1;
            else
            f++;
        }
    }

    public static void main()
    {
        Que_l obj=new Que_l();
        Scanner sc=new Scanner(System.in);
        int x=0;
        while (x!=3)
        {
            System.out.println("Enter 1 to input, 2 to output in the queue, 3 to exit the loop");
            x=sc.nextInt();
            switch(x)
            {
                case 1:
                System.out.println("Enter no. to be entered");
                int a=sc.nextInt();
                obj.create(a);
                break;
                case 2:
                obj.delete();
                break;
                case 3:
                System.out.println("End of the queue program");
                break;
                default:
                System.out.println("Wrong choice!");
            }
        }
    }
}  