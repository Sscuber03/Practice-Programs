import java.util.*;//Importing Scanner class
class Valid_date
{ //Starting class
    public static void main()
    { //Starting main
        Scanner sc=new Scanner(System.in);
        int month[]={31,28,31,30,31,30,31,31,30,31,30,31};//Array to store number of days in the respective months of a year
        System.out.println("Enter the date in (ddmmyyyy) format");
        long n=sc.nextLong();//Taking user input of the date in long format
        int y=(int)n%10000;//Calculating and storing year
        n/=10000;
        int m=(int)n%100;//Calculating and storing month
        int d=(int)n/100;//Calculating and storing date
        if ((y%400==0||y%100!=0)&&(y%4==0))//Checking if leap year or not
        {
            month[1]=29;//If leap year, changing the number of days in February
        }
        if (m<1||m>12||d<1||d>month[m-1]||y<1||y>9999)//Checking if inputed date is valid or not
            System.out.println("Inputed date is not valid");//Printing output
        else
            System.out.println("Inputed date is a valid date");
        sc.close();
    }//End of main
}//End of class
