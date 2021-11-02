class one
{
    public int a,b;
    void inpu(int x,int y)
    {
        a=x;
        b=y;
    }
}
class two extends one
{
    int c;
    void sum()
    {
        c=a+b;
    }
}
public class Inheri1
{
    public static void main()
    {
        two obj=new two();
        obj.inpu(4,5);
        obj.sum();
        System.out.println("Total is = "+obj.c); 
    }
}
