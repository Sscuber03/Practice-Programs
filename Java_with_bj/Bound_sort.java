import java.util.*;
class Bound_sort
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=0;
        int x=(2*(n+m))-4;
        int a[][]= new int[n][m];
        int b[]= new int[x];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the elements of the "+(i+1)+"th row of the matrix");
            for(int j=0;j<m;j++)
            {
                a[i][j]= sc.nextInt();
                if(i==0||j==0||i==(n-1)||j==(m-1))
                {
                    b[c++]=a[i][j];
                }
            }
        }
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<c-i-1;j++)
            {
                if(b[j]>b[j+1])
                {
                    int t=b[j];
                    b[j]=b[j+1];
                    b[j+1]=t;
                }
            }
        }
        System.out.println("Original matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int co=0;
        for(int i=0;i<n;i++)
        {
            a[i][0]=b[co++];
        }
        for(int j=1;j<m;j++)
        {
            a[n-1][j]=b[co++];
        }
        for(int i=(n-2);i>=0;i--)
        {
            a[i][m-1]=b[co++];
        }
        for(int j=(m-2);j>0;j--)
        {
            a[0][j]=b[co++];
        }
        System.out.println("Sorted matrix");
        for(int k=0;k<n;k++)
        {
            for(int l=0;l<m;l++)
            {
                System.out.print(a[k][l]+" ");
            }
            System.out.println();
        }
    }
}
