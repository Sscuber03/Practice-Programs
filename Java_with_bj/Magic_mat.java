import java.util.*;
class Magic_mat
{
    int change(int a,int s)
    {
        if(a==-1)
            a=s-1;
        else if(a==s)
            a=0;
        return a;
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Matrix");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int i=0;
        int j=((n-1)/2);
        int c=1;
        Magic_mat obj=new Magic_mat();
        if(n%2==0)
            System.out.println("Matrix not possible");
        else
        {
            while(c<(n*n))
            {
                if(c==1)
                {
                    a[i][j]=c;
                }
                if(c%n==0)
                {
                    i++;
                    i=obj.change(i,n);
                }
                else
                {
                    i--;
                    i=obj.change(i,n);
                    j++;
                    j=obj.change(j,n);
                }
                a[i][j]=c+++1;
            }
            for(int x=0;x<n;x++)
            {
                for(int y=0;y<n;y++)
                {
                    System.out.print(a[x][y]+"\t");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
