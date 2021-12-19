import java.util.*;
class B_prog
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("M=");
        int m=sc.nextInt();
        System.out.print("\nN=");
        int n=sc.nextInt();
        if(m<2||m>=6||n<2||n>=6)
        {
            System.out.println("Wrong input");
        }
        else
        {
            int a[][]=new int[m][n];
            System.out.println("\nInput the matrix values");
            for(int i=0;i<m;i++)
            {
                System.out.println("Enter the "+(i+1)+"th row of the matrix");
                for(int j=0;j<n;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Original matrix A[][]\t");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
            int z=((2*m)+(2*n)-4);
            int b[]=new int[z];
            int c=0;
            int s=0;
            System.out.println("Boundary elements of matrix A[][]\t");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(i==0||i==(m-1)||j==0||j==(n-1))
                    {
                        b[c++]=a[i][j];
                        s+=a[i][j];
                        System.out.print(a[i][j]+"\t");
                    }
                    else
                        System.out.print("\t");
                }
                System.out.println();
            }
            System.out.println("Sum = "+s);
            for(int i=0;i<z;i++)
            {
                for(int j=0;j<z-i-1;j++)
                {
                    if(b[j] > b[j+1])
                    {
                        int t=b[j];
                        b[j]=b[j+1];
                        b[j+1]=t;
                    }
                }
            }
            int f[][]=new int[m][n];
            c=0;
            for(int j=0;j<n;j++)
            {
                f[0][j]=b[c++];
            }
            for(int i=1;i<m;i++)
            {
                f[i][n-1]=b[c++];
            }
            for(int j=n-2;j>=0;j--)
            {
                f[m-1][j]=b[c++];
            }
            for(int i=m-2;i>0;i--)
            {
                f[i][0]=b[c++];
            }
            System.out.println("Boundary sorted matrix ");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(i==0||i==(m-1)||j==0||j==(n-1))
                    {
                        System.out.print(f[i][j]+"\t");
                    }
                    else 
                    {
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

