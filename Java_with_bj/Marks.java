/**
 * Name: Sambit Sarkar
 * Class: 12  
 * Section: Science A
 * Roll number: 40
 * UID Number: 6843968
 */
import java.util.*;//Importing scanner class
class Marks extends Student
{//Starting daughter class
    double tot;//Initialising instance varialbes
    double per;
    char gd;
    void readData()//Method to take user input of the marks
    {
        Scanner s=new Scanner(System.in);
        super.getData();//Calling super class to call the getData method of the base class
        System.out.println("Enter the total marks");
        tot=s.nextInt();//Taking user input of the total marks
        s.close();
    }
    void compute()//Method to calculate the grade according to the marks given
    {
        per=(tot/500)*100;
        if(per>=85)
        gd='A';
        else if(per>=60 && per<85)
        gd='B';
        else if(per>=40 && per<60)
        gd='C';
        else
        gd='D';
    }
    void showData()//Method to display marks details
    {
        super.display();//Calling super class to call the display method of the base class
        System.out.println("Total marks obtained = "+tot);
        System.out.println("Percentage marks "+per);
        System.out.println("Grade "+gd);
    }
    public static void main()
    {//Starting main method
        Marks obj=new Marks();//Creating object of this class
        obj.readData();//Calling Method to take user input of the marks
        obj.compute();//Calling method to calculate the grade according to the marks obtained
        obj.showData();//Calling method to display the marks and grade
    }//End of main method
}//End of daughter class
    