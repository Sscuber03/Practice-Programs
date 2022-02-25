package CPJ;

import java.math.*;
import java.util.*;

public class Java_Primality_Test {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        if(n.isProbablePrime(1))
        System.out.println("prime");
        else
        System.out.println("not prime");

        sc.close();
    }
}