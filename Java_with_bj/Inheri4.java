class one
{
    public int a,b;
    void input(int x,int y)
    {
        a=x;
        b=y;
    }
}
class two extends one
{
    int s;
    void add()
    {
        s=a+b;
    }
}
class three extends one
{
    int s1;
    three(int p)
    {
        s1=p;
    }
}
class four extends two
{
    three bb=new three(9);
    int total;
    void sum()
    {
        total=bb.s1+s;
    }
}
public class Inheri4
{
    public static void main()
    {
        four obj=new four();
        obj.input(9,5);
        obj.add();
        obj.sum();
        System.out.println("Total is = "+obj.total);
    }
}