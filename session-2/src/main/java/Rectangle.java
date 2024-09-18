/*Assignment 1: Class Creation
Objective: Create a simple class to model a Rectangle.

Define a class Rectangle with attributes length and width.
Implement methods to:
Calculate the area.
Calculate the perimeter.
Display the dimensions.
Submission: Write a main method to test your class.


Assignment 2: Overloading Constructors
Objective: Enhance the Rectangle class.

Add multiple constructors:
One that takes no parameters (defaults to length and width of 1).
One that takes one parameter (makes it a square).
One that takes two parameters (length and width).
Submission: Create instances using each constructor in the main method.*/

public class Rectangle {


    double length;
    double width;

    double area(){
        return length*width;

    }

    double perimeter() {

        return 2*(length+width);

    }

    void display() {
        System.out.println("The length of the rectangle is "+ length);
        System.out.println("The Width of the rectangle is  " + width);


    }

    public Rectangle() {

    }

    public Rectangle(int width) {
        this.width=width;
        this.length=width;


    }

    public Rectangle(int length,int width) {
        this.length=length;
        this.width=width;
    }





}
