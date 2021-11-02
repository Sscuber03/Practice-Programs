class one
{
    public int a;
    one(int x)
    {
        a=x;
    }
}
class two extends one
{
    int b,total;
    two(int y,int z)
    {
        super(y);
        b=z;
        total=0;
    }
    void sum()
    {
        total=a+b;
    }
}
public class Inheri6
{
    public static void main()
    {
        two obj=new two(10,20);
        obj.sum();
        System.out.println("Total is = "+obj.total);
    }
}
    
