class one
{
    public int a;
    void inpu(int x)
    {
        a=x;
    }
}
class two extends one
{
    int b;
    void inpu1(int y)
    {
        b=y;
    }
}
class three extends two
{
    int total;
    void sum()
    {
        total=a+b;
    }
}
public class Inheri2
{
    public static void main()
    {
        three obj=new three();
        obj.inpu(4);
        obj.inpu1(5);
        obj.sum();
        System.out.println("Total is = "+obj.total);
    }
}