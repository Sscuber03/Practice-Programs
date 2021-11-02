class Matrixmulti
{
    public static void main()
    {
        int a[][]={{1,2},{3,4}};
        int b[][]={{5,6},{7,8}};
        int c[][]=new int[2][2];
        int x=0;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                for(int k=0;k<2;k++)
                {
                    x+=a[i][k]*b[k][j];
                }
                c[i][j]=x;
                x=0;
            }
        }
        for(int l=0;l<2;l++)
        {
            for(int m=0;m<2;m++)
            {
                System.out.print(c[l][m]+" ");
            }
            System.out.println();
        }
    }
}

        