import java.io.*;
class File_op
{
    public static void main(String args[])throws IOException
    {
        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
        String s;
        FileWriter std=new FileWriter("Data.txt");
        BufferedWriter mat=new BufferedWriter(std);
        PrintWriter obj=new PrintWriter(mat);
        System.out.print("Input any sentence");
        s=inp.readLine();
        obj.println(s);
        obj.close();
        mat.close();
        std.close();
    }
}