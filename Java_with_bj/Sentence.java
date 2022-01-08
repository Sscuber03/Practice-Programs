/**
 * Name: Sambit Sarkar
 * Class: 12  
 * Section: Science A
 * Roll number: 40
 * UID Number: 6843968
 */
import java.util.*;//Importing scanner class
class Sentence
{//Starting class
    String a[];//Declaring instance variables
    char ar[];
    int v;
    Sentence()
    {//Default constructor
        ar=new char[5];
        a=new String[5];
        v=0;
    }
    int wrdct(String q)
    {//Method to count the number of words
        int ret=0;
        for(int i=0;i<q.length();i++)
        {
            char ca=q.charAt(i);
            if(ca=='.'  || ca==',' || ca=='!' || ca=='?' || ca==' ')
            {
                ret++;
            }
        }
        return ret;
    }
    void vowel(String b)
    {//Method to check if words are starting with a vowel
        int wr=wrdct(b);
        String x[]=new String[wr];
        int c=0;
        String w="";
        for(int i=0;i<b.length();i++)
        {
            char ch=b.charAt(i);
            if(ch=='.'  || ch==',' || ch=='!' || ch=='?' || ch==' ')//Differentiating words
            {
                if(w.charAt(0)=='A' || w.charAt(0)=='E' || w.charAt(0)=='I' || w.charAt(0)=='O' || w.charAt(0)=='U' || w.charAt(0)=='a' || w.charAt(0)=='e' || w.charAt(0)=='i' || w.charAt(0)=='o' || w.charAt(0)=='u')
                {//checking if words start with a vowel
                    int f=0;
                    for(int j=0;j<c;j++)
                    {
                        if(x[j].equalsIgnoreCase(w))
                        {
                            f=1;
                            break;
                        }
                    }
                    if(f==0)
                    {
                        x[c]=w;
                        c++;
                    }
                }
                w="";
            }
            else
            {
                w=w+ch;
            }
        }
        if(c>0)
        {
            System.out.println("Words starting with a vowel are: ");
            for(int i=0;i<c;i++)
            {
                System.out.print(x[i]+" ");
            }
        }
        else
        {
            System.out.println("There are no words starting with a vowel");
        }
    }
    void sep(String z)//Method to seperate the sentences
    {
        int co=z.length();
        String w="";
        for(int i=0;i<co;i++)
        {
            char cc=z.charAt(i);
            if(cc=='.'  || cc==',' || cc=='!' || cc=='?')
            {
                a[v]=w;
                ar[v]=cc;
                v++;
                w="";
            }
            else
            {
                w=w+cc;
            }
        }
    }
    void sort()//Method to sort each sentences individually
    {
        for(int i=0;i<v;i++)
        {
            String t=a[i];
            t=t+" ";
            int d=0;
            int wr=wrdct(t);
            String g[]=new String[wr];
            String ww="";
            for(int u=0;u<t.length();u++)
            {
                char cd=t.charAt(u);
                if(cd==' ')
                {
                    g[d]=ww;
                    d++;
                    ww="";
                }
                else
                {
                    ww=ww+cd;
                }
            }
            for(int j=0;j<d;j++)
            {
                for(int k=1;k<(d-j);k++)
                {
                    if(g[k-1].compareToIgnoreCase(g[k])>0)
                    {
                        String temp=g[k-1];
                        g[k-1]=g[k];
                        g[k]=temp;
                    }
                }
            }
            t="";
            for(int j=0;j<d;j++)
            {
                t=t+g[j]+" ";
            }
            a[i]=t;
        }
    }
    void display()//Method to display the sentences after sorting
    {
        System.out.println("The sentences after sorting");
        for(int i=0;i<v;i++)
        {
            System.out.print(a[i].substring(0,(a[i].length()-1)));
            System.out.print(ar[i]);
        }
    }
    public static void main()
    {//Starting amin method
        Sentence obj=new Sentence();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence(s)");
        String s=sc.nextLine();
        obj.vowel(s);
        obj.sep(s);
        obj.sort();
        obj.display();
        sc.close();
    }//End of main method
}//End of class