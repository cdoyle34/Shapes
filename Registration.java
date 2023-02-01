/*
Cameron Doyle
This program creates variables and uses methods to input all
information regarding a class including what the class is, where it
is, what days it is on, and more. This program then has methods to output
to the screen the overall synopsis of what classes were created.
 */

import java.util.Scanner;
public class Registration {
    private String professor;
    private String department;
    private int classNumber;
    private String startTime;       //Creates class registration and all field variables.
    private String endTime;
    private String daysOfWeek;
    private int roomNumber;
    private String building;

    public Registration(){
        professor = "unknown";
        department = "unknown";
        classNumber = 0;
        startTime = "unknown";          //Sets all field variables to default values.
        endTime = "unknown";
        daysOfWeek = "unknown";
        roomNumber = 0;
        building = "unknown";

    }
    public Registration (String typeProfessor, String typeDepartment, int typeClassNumber, String start, String end, String days, int room, String typeBuilding){
        professor = typeProfessor;
        department = typeDepartment;
        classNumber = typeClassNumber;
        startTime = start;
        endTime = end;
        daysOfWeek = days;                  //Overloaded constructor setting all field variable values to above method arguments.
        roomNumber = room;
        building = typeBuilding;
    }
    public void setProfessor(String typeProfessor){         //All set and get methods for each field variable to enter in.
        professor = typeProfessor;
    }
    public void setDepartment(String typeDepartment){
        department = typeDepartment;
    }
    public void setClassNumber(int typeClassNumber){
        classNumber = typeClassNumber;
    }
    public void setstartTime(String start){
        startTime = start;
    }
    public void setendTime(String end){
        endTime = end;
    }
    public void setdaysOfWeek(String days){
        daysOfWeek = days;
    }
    public void setroomNumber(int room){
        roomNumber = room;
    }
    public void setbuilding(String typeBuilding){
        building = typeBuilding;
    }
    public String getProfessor(){
        return professor;
    }
    public String getDepartment(){
        return department;
    }
    public int getClassNumber(){
        return classNumber;
    }
    public String getStartTime(){
        return startTime;
    }
    public String getEndTime(){
        return endTime;
    }
    public String getdaysOfWeek(){
        return daysOfWeek;
    }
    public int getRoomNumber(){
        return roomNumber;
    }
    public String getBuilding(){
        return building;
    }

    public void printWFUinfo(){         //Prints out information regarding the class using all field variables.
        System.out.println(department + " " + classNumber + " is taught by Professor " + professor + " on " + daysOfWeek + " from " + startTime + " to " + endTime + " in " + building + " " + roomNumber);
    }
    public void roomUpdate(String newBuildingPerm, int newRoomPerm){
        roomNumber = newRoomPerm;                       //Updates building and room number to a new building and room number.
        building = newBuildingPerm;
    }
    public void roomAlert(String newBuilding, int newRoom){
        System.out.println("Alert! Your class " + department + " " + classNumber + " is no longer being taught at " + building + " " + roomNumber + " but has now been moved to " + newBuilding + " " + newRoom);
    }                               //Alerts user using field variables that a class has been moved to a new location.

    public void professorAlert(String newProfessor){        //Alerts the user using field variables that there is a new professor for a certain class.
        System.out.println("This is a notification to let you know that " + department + " " + classNumber + " is no longer being taught by Professor " + professor + " and is now being taught by Professor " + newProfessor);
    }

    public void timeChange(String newStartTime, String newEndTime){     //EXTRA METHOD: Alerts user that there has been a time change for a certain class.
        System.out.println("This is a notification to let you know that your class " + department + " " +  classNumber + " has been moved from " + startTime + "-" + endTime + " to " + newStartTime + "-" + newEndTime);
    }

    public void exitClass(){        //EXTRA METHOD: Exits out of a class of the users choosing
        System.out.println("Hello, your class " + department + " " + classNumber + " has been taken out of your schedule.");
    }

    public static void main(String[] args){
        Scanner scnr = new Scanner (System.in);
        Registration class1 = new Registration();

    }
}
