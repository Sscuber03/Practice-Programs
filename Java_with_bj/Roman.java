import java.util.*;
class Roman
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number between 1-3999");
        int a=sc.nextInt();
        String s="";
        String ar[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        while(a>0)
        {
            int m=a/1000;
            for(int i=1;i<=m;i++)
            {
                s=s+ar[0];
                a-=1000;
            }
            int c=a/100;
            if(c==9)
            {
                s=s+ar[1];
                a-=900;
            }
            else if(c==4)
            {
                s=s+ar[3];
                a-=400;
            }
            else 
            {
                if(c>=5)
                {
                    s=s+ar[2];
                    a-=500;
                    c-=5;
                }
                for(int i=1;i<=c;i++)
                {
                    s=s+ar[4];
                    a-=100;
                }
            }
            int x=a/10;
            if(x==9)
            {
                s=s+ar[5];
                a-=90;
            }
            else if(x==4)
            {
                s=s+ar[7];
                a-=40;
            }
            else
            {
                if(c>=5)
                {
                    s=s+ar[6];
                    a-=50;
                    x-=5;
                }
                for(int i=1;i<=x;i++)
                {
                    s=s+ar[8];
                    a-=10;
                }
            }
            if(a==9)
            {
                s=s+ar[9];
                a-=9;
            }
            else if(a==4)
            {
                s=s+ar[11];
                a-=4;
            }
            else
            {
                if(a>=5)
                {
                    s=s+ar[10];
                    a-=5;
                }
                int z=a;
                for(int i=1;i<=z;i++)
                {
                    s=s+ar[12];
                    a-=1;
                }
            }
        }
        System.out.println(s);
    }
}

                    