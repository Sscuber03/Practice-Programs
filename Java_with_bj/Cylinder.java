
class Cylinder
{
    void computeVolume(int height,int width,int thickness)
    {
        double r=width/(2*3.14);
        double rr=0.0;
        double volume=0.0;
        if(height<=0||width<=0||thickness<=0||r<=1)
        {
            System.out.println("Invalid input");
        }
        else
        {
            rr=r-thickness;
            volume=3.14*rr*rr*height;
            volume=Math.ceil(volume);
            System.out.println(volume);
        }
    }
}