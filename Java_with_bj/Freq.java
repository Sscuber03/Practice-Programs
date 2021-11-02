import java.util.*;
class Freq
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        int cc=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the "+(i+1)+"th term of the array");
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            int counter=0;
            for(int k=j;k<n;k++)
            {
                if(a[j]==a[k])
                counter++;
            }
            int f=0;
            int flag=0;
            while(f<j)
            {
                if(b[f]==a[j])
                flag=1;
                f++;
            }
            if(flag==0)
            {
                b[cc]=a[j];
                c[cc]=counter;
                cc++;
            }
        }
        System.out.println("Numbers\tFrequency");
        for(int l=0;l<cc;l++)
        {
            System.out.println(b[l]+"\t"+c[l]);
        }
    }
}
