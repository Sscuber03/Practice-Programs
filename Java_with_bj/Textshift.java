/**
 * Name: Sambit Sarkar
 * Class: 12  
 * Section: Science A
 * Roll number: 40
 * UID Number: 6843968
 */
import java.util.*;//Importing scanner class
class Textshift
{//Starting class
    public static void main()
    {//Starting main method
        Scanner sc=new Scanner(System.in);
        System.out.print("CODED TEXT ");
        String s=sc.nextLine();//Taking user input of the coded text
        System.out.print("SHIFT: ");
        int n=sc.nextInt();//Taking user input of the shift value
        String res="";
        if(n<1||n>26)//Checking for invalid shift value
        {
            System.out.println("Invalid Shift value");
        }
        else if(s.length()>100)//Checking for invalid string length
        {
            System.out.println("Invalid Length of the code");
        }
        else
        {
            int y=81;
            int f=0;
            int c=1;
            for(int i=0;i<s.length();i++)
            {
                int t=s.charAt(i);
                t+=(n-1);//Changing the ASCII value according to the shift given
                if(t>90)//Checking if the ASCII value exceeds 90, i.e. goes beyond Z
                    t-=26;
                if(t==y&&f==y)//Checking for double Q for giving a space
                {
                    res=res.substring(0,(i-c));
                    res=res+" ";
                    c++;
                }
                else
                {
                    res=res+(char)t;
                }
                f=t;
            }
        }
        System.out.println("DECODED TEXT: "+res);//Printing out the decoded text
    }
}

