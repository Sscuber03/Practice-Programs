interface VolumeControl
{
    void increaseVolume();
    void decreaseVolume();
}
class Television implements VolumeControl
{
    public void increaseVolume()
    {
        System.out.println("Television's volume increased");
    }
    public void decreaseVolume()
    {
        System.out.println("Television's volume decreased");
    }
}
class Musicsystem implements VolumeControl
{
    public void increaseVolume()
    {
        System.out.println("Music System's volume increased");
    }
    public void decreaseVolume()
    {
        System.out.println("Music System's volume decreased");
    }
    public static void main()
    {
        Television T=new Television();
        T.increaseVolume();
        T.decreaseVolume();
        Musicsystem M=new Musicsystem();
        M.increaseVolume();
        M.decreaseVolume();
    }
}
