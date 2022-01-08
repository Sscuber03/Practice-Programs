/**
 * Name: Sambit Sarkar
 * Class: 12  
 * Section: Science A
 * Roll number: 40
 * UID Number: 6843968
 */
import java.util.*;//Importing scanner class
class Mixer
{//Starting class
    int arr[];//Initialising instance variables
    int n;
    Mixer(int nn)//Parameterised constructor
    {
        n=nn;
        arr=new int[n];
    }

    void accept()//Method to take user input of the sorted array elements
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements, Do not enter duplicate elewments");
        for(int i=0;i<n;i++)
        {           
            int x=sc.nextInt();
            if(i==0 || x>arr[i-1])//Checking if duplicate or lesser value has not been inputed
                arr[i]=x;
            else 
            {
                System.out.println("Do not enter duplicate or lesser value than the previous inputed value(s)... Re enter value");
                i--;
                continue;
            }
        }
        sc.close();
    }

    Mixer mix(Mixer A)//Method to mix two ascending arrays in ascending order
    {        
        int i=0,j=0,k=0;
        Mixer obj=new Mixer(this.n+A.n);
        for(int z=0;z<(this.n+A.n);z++)
        {
            if(this.arr[i]<A.arr[j])
            {
                obj.arr[k++]=this.arr[i++];
            }
            else if(this.arr[i]>A.arr[j])
            {
                obj.arr[k++]=A.arr[j++];
            }
            else
            {
                 obj.arr[k++]=this.arr[i++];
                 j++;
            }
            if(i==this.n || j==A.n)
            {
                break;
            }
        }
        for(;i<this.n;i++)
        obj.arr[k++]=arr[i];
        for(;j<A.n;j++)
        obj.arr[k++]=arr[j];
        obj.n=k;
        return obj;
    }
    void display()//Method to display the array elements
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main()
    {//Starting main method
        Scanner s=new Scanner(System.in);       
        System.out.println("Enter the size of the first array");
        int s1=s.nextInt();//Taking user input of the size of the first array
        Mixer ob1=new Mixer(s1);//Creating object with the size of the first array as the parameter
        ob1.accept();//Calling method to take user input of the array elements
        System.out.println("Enter the size of the second array");
        int s2=s.nextInt();//Taking user input of the size of the second array
        Mixer ob2=new Mixer(s2);//Creating object with the size of the second array as the parameter
        ob2.accept();//Calling method to take user input of the array elements
        Mixer ob3=new Mixer(s1+s2);//Creating object with the combined size of the two array as the parameter
        ob3=ob2.mix(ob1);//Calling the method to mix the two arrays in ascending order
        System.out.println("The first array");
        ob1.display();//Calling method to print out the first array
        System.out.println();
        System.out.println("The second array");
        ob2.display();//Calling method to print out the second array
        System.out.println();
        System.out.println("The resultant array");
        ob3.display();//Calling method to print out the resultant array
        s.close();
    }//End of main method
}//End of class