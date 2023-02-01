/*
Cameron Doyle
This program tests all methods created in the shapes class,
ensuring that everything works correcly and as it should.
 */
import java.util.Scanner;
public class ShapesTest {
    public static void main (String[] args){
        Scanner scnr = new Scanner(System.in);
        Shapes Rectangle1 = new Shapes();       //Creates a new object called rectangle.
        Rectangle1.setShape("rectangle");       //Sets rectangle object to rectangle shape.
        Rectangle1.getPerimeter();              //Gets the perimeter of the rectangle after user enters sides and outputs it to screen.
        Rectangle1.getArea();           //Gets the area of the rectangle after user enters sides and ouputs it to screen.
        Rectangle1.addArea(scnr);           //Adds the area of a rectangle and another shape the user chooses, outputting it after.
        Shapes circle = new Shapes();//Creates a new object called rectangle.
        circle.setShape("circle");      //Sets object cirlce to shape circle.
        circle.getPerimeter();      //Gets the perimeter of the circle by user inputting the radius.
        circle.getArea();               //Gets the area of the circle after user inputs radius, and outputs to screen.
        circle.addArea(scnr);           //Adds the area of circle and another shape of choice.
        Shapes triangle = new Shapes();     //Creates new object triangle.
        triangle.setShape("triangle");      //Sets object triangle to shape triangle.
        triangle.getPerimeter();            //Gets perimeter of triangle after user enters side lengths and ouputs it.
        triangle.getArea();             //Gets the area of triangle after user enters base and height of triangle, outputting it.
        Shapes square = new Shapes();       //Creates new object called square.
        square.getPerimeter();          //Gets perimeter of square after user inputs side length and outputs it to screen.
        square.getArea();               //Gets area of square after user inputs side length and outputs it to user.
        Shapes trapezoid = new Shapes();    //Creates new object in shapes class called trapezoid.
        trapezoid.trapezoidPerimeter(scnr);     //Gets perimeter of trapezoid after user enters side length.
        Shapes notShape = new Shapes();     //Creates new object not shape.
        notShape.setShape("rhombus");       //Tests if error shape is entered.
        notShape.getPerimeter();

    }
}
