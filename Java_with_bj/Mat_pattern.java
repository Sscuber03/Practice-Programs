/**
 * Name: Sambit Sarkar
 * Class: 12  
 * Section: Science A
 * Roll number: 40
 * UID Number: 6843968
 */
import java.util.*;//Importing scanner class
class Mat_pattern
{//Starting class
    public static void main()
    {//Starting main method
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order of matrix");
        int n=sc.nextInt();//Input of the order of the matrix
        System.out.println("Enter the first element");
        char c1=sc.next().charAt(0);//Input of the first element
        System.out.println("Enter the second element");
        char c2=sc.next().charAt(0);//Input of the second element
        System.out.println("Enter the third element");
        char c3=sc.next().charAt(0);//Input of the third element
        char a[][]=new char[n][n];//Initialising the array with the order
        for(int i=0;i<n;i++)//Loop 1 to put the variables in the matrix according to the given pattern
        {
            for(int j=0;j<n;j++)//Loop 2 to put the variables in the matrix according to the given pattern
            {
                if((i==0||i==n-1)&&(j!=0&&j!=n-1))
                {
                    a[i][j]=c1;
                }
                else if((j==0||j==n-1)&&(i!=0&&i!=n-1))
                {
                    a[i][j]=c2;
                }
                else
                    a[i][j]=c3;
            }
        }
        for(int i=0;i<n;i++)//Loop 1 to print out the matrix pattern
        {
            for(int j=0;j<n;j++)//Loop 2 to print out the matrix pattern
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }//End of main method
}//End of class