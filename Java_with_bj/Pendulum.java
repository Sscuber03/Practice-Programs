class Pendulum
{
    public static void main()
    {
        int a[]={1,3,4,5,8,9};
        int m=(int)((0+6)/2.0);
        int b[]=new int[6];
        b[m]=a[0];
        for (int i=1;i<6;i++)
        {
            if(i%2==0)
                b[m+=i]=a[i];
            else
                b[m-=i]=a[i];
        }
        for(int j=0;j<6;j++)
        {
            System.out.print(b[j]+",");
        }
    }
}
