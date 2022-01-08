import java.util.*;
class Gold_bach
{
    public boolean prime(int n)
    {
        int flag=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            return false;
        else
            return true;
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check if Gold Bach number or not");
        int n=sc.nextInt();
        Gold_bach obj=new Gold_bach();
        int f=0;
        if(n<=9||n>=50)
        {
            System.out.println("Invalid input. Number out of range");
        }
        else if(n%2!=0)
        {
            System.out.println("Invalid input. Number is odd");
        }
        else
        {
            for(int i=3;i<n;i+=2)
            {
                if(obj.prime(i))
                {
                    for(int j=i;j<n;j+=2)
                    {
                        if(obj.prime(j) && i+j==n)
                        {
                            if(f==0)
                            System.out.print("Prime pairs are: ");
                            System.out.print(i+","+j+"\t");
                            f++;
                        }
                    }
                }
            }
        }
        sc.close();
    }
}

            