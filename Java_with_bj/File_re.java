import java.io.*;
class File_re
{
    public static void main(String args[])throws IOException
    {
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        String s;
        FileReader std = new FileReader("Data.txt");
        BufferedReader mat = new BufferedReader(std);
        s=mat.readLine();
        System.out.print("Sentence is "+s);
        mat.close();
    }
}

        