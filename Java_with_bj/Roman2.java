/**
 * Name: Sambit Sarkar
 * Class: 12  
 * Section: Science A
 * Roll number: 40
 * UID Number: 6843968
 */
import java.util.*;//Importing scanner class
class Roman2
{//Starting class
    public static void main()
    {//Starting main method
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number between 1-3999");
        int a=sc.nextInt();//Taking user input of the number to be converted
        String z[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};//Array to store the roman numerals
        int r[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};//Array to store the equivalent values
        int i=0;//Index of the array
        String s="";//String to store the final roman numeral
        if(a<1||a>3999)//Checking if the number inputed is out of range or not
        {
            System.out.println("The inputed number is out of range");
        }
        else
        {
            while(a>0)//While loop to run till the inputed number is zero
            {
                if(a>=r[i])//If bolck to calculate the roman numeral
                {
                    s=s+z[i];
                    a-=r[i];
                }
                else
                    i++;
            }
            System.out.println("The roman equivalent of the inputed number is "+s);//Printing out the numeral
        }
        sc.close();
    }//End of main method
}//End of class

