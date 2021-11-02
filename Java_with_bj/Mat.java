import java.util.*;
class Mat
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int l=sc.nextInt();
        int a[][]=new int[l][l];        
        for (int i=0;i<l;i++)
        {
            System.out.println("Enter the values of "+(i+1)+"th row");
            for (int j=0;j<l;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for (int m=0;m<l;m++)
        {
            for (int n=0;n<l;n++)
            {
                if(m==0||m==(l-1)||n==0||n==(l-1))
                {
                    System.out.print(a[m][n]+"\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}

                