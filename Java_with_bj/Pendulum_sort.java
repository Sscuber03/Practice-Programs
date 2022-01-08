import java.util.*;//Importing Scanner class
class Pendulum_sort
{ //Starting class
    public static void main()
    {//Starting main
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();//Taking user input of number of elements
        int a[]=new int[n];//Initialising the array with n elements
        for(int i=0;i<n;i++)//Loop to take user input of the array elements
        {
            System.out.println("Enter the "+(i+1)+" th element of array");
            a[i]=sc.nextInt();
        }
        System.out.println("Original array");
        for(int i=0;i<n;i++)//Loop to print out original array
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for (int i=0;i<n;i++)//Loop to sort the array elements using bubble sort in descending order
        {
            for(int j=0;j<n-1-i;j++)
            {
                if (a[j]<a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        int b[]=new int[n];//Initialising array to store the pendulum sorted final array
        int m=(n-1)/2;
        for(int i=0;i<n;i++)//Loop to sort the array in pendulum order
        {
            b[m]=a[i];
            if(i%2==0)
            m+=(i+1);
            else
            m-=(i+1);
        }
        System.out.println("Sorted array");        
        for(int i=0;i<n;i++)//Loop to print out final sorted array
        {
            System.out.print(b[i]+" ");
        }
        sc.close();
    }//End of main
}//End of class

            