class one
{
    public int a;
    one(int x)
    {
        a=x;
    }
}
class two
{
    int b;
    void inpu1(int y)
    {
        b=y;
    }
}
class three extends two
{
    one bb=new one(4);
    int total;
    void sum()
    {
        total=bb.a+b;
    }
}
public class Inheri3
{
    public static void main()
    {
        three obj=new three();
        obj.inpu1(5);
        obj.sum();
        System.out.println("Total is = "+obj.total);
    }
}
