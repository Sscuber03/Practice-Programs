import java.util.*;
class Matmultiimp
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array you want to enter");
        int l=sc.nextInt();
        int a[][]=new int[l][l];
        int b[][]=new int[l][l];
        int c[][]=new int[l][l];
        System.out.println("Enter the elements of the first array");
        for (int i=0;i<l;i++)
        {
            for (int j=0;j<l;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second array");
        for (int k=0;k<l;k++)
        {
            for (int m=0;m<l;m++)
            {
                b[k][m]=sc.nextInt();
            }
        }
        int x=0;
        for (int n=0;n<l;n++)
        {
            for (int o=0;o<l;o++)
            {
                for (int p=0;p<l;p++)
                {
                    x+=a[n][p]*b[p][o];
                }
                c[n][o]=x;
                x=0;
            }
        }
        System.out.println("Resultant matrix");
        for (int q=0;q<l;q++)
        {
            for (int r=0;r<l;r++)
            {
                System.out.print(c[q][r]+" ");
            }
            System.out.println();
        }
    }
}

            