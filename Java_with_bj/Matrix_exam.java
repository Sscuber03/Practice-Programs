import java.util.*;//Importing Scanner class
class Matrix_exam
{//Starting class
    static int a[][],n;//Declaring instance variables for the matrix and order of the matrix
    public void getData()//Method to accept user input
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the order of the Matrix :");
        n=sc.nextInt();//Taking user input of order of matrix1
        a=new int[n][n];//Initialising matrix of n by n order
        for(int i=0;i<n;i++)//Loop to accept user inputed values in the matrix 
        {
            System.out.println("Enter the elements in "+(i+1)+" row of the matrix");
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }

    public void display(int[][] b,int n)//Method to display inputed matrix using one iteratin statement
    { 
        System.out.println("Entered Matrix:");
        for(int i=0,j=0;i<n;)
        {
            System.out.print(b[i][j++]+"\t");
            if(j==n)
            {
                System.out.println();
                i++;
                j=0;
            }
        }
    }

    public void row_Wise_Sum(int[][] a,int n)//Method to calculate sum of the elements of each row of the matrix and print it out
    {
        int s=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                s+=a[i][j];
                if(j==(n-1))
                    System.out.println("Sum of elements of row "+(i+1)+" = "+s);
            }
            s=0;
        }
    }

    public static void right_uptriangle(int[][] a,int n)//Method to print the upper right triangle of the matrix 
    {
        System.out.println("Upper Right triangle: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j<i)
                    System.out.print("\t");
                else
                    System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static int max_2(int[][] a,int n)//Method to calculate the second maximum value in the matrix and return it
    {
        int m1=0;//Variable to store maximum value
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]>m1)
                    m1=a[i][j];
            }
        }
        int m2=0;//Variable to store second maximum value
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]>m2 && a[i][j]<m1)
                    m2=a[i][j];
            }
        }
        return m2;//Returning the second maximum number
    }

    public static void main()
    {//Starting main
        Matrix_exam mx=new Matrix_exam();
        mx.getData();
        mx.display(a,n);
        mx.row_Wise_Sum(a,n);
        mx.right_uptriangle(a,n);
        System.out.println("2nd maximum element in the Matrix is "+max_2(a,n));
    }//End of main
}//End of class