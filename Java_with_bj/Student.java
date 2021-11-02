/**
 * Name: Sambit Sarkar
 * Class: 12  
 * Section: Science A
 * Roll number: 40
 * UID Number: 6843968
 */
import java.util.*;//Importing scanner class
class Student
{//Starting base class
    String name;//Initialising instance variables
    String DOB;
    int roll;
    void getData()//Method to take user input of details of the student
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name of the Student, Dob (dd/mm/yyyy), and his/her roll number");
        name=sc.nextLine();
        DOB=sc.nextLine();
        roll=sc.nextInt();
    }
    void display()//Method to print student details
    {
        System.out.println(name);
        System.out.println(DOB);
        System.out.println(roll);
    }
}//End of base class