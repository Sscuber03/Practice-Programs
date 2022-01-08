/**
 * Name: Sambit Sarkar
 * Class: 12  
 * Section: Science A
 * Roll number: 40
 * UID Number: 6843968
 */
import java.util.*;//Importing scanner class
class Vertical
{//Starting class
    int c,l;//Initialising instance variables
    String s,w,p;
    String a[];
    Vertical(String ss)//Parameterised constructor
    {
        s=ss;
        p=ss.toUpperCase();//Converrting the inputed sentence to upper case
        c=0;
        l=0;
        w="";
    }

    void size()//Method to count the number of words in the given sentence
    {
        int f=0; 
        for(int i=0;i<s.length();i++)
        {
            if((p.charAt(i)<65 || p.charAt(i)>90) && (p.charAt(i)<'0' || p.charAt(i)>'9'))//Checking if the character is alphabet/number or not
            {
                c++;//Counting the number of words
                if(f>l)//Finding the maximum size of a single word in the sentence
                {
                    l=f;
                    f=0;
                }
            }
            else
                f++;
        }
    }

    void wrdext()//Method to extract the different words to an array
    {
        int co=0;
        for(int i=0;i<s.length();i++)
        {
            if((p.charAt(i)<65 || p.charAt(i)>90) && (p.charAt(i)<'0' || p.charAt(i)>'9'))//Checking if the character is alphabet/number or not
            {
                a[co]=w;
                co++;
                w="";
            }
            else
            {
                w=w+s.charAt(i);
            }
        }
    }

    void display()//Method to print out the sentence with each word in vertical position
    {
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[j].length()>i)
                    System.out.print(Character.toUpperCase(a[j].charAt(i))+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    void chk()//Method to check if consecutive words end with the same letter, and print them out
    {
        System.out.print("Consecutive words ending with the same letter: ");
        char x,y;
        int f=0;
        for(int i=0;i<c-1;i++)
        {
            x=Character.toUpperCase(a[i].charAt(a[i].length()-1));//Storing the last character of a word
            y=Character.toUpperCase(a[i+1].charAt(a[i+1].length()-1));//Storing the last character of the next word 
            if(x==y)//Checking if the last characters are equal or not
            {
                System.out.print(a[i]+","+a[i+1]+"   ");
                f++;
            }
        }
        if(f==0)
        System.out.println("None");
    }

    public static void main()
    {//Starting main method
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s1=sc.nextLine();//Taking user input of a sentence
        Vertical obj=new Vertical(s1);//creating object with the inputed sentence as the parameter
        obj.size();//Calling method to count the number of words and the maximum length of a word
        obj.a=new String[obj.c];//Initialising the array 'a' with the size of the number of words
        obj.wrdext();//Calling method to extract the words in the array as elements
        obj.display();//Calling method to display the words in a vertical manner
        obj.chk();//Calling method to check if two consecutive words are ending with the same letter/number
        sc.close();
    }//End of main method
}//End of class
