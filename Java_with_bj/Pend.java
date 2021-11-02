import java.util.*;
class Pend
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of array elements you wwant to enter");
        int l=sc.nextInt();
        int a[]=new int[l];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<l;i++)
        {
            a[i]=sc.nextInt();
        }
        for (int j=0;j<l-1;j++)
        {
            for (int k=0;k<l-1-j;k++)
            {
                if(a[k]>a[k+1])
                {
                    int t=a[k];
                    a[k]=a[k+1];
                    a[k+1]=t;
                }
            }
        }
        int m=(int)((0+l)/2.0);
        int b[]=new int[l];
        b[m]=a[0];
        for (int o=1;o<l;o++)
        {
            if(o%2==0)
                b[m+=o]=a[o];
            else
                b[m-=o]=a[o];
        }
        for(int p=0;p<l;p++)
        {
            System.out.print(b[p]+",");
        }
    }
}

                