import java.io.*;
class File_binary
{
    public static void main(String args[])throws IOException 
    {
        byte[] m={1,2,3,4,5,6};
        try
        {
            FileOutputStream fo = new FileOutputStream("Test.bin",true);
            BufferedOutputStream bo = new BufferedOutputStream(fo);
            bo.write(m);
            bo.close();
        }
        catch(Exception e)
        {
            System.out.println("Wrong choice");
        }
    }
}
