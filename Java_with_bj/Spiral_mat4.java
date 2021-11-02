import java.util.*;
class Spiral_mat4
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int n=sc.nextInt();
        int a=0,b=0,c=n,d=n;
        int mat[][] = new int[n][n];
        for(int z=1;z<=n*n;)
        {
            for(int i=a;i<c;i++)
            {
                mat[i][a]=z++;
            }
            for(int j=b+1;j<d;j++)
            {
                mat[c-1][j]=z++;
            }
            for(int i=(c-2);i>=b;i--)
            {
                mat[i][d-1]=z++;
            }
            for(int j=(d-2);j>a;j--)
            {
                mat[b][j]=z++;
            }
            a++;
            b++;
            c--;
            d--;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
        int t[][]=new int[n][n];
        int r[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                t[i][j]=mat[j][i];
            }
        }
        int k=0;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<n;j++)
            {
                r[i][j]=mat[k][j];
            }
            k++;
        }        
        System.out.println("Matrix after rotation");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(r[i][j]+"\t");
            }
            System.out.println();
        }                
    }
}
