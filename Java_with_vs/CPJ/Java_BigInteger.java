import java.util.*;
import java.math.*;


public class Java_BigInteger
{

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc=new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger sum = a.add(b);
        BigInteger prod = a.multiply(b);
        System.out.println(sum);
        System.out.println(prod);

        sc.close();
    }
}