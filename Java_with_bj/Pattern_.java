class Pattern_
{
    public static void main()
    {
        int c=1;
        for(int i=0;i<6;i++)
        {
            for(int j=1;j<6-i;++j)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                if(k==0||i==0)
                c=1;
                else
                c=c*(i-k+1)/k;
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}

                
                