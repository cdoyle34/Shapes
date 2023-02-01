/*
Cameron Doyle
This program tests all methods coded in the registration class,
ensuring that everything works correctly.
 */
import java.util.Scanner;

public class RegistrationTest {
    public static void main (String [] args){
        Scanner scnr = new Scanner(System.in);
        Registration class1 = new Registration();                   //Creates new object class1
        System.out.println("Welcome to registration for Spring 2020!");     //Prints out welcome to registration
        System.out.println();
        class1.setbuilding("WKDTWN");                           //Sets all field variables to what they were in example.
        class1.setClassNumber(111);
        class1.setDepartment("CSC");
        class1.setroomNumber(1617);
        class1.setProfessor("KuyKendall");
        class1.setdaysOfWeek("MW");
        class1.setstartTime("4:15PM");
        class1.setendTime("6PM");
        class1.printWFUinfo();                                      //Prints out all info field variables were set to above.
        class1.roomAlert("Online", 0000);           //Prints out room alert with new room that was shown in example(Onlie, 0000)
        class1.professorAlert("TBD");                       //Prints out professor change with TBD professor.
        class1.roomUpdate("Tribble", 123);      //Updates class building and room number permanently to a new building and room number.
        class1.printWFUinfo();                                              //Prints out new class building and room number.
        class1.timeChange("4:00PM", "5:45PM");      //Changes class time from original to new input.
        class1.exitClass();                                                 //Prints out exit message saying class has been exited.
        Registration class2 = new Registration();                           //Creates new object called class 2.
        class2.setClassNumber(153);                                         //Sets class 2 field variables to new inputs, leaving some out to ensure default variables print out correctly.
        class2.setDepartment("MST");
        class2.setProfessor("Oke");
        class2.setstartTime("8:00AM");
        Registration class3 = new Registration();                   //Creates new object class 3.
        class3.setbuilding("Kirby");                                //Sets class 3 field variables to inputs, leaving some leftover to once again ensure rest of default variables work.
        class3.setendTime("3:00PM");
        class3.setroomNumber(304);
        class3.setdaysOfWeek("MWF");
        System.out.println();
        System.out.println("Thank you for registering! Here is your summary: ");    //Prints out a thank you for registering
        System.out.println();                                                       //Prints out all information for classes that have been signed up for.
        class1.printWFUinfo();
        class2.printWFUinfo();
        class3.printWFUinfo();


    }
}
