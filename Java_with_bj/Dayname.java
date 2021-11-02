import java.util.*;
class Dayname
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String c[]={"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        String monthno="144025036146";
        int k=0,d=0,p=0,r;
        String n;
        System.out.println("Enter the date. DD/MM/YYYY");
        n=sc.nextLine();
        int dd=Integer.parseInt(n.substring(0,2));
        int mm=Integer.parseInt(n.substring(3,5));
        int yy=Integer.parseInt(n.substring(6));
        int y=yy-1900;
        int q=y/4;
        if(y%4==0&&mm==1||mm==2)
        q--;
        int mn=Character.getNumericValue(monthno.charAt(mm-1));
        int t=y+q+dd+mn;
        int rr=t%7;
        System.out.println(c[rr]);
    }
}
