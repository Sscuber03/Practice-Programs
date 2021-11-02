/**
 * Name: Sambit Sarkar
 * Class: 12  
 * Section: Science A
 * Roll number: 40
 * UID Number: 6843968
 */
import java.util.*;//Importing scanner class
class Matrix
{//Starting class
    int arr[][];//Declaring instance variables
    int m;
    int n;
    Matrix(int mm, int nn)
    {//Parameterised constructor
        m=mm;
        n=nn;
        arr=new int[m][n];
    }

    void fillArray()//Method to take user input of the matrix elements
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the matrix elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }

    Matrix Add(Matrix A)//Method to add two matrices and return in object form
    {
        Matrix obj=new Matrix(m,n);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                obj.arr[i][j]=this.arr[i][j]+A.arr[i][j];
            }
        }
        return obj;
    }

    void display()//Printing out the matrix
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main()
    {//Starting the main method
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int a=s.nextInt();//Taking user input of the size of the matrices
        int b=s.nextInt();
        if(a>25 || b>25)//Checking if range is in range or not
            System.out.println("Size not in range");
        else
        {
            Matrix A=new Matrix(a,b);
            A.fillArray();//Calling method to take input of matrix elements
            System.out.println("First Matrix");
            A.display();//Calling method to display the matrix
            Matrix B=new Matrix(a,b);
            B.fillArray();//Calling method to take input of matrix elements
            System.out.println("Second Matrix");
            B.display();//Calling method to display the matrix
            Matrix C=new Matrix(a,b);//Creating new object to store added matrix
            C=B.Add(A);//Calling method to add the two inputed matrices
            System.out.println("The Sum of the Two Matices");
            C.display();//Calling method to print out the calculated matrix
        }
    }//End of main method
}//End of class

    