class Pattern3
{
    public static void main()
    {
        for(int i=1;i<=6;i++)
        {
            System.out.print("* ");
            for(int j=1;j<=4;j++)
            {
                if (i==1||i==6)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println();
        }
    }
}

    