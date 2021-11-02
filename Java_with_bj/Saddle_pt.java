/**
 * Name: Sambit Sarkar
 * Class: 12  
 * Section: Science A
 * Roll number: 40
 * UID Number: 6843968
 */
import java.util.*;//Importing scanner class
class Saddle_pt
{//Starting class
    int m;//Declaring instance variable
    public static void main()
    {//Starting main method
        Saddle_pt obj=new Saddle_pt();//Creating object
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        obj.m=sc.nextInt();//Taking user input of size of the matrix
        int n=obj.m;
        int a[][]=new int[n][n];
        int f=0;
        for(int i=0;i<n;i++)//Loop 1 to take input of the matrix
        {
            System.out.println("Enter the "+(i+1)+"th row of the matrix");
            for(int j=0;j<n;j++)//Loop 2 to take input of the matrix
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            int x=obj.minArr(a,i);//Calling method to find the minimum element of the row
            if(obj.maxArr(a,x))//Calling method to check if the element is maximum of the column
            {
                System.out.println("Saddle point - "+a[i][x]+" ("+i+","+x+")");
                f=1;
            }
        }
        if (f==0)//Checking if no Saddle point found
        System.out.println("No Saddle Point found");
    }//End of main method
    int minArr(int ar[][], int b)//Method to find the minimum element of the row
    {
        int min=0;
        for(int i=0;i<m;i++)
        {
            if(ar[b][i]<ar[b][min])
            min=i;
        }
        return min;
    }
    boolean maxArr(int arr[][], int c)//Method to check if c is maximum element of the column
    {
        int max=c;
        for(int j=0;j<m;j++)
        {
            if(arr[j][c]>arr[max][c])
            max=j;
        }
        if(max==c)
        return true;
        else
        return false;        
    }
}//End of class

        