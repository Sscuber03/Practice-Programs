import java.util.*;
public class test
{
    public static void main(String args[])
    {
        //Integer  int these are all integer values
        //Double double  these are all the values that contain a decimal in it
        //Character char only one character
        //String String multiple characters
        //Boolean boolean   true, false
        // int a = 10; // Assignment operator '='
        // String s = "you"; //to represent a string, we use double quotes
        // char c = 'c';
        // double d = 4.325;// '+' '-' '*' '/' '%'
        // boolean b = false;
        // //logical operator and,or,not    &&,||,!
         Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println(a/n);
        //double d = sc.nextDouble();
        //char c = sc.next().charAt(0);          abcddihjfbviaojebfvg defg hhgi
        //String s = sc.next();
        //String ss = sc.nextLine();
        // int x = 10;
        // int y = 2;
        // double aa = x/y;      Implicit Type Conversion
        // int xx = (int)aa;     Explicit Type Conversion

        System.out.println("Enter a choice of 1 or 2 or 3");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Input of 1");
            System.out.println("hello");
            break;
            case 2:
            System.out.println("Input of 2");
            break;
            case 3:
            System.out.println("Input of 3");
            break;
            default:
            System.out.println("Wrong choice!!");
        }


        sc.close();
    }
}