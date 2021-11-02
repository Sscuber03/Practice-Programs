class Insertion
{
    public static void main()
    {
        int a[]={5,2,7,9,1},b,c,i,d;
        for (b=1;b<=4;b++)
        {
            for (c=0;c<b;c++)
            {
                if(a[b]<a[c])
                {
                    int t=a[c];
                    a[c]=a[b];
                    for (d=b;d>c;d--)
                    {
                        a[d]=a[d-1];
                    }
                    a[d+1]=t;
                    break;
                }
            }
        }
        for(i=0;i<5;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
