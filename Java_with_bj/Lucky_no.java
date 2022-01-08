import java.util.*;
class Lucky_no
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=n;
        for(int i=0;i<n;i++)
        {
            a[i]=i+1;
        }
        int del=1;
        System.out.println("Lucky number operation");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        while(del<n)
        {
            for(int i=del;i<n;i+=del)
            {
                for(int j=i;j<n-1;j++)
                {
                    a[j]=a[j+1];
                }
                n--;
            }
            del++;
            for(int i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
        System.out.println("Hence the lucky number less than "+c+" are: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
