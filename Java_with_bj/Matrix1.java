import java.util.*;
class Matrix1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order of the matrix");
        int n=sc.nextInt();
        char M[][]=new char[n][n];
        System.out.println("Enter the first character");
        char a1= sc.next().charAt(0);
        System.out.println("Enter the second character");
        char a2= sc.next().charAt(0);
        System.out.println("Enter the third character");
        char a3= sc.next().charAt(0);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i==0||i==(n-1)) && (j==0||j==(n-1)))
                {
                    M[i][j]=a1;
                }
                else if(i==0||j==0||i==(n-1)||j==(n-1))
                {
                    M[i][j]=a2;
                }
                else
                {
                    M[i][j]=a3;
                }
            }
        }
        for (int k=0;k<n;k++)
        {
            for(int l=0;l<n;l++)
            {
                System.out.print(M[k][l]+"\t");
            }
            System.out.println();
        }
    }
}
  