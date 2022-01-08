import java.util.*;
class Spiral_uni
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=0,b=0,c=n,d=m;
        int mat[][] = new int[n][m];
        for(int z=1;z<=n*m;)
        {
            for(int i=a;i<c && z<=n*m;i++)
            {
                mat[i][a]=z++;
            }
            for(int j=b+1;j<d && z<=n*m;j++)
            {
                mat[c-1][j]=z++;
            }
            for(int i=(c-2);i>=b && z<=n*m;i--)
            {
                mat[i][d-1]=z++;
            }
            for(int j=(d-2);j>a && z<=n*m;j--)
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
            for(int j=0;j<m;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
