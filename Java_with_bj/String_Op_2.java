import java.util.*;//Importing Scanner class
class String_Op_2
{
    String txt;//Variable to store user inputed sentence
    String n[]=new String[50];//Initialising array to store each word of the array
    void readString()//Method to take user input of the sentence to sort
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentence ending with fullstop");
        txt=sc.nextLine();
    }

    char caseConvert(char ch)//Method to convert the case of the argument 
    {
        if(ch>=65&&ch<=90)
            ch+=32;
        else if(ch>=97&&ch<=122)
            ch-=32;
        return ch;
    }

    String sort(String s)//Method to store each word of the inputed sentence int the array and sort the words in it
    {
        StringTokenizer ss=new StringTokenizer(s);
        int c=0;
        String copy[]=new String[50];
        while(ss.hasMoreTokens())
        {
            String q=ss.nextToken();
            n[c]=q;
            copy[c]=q;
            c++;
        }
        for(int i=0;i<c;i++)
        {
            copy[i]=copy[i].toUpperCase();
        }
        for(int i=0;i<c;i++)//Array sorting loops
        {
            for(int j=0;j<c-1-i;j++)
            {
                if(copy[j].compareTo(copy[j+1])>0)
                {
                    String x=n[j];
                    n[j]=n[j+1];
                    n[j+1]=x;
                    x=copy[j];
                    copy[j]=copy[j+1];
                    copy[j+1]=x;
                }
            }
        }
        String tx="";
        for(int i=0;i<c;i++)
        {
            tx+=n[i]+" ";
        }
            tx=tx.substring(0,s.length())+" ";
            return tx;//returning the sorted String
    }
    void display(String text)//Method to display the unsorted, sorted and case converted sentence
    {
        System.out.println("Original sentence= "+txt);
        text=sort(text);
        System.out.println("Sentence after sorting= "+text);
        String t2="";
        for(int i=0;i<text.length();i++)//Loop to convert the case of the sentence
        {
            char a=text.charAt(i);
            a= caseConvert(a);
            t2+=a;
        }
        System.out.println("Sentence after being sorted and case converted= "+t2);
    }
    public static void main()
    {//Starting main
        String_Op_2 obj=new String_Op_2();
        obj.readString();
        obj.display(obj.txt);
    }//End of main
}//End of class
