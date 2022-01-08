class Insertion_sort
{
    public static void main()
    {
        int a[]={10,15,8,11,7};
        for(int i=1;i<=4;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(a[i]<a[j])
                {
                    int t=a[j];
                    a[j]=a[i];
                    for(int k=i;k>j+1;k--)
                        a[k]=a[k-1];
                    a[j+1]=t;
                    break;
                }
            }
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}

    