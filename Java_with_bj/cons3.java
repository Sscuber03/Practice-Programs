public class cons3
{
    int x,y;
    cons3()
    {
        x=10;
        y=20;
    }
    cons3(int a,int b)
    {
        x=a;
        y=b;
    }
    public int calcu(cons3 bj)
    {
        int z=bj.x*x + bj.y*y;
        return z;
    }
    public void display(int p)
    {
        System.out.println(p);
    }
    public static void main(String args[])
    {
        cons3 ob1=new cons3();
        cons3 ob2=new cons3(5,10);
        int c=ob2.calcu(ob1);
        ob2.display(c);
    }
}
