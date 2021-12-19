import java.util.Scanner;
class age_
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter DOB in ddmmyyyy format");
        int d=sc.nextInt();
        System.out.println("Enter the current date in ddmmyyyy format");
        int c=sc.nextInt();
        int by=d%10000;
        d/=10000;
        int bm=d%100;
        int bd=d/100;
        int cy=c%10000;
        c/=10000;
        int cm=c%100;
        int cd=c/100;
        int day=0;
        int month=0;
        int year=0;
        if(cd<bd)
        {
            cd+=30;
            cm--;
        }
        day=cd-bd;
        if(cm<bm)
        {
            cm+=12;
            cy--;
        }
        month=cm-bm;
        year=cy-by;
        System.out.println(year+" years "+month+" months "+day+" days");
        sc.close();
    }
}