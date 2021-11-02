class Pattern_p
{
    public static void main()
    {
        int a[]=new int[6];
        a[0]=1;
        int n=6;
        for(int i=0;i<n;i++)
        {
            for(int s=1;s<n-i;s++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(a[j]+" ");
            }
            for(int k=(i+1);k>0;k--)
            {
                if(k==n)
                break;
                a[k]=a[k]+a[k-1];
            }
            System.out.println();
        }
    }
}

                