//Heirarchical
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
    int total;
    void sum()
    {
        total=a+b;
    }
}
class three extends one
{
   int sub;
   void min()
   {
       sub=a-b;
   }
}
public class Inheri5
{
    public static void main()
    {
        two obj=new two();
        three obj2=new three();
        obj.inpu(14,5);
        obj.sum();
        obj2.inpu(10,7);
        obj2.min();
        System.out.println("Total is = "+obj.total);
        System.out.println("Difference is = "+obj2.sub);
    }
}
