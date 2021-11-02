import java.util.*;
class Ev_Od_2
{
    int l;
    int a[];
    int Decode(int n)
    {
        l=Digitc(n);
        a=new int[l];
    }
    int[] Arr(int n,int l)
    {
        while(n>0)
        {
            a[l]=n%10;
            n/=10;
            l--;
        }
        return a;
    }
    int Digitc(int n)
    {
        int c=0;
        while(n>0)
        {
            n/=10;
            c++;
        }
        return c;
    }
    public static void main()
    {
        Ev_Od_2 obj=new Ev_Od_2();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the eight elements of the array");
        int a[]=new int[8];
        for(int i=0;i<8;i++)
        {
            a[i]=sc.nextInt();
            a[i]=obj.Decode(a[i]);
        }
        System.out.println("Numbers afterdecoding according to the given conditions");
        for(int i=0;i<8;i++)
        {
            System.out.println(a[i]);
        }
    }
}

            