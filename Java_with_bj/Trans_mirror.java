import java.util.*;//Importing Scanner class
class Trans_mirror
{ //Starting class
    public static void main()
    {//Starting main
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter order of matrix");
        int n=sc.nextInt();//Taking user input of order of matrix
        int a[][]=new int[n][n];//Initialising arrays with order n by n
        int b[][]=new int[n][n];
        int c[][]=new int[n][n];
        for(int i=0;i<n;i++)//Taking user input of matrix elements
        {
            System.out.println("Enter the elements of the "+(i+1)+"th row of the array");
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original matrix");
        for(int i=0;i<n;i++)//Loop to print out original matrix
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)//Loop to generate transpose of the user inputed matrix
        {
            for(int j=0;j<n;j++)
            {
                b[j][i]=a[i][j];
            }
        }
        System.out.println("Array elememnts after Transposing is");
        for(int i=0;i<n;i++)//Loop to print out the Transposed matrix
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        int k=0;
        for(int i=0;i<n;i++)//Loop to generate the mirror image of the generated transpose of the user inputed matrix
        {
            for(int j=n-1;j>=0;j--)
            {
                c[i][j]=b[i][k++];
            }
            k=0;
        }
        System.out.println("Array elements after Transposing and Mirror image is");
        for(int i=0;i<n;i++)//Loop to print out the final matrix after transpose and mirror image
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }//End of main
}//End of class

