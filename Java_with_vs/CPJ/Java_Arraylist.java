package CPJ;

import java.util.*;

public class Java_Arraylist
{   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<List<Integer>> AL = new ArrayList<List<Integer>>();
        for(int i=0;i<n;i++)
        {
            int m=sc.nextInt();
            List<Integer> AL1 = new ArrayList<Integer>();
            for(int j=0;j<m;j++)
            {
                int x=sc.nextInt();
                AL1.add(x);
            }
            AL.add(AL1);
        }
        int q=sc.nextInt();
        while(q-- > 0)
        {
            int i=sc.nextInt();
            int j=sc.nextInt();
            try
            {
                System.out.println(AL.get(i-1).get(j-1));
            }
            catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}