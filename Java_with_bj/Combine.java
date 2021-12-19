/**
 * Name: Sambit Sarkar
 * Class: 12  
 * Section: Science A
 * Roll number: 40
 * UID Number: 6843968
 */
import java.util.*;//Importing Scanner class
class Combine
{//Starting class
    int c[];//Instance variables
    int s;
    Combine(int n)
    {//Parameterised constructor
        s=n;
        c=new int[s];
    }
    public void input_array()
    {//Method to take user input of array elements
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<s;i++)//Loop to take user input
        c[i]=sc.nextInt();
        sc.close();
    }
    public void sort()
    {//Method to sort array elements in ascending order
        for(int i=0;i<c.length-1;i++)
        {
            int b=i;
            for(int j=b+1;j<c.length;j++)
            {
                if(c[b]>c[j])
                b=j;
            }
            int t=c[i];//Interchanging the elements
            c[i]=c[b];
            c[b]=t;
        }
    }
    public void mix(Combine A,Combine B)
    {//Method to combine and print the two arrays merged together
        int co=0;
        System.out.println("The Merged Array");
        for(int i=0;i<A.s;i++)
        c[co++]=A.c[i];
        for(int i=0;i<B.s;i++)
        c[co++]=B.c[i];
        for(int i=0;i<c.length;i++)//Printing the combined array
        {
            System.out.print(c[i]+" ");
        }
        System.out.println();
    }
    public void display()
    {//Method to print the sorted array
        System.out.println("The Sorted Array");
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {//Starting main method
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of First array");
        int s1=sc.nextInt();//Input of the size of the first array
        Combine obj1=new Combine(s1);
        System.out.println("Enter the element of First array");
        obj1.input_array();//Input of the first array
        System.out.println("Enter the size of Second array");
        int s2=sc.nextInt();//Input of the size of the second array
        Combine obj2=new Combine(s2);
        System.out.println("Enter the element of Second array");
        obj2.input_array();//Input of the second array
        Combine obj3=new Combine(obj1.s+obj2.s);
        obj3.mix(obj1,obj2);//Calling mix method to combine both arrays
        obj3.sort();//sorting the array
        obj3.display();//printing the sorted array
        sc.close();
    }//End of main emthod
}//End of class 