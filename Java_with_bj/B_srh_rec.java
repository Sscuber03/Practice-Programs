/**
 * Name: Sambit Sarkar
 * Class: 12  
 * Section: Science A
 * Roll number: 40
 * UID Number: 6843968
 */
import java.util.*;//Importing Scanner class
class B_srh_rec
{//Starting class 
    int Bsearch(int a[],int l,int u,int n)
    {//Starting Function to search an element using binary search recursively
        if(l>u)
            return -1;//if lower index greater than upper index, element is not present
        int m=(l+u)/2;//Calculating the middle index
        if(a[m]==n)//Checing equality
            return m;
        else if(n>a[m])
            return Bsearch(a,m+1,u,n);//If number to be searched is greater than middle index number, move lower limit to m+1
        else
            return Bsearch(a,l,m-1,n);//If number to be searched is lesser than middle index number, move upper limit to m-1
    }

    public static void main()
    {//Starting main method
        B_srh_rec obj=new B_srh_rec();//Creating object
        Scanner sc=new Scanner(System.in);//Creating scanner class
        System.out.println("Enter the size of the array");
        int x=sc.nextInt();//Input of size of array
        int ar[]=new int[x];
        System.out.println("Enter the elements of the array in ascending order");
        for(int i=0;i<x;i++)//Loop to take user input of the array elements in ascending order
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int y=sc.nextInt();//Input of number to be searched
        int r=obj.Bsearch(ar,0,x,y);//Calling method to binary search
        if(r==y)
            System.out.println("The number is present in the array");//Output if number is found
        else
            System.out.println("The number is not present in the array");//Output if number is not found
    }//End of the main method
}//End of class
