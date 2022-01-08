import java.util.*;
class Quick_sort
{
    public static void qsort(int a[],int l1,int u1)
    {
        int left,right,val,temp,pivot;
        if(l1>=u1)
        return;
        left=l1;
        right=u1;
        val=a[(l1+u1)/2];
        while(left<right)
        {
            while(a[left]<val)
            left++;
            while(a[right]>val)
            right--;
            temp=a[left];
            a[left]=a[right];
            a[right]=temp;
        }
        pivot=left;
        qsort(a,l1,pivot-1);
        qsort(a,pivot+1,u1);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the values of the array elements");
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        qsort(ar,0,n-1);
        System.out.println("Sorted array");
        for(int i=0;i<n;i++)
        System.out.println(ar[i]);
        sc.close();
    }
}

        
    