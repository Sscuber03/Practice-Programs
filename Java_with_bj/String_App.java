import java.util.*;//Importing Scanner class
class String_App
{//Starting class
    String txt;//Declaring instance variables
    void read_String()//Method to accept user input of a string
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String of maximum length of 100 characters");
        txt=sc.nextLine();
        sc.close();
    }
    char case_Convert(int n)//Method to convert the letter according to the conditions
    {
        if (n>=65 && n<90)
        n+=33;
        else if(n>97 && n<=122)
        n-=33;
        else if(n==90)
        n+=7;
        else if(n==97)
        n-=7;
        return (char)n;
    }
    void circular_Decode()
    {
        System.out.println("Original inputed String");
        System.out.println(txt);//Printing out original String inputed by the user
        String de="";//Variable to store decoded String
        int l=txt.length();//Variable to store the length og the inputed String
        for(int i=0;i<l;i++)//Loop to convert the characters as per the conditions given
        {
           char a=txt.charAt(i);
           int x=a;
           int y=case_Convert(x);
           a=(char)y;
           de+=a;
        }
        System.out.println("Decodec String");
        System.out.println(de);//Printing out decoded String
    }
    public static void main()
    { //Starting of main
        String_App obj=new String_App();//Creting object
        obj.read_String();//Calling method to accept String from the user
        obj.circular_Decode();//Calling method to decode the inputed String
    }//End of main
}//End of class
