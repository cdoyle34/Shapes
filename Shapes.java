/*
Cameron Doyle
This program is used to set a shape (triangle, rectangle, circle, square)
and then find the perimeter, area, area of it and another area, or the
perimeter of a trapezoid. These functions are all using methods and then
arithmetically finding these values, printing them out to the user at the end.
 */

import java.util.Scanner;
public class Shapes {

    private String shape;
    private double perimeter;  //These set the field variables and original public class.
    private double area;

    public Shapes(){
        shape = "unknown";
        perimeter = 0;          //This is the default values assigned to the field variables.
        area = 0;
    }
    public Shapes(String typeShape){
        shape = typeShape;
        perimeter = 0;                  //This is used to assign typeShape to shape, allowing the user to assign a shape.
        area = 0;
    }
    public Shapes (String typeShape, double perimeterShape, double areaShape) {
        shape = typeShape;
        perimeter = perimeterShape;
        area = areaShape;                   //Overloaded method
    }
    public void setShape(String typeShape){
        shape = typeShape;                  //Set methods to assign object to a shape.
    }
    public String getShape(){
        return shape;
    }
    public double getPerimeter(){
      return perimeter;                 //Get methods to return perimeter, shape, area.
    }
    public double getArea(){
        return area;
    }

    public double setPerimeter(Scanner scnr){
        if (shape.equals("circle")) {                   //If equal statements used to establish what the shape entered is.
            double radius = 0;
            double perimeterCalcCircle = 0;
            System.out.println("What is the radius?");          //Arithmetic calculations of each shape using scnr inputs from the user.
            radius = scnr.nextDouble();
            perimeterCalcCircle = radius * 2 * 3.14;
            perimeter = perimeterCalcCircle;
            System.out.println(perimeter);                  //Prints out the perimeter of the shape to the screen.
        }
        else if (shape.equals("triangle")){
            double side1 = 0;
            double side2 = 0;
            double side3 = 0;
            double perimTriangle = 0;
            System.out.println("What is the first side length?");
            side1 = scnr.nextDouble();
            System.out.println("What is the second side length?");
            side2 = scnr.nextDouble();
            System.out.println("What is the third side length?");
            side3 = scnr.nextDouble();
            perimTriangle = side1 + side2 + side3;
            perimeter = perimTriangle;
            System.out.println(perimeter);
        }
        else if (shape.equals("square")){
            double perimSquare;
            double sideSquare;
            System.out.println("What is one sides length?");
            sideSquare = scnr.nextDouble();
            perimSquare = sideSquare * 4;
            perimeter = perimSquare;
            System.out.println(perimeter);
        }
        else if (shape.equals("rectangle")){
            double rectSide1;
            double rectSide2;
            double rectPerim = 0;
            System.out.println("What is one sides length?");
            rectSide1 = scnr.nextDouble();
            System.out.println("What is the other sides length?");
            rectSide2 = scnr.nextDouble();
            rectPerim = (rectSide1 * 2) + (rectSide2 * 2);
            perimeter = rectPerim;
            System.out.println(perimeter);
        }
        else{
            System.out.println("Error, you must set a valid shape.");       //If an invalid shape is entered, tells user they must restart.
            perimeter = 0;
        }

        return perimeter;
    }

    public double setArea(Scanner scnr){
        if (shape.equals("circle")){            //If equals statements used once again to assign shape entered to whatever calculations must be done.
            double radiusCirc = 0;
            double areaCalc = 0;                //Uses scnr inputs and arithmetic calculations to find the area of each shape.
            System.out.println("What is the radius?");
            radiusCirc = scnr.nextDouble();
            areaCalc = Math.pow(radiusCirc, 2) * 3.14;
            area = areaCalc;
            System.out.print("The area of the circle is " + area);
        }
        else if (shape.equals("triangle")){
            double base = 0;
            double height = 0;
            double areaTriangle = 0;
            System.out.println("What is the base?");
            base = scnr.nextDouble();
            System.out.println("What is the height?");
            height = scnr.nextDouble();
            areaTriangle = .5 * height * base;
            area = areaTriangle;
            System.out.println("The are of the triangle is " + area);

        }
        else if (shape.equals("square")){
            double sideSquare = 0;
            double areaSquare = 0;
            System.out.println("What is a sides length?");
            sideSquare = scnr.nextDouble();
            areaSquare = sideSquare * sideSquare;
            area = areaSquare;
            System.out.println("The are of the square is " + area);
        }
        else if (shape.equals("rectangle")){
            double side1Rect = 0;
            double side2Rect = 0;
            double areaRect = 0;
            System.out.println("What is the first sides length?");
            side1Rect = scnr.nextDouble();
            System.out.println("What is the second sides length?");
            side2Rect = scnr.nextDouble();
            areaRect = side1Rect * side2Rect;
            area = areaRect;
            System.out.println("The area of the rectangle is " + area);
        }
        else{
            System.out.println("Please enter a valid shape.");
            area = 0;
        }
        return area;
    }

    public double addArea(Scanner scnr) {               //EXTRA METHOD
        if (shape.equals("circle")){
            double radiusCirc = 0;              //Same idea as above, uses if equals to establisht the shape and then calculates area.
            double areaCalc = 0;
            System.out.println("What is the radius?");
            radiusCirc = scnr.nextDouble();
            areaCalc = Math.pow(radiusCirc, 2) * 3.14;
            area = areaCalc;
            System.out.print("The area of the circle is " + area);
        }
        else if (shape.equals("triangle")){
            double base = 0;
            double height = 0;
            double areaTriangle = 0;
            System.out.println("What is the base?");
            base = scnr.nextDouble();
            System.out.println("What is the height?");
            height = scnr.nextDouble();
            areaTriangle = .5 * height * base;
            area = areaTriangle;
            System.out.println("The are of the triangle is " + area);

        }
        else if (shape.equals("square")){
            double sideSquare = 0;
            double areaSquare = 0;
            System.out.println("What is a sides length?");
            sideSquare = scnr.nextDouble();
            areaSquare = sideSquare * sideSquare;
            area = areaSquare;
            System.out.println("The are of the square is " + area);
        }
        else if (shape.equals("rectangle")){
            double side1Rect = 0;
            double side2Rect = 0;
            double areaRect = 0;
            System.out.println("What is the first sides length?");
            side1Rect = scnr.nextDouble();
            System.out.println("What is the second sides length?");
            side2Rect = scnr.nextDouble();
            areaRect = side1Rect * side2Rect;
            area = areaRect;
            System.out.println("The area of the rectangle is " + area);
        }

        System.out.println("What is the second shape?");        //This allows for a second shapes area to be calculated, user inputs whatever shape.
        String secondshape;
        secondshape = scnr.next();
        double area2 = 0;

        if (secondshape.equals("circle")){
            double radiusCirc = 0;
            double areaCalc = 0;
            System.out.println("What is the radius?");          //Same idea but with second shape, if equals and calculations
            radiusCirc = scnr.nextDouble();
            areaCalc = Math.pow(radiusCirc, 2) * 3.14;
            area2 = areaCalc;
            System.out.println("The area of the circle is " + area2);
        }
        else if (secondshape.equals("triangle")){
            double base = 0;
            double height = 0;
            double areaTriangle = 0;
            System.out.println("What is the base?");
            base = scnr.nextDouble();
            System.out.println("What is the height?");
            height = scnr.nextDouble();
            areaTriangle = .5 * height * base;
            area2 = areaTriangle;
            System.out.println("The are of the triangle is " + area2);

        }
        else if (secondshape.equals("square")){
            double sideSquare = 0;
            double areaSquare = 0;
            System.out.println("What is a sides length?");
            sideSquare = scnr.nextDouble();
            areaSquare = sideSquare * sideSquare;
            area2 = areaSquare;
            System.out.println("The are of the square is " + area2);
        }
        else if (secondshape.equals("rectangle")){
            double side1Rect = 0;
            double side2Rect = 0;
            double areaRect = 0;
            System.out.println("What is the first sides length?");
            side1Rect = scnr.nextDouble();
            System.out.println("What is the second sides length?");
            side2Rect = scnr.nextDouble();
            areaRect = side1Rect * side2Rect;
            area2 = areaRect;
            System.out.println("The area of the rectangle is " + area2);
        }

        double totalArea;
        totalArea = area + area2;                                                   //Adds both areas together and prints out the total.
        System.out.println("The total area of the shapes is " + totalArea);



        return area;
    }

    public double trapezoidPerimeter(Scanner scnr){             //EXTRA METHOD
        double topBase = 0;
        double bottomBase = 0;
        double sidesTrap = 0;
        double perimTrap = 0;                                                   //Calculates the perimeter of a trapezoid by taking in both bases and a side as input.
        System.out.println("What is the top bases length (smaller base)?");
        topBase = scnr.nextDouble();
        System.out.println("What is the bottom bases length(longer base)?");
        bottomBase = scnr.nextDouble();
        System.out.println("What are one of the sides length?");
        sidesTrap = scnr.nextDouble();
        perimTrap = (sidesTrap * 2) + bottomBase + topBase;             //Calcluates the sides added together and prints out the answer.
        System.out.println("The perimeter of the trapezoid is " + perimTrap);
        return perimeter;
    }


    public static void main (String[] args){            //Main not used as all is tested in test file.
        Scanner scnr = new Scanner(System.in);


    }
}
