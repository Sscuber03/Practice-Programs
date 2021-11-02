//to find value of a to the power b
class Myprocess
{
    private int z,res;
    public Myprocess()
    {
        z=1;
    }
    int result(int m,int n)
    {
        if(n<=0)
        return z;
        else
        return m*result(m,n-1);
    }
    void readData(int a,int b)
    {
        res=result(a,b);
        System.out.println(res);
    }
    public static void main(int x,int y)
    {
        Myprocess obj=new Myprocess();
        obj.readData(x,y);
    }
}
