import java.util.*;
class Freq_2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int z=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the "+(i+1)+"th number");
            a[i]=sc.nextInt();
        }
        System.out.println("Number\tFrequency");
        for(int j=0;j<n;j++)
        {
            int count=0,flag=0;
            for(int k=0;k<z;k++)
            {
                if(b[k]==a[j])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                b[z]=a[j];
                z++;
                for(int l=0;l<n;l++)
                {
                    if(a[j]==a[l])
                    count++;
                }
                System.out.println(a[j]+"\t"+count);
            }
        }
    }
}
