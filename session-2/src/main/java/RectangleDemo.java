public class RectangleDemo {

    public static void main(String[] args) {

        Rectangle rectangle1= new Rectangle();
        System.out.println("Constructor with no parameters");//Constructor with no parameters
        rectangle1.length=1;
        rectangle1.width=1;
        System.out.println("Area of the rectangle is "+rectangle1.area());//Area of the rectangle is 1.0
        System.out.println("Perimeter of the rectangle is  "+rectangle1.perimeter());//Perimeter of the rectangle is  4.0
        rectangle1.display();

        System.out.println("...............");

        Rectangle rectangle2= new Rectangle(3);

        System.out.println("Constructor with one parameter");//Constructor with one parameter

        System.out.println("Area of the rectangle is "+rectangle2.area());//Area of the rectangle is 9.0
        System.out.println("Perimeter of the rectangle is  "+rectangle2.perimeter());//Perimeter of the rectangle is  12.0
        rectangle2.display();

        System.out.println("............");

        Rectangle rectangle3= new Rectangle(3,5);
        System.out.println("Constructor with two parameters");//Constructor with two parameters

        System.out.println("Area of the rectangle is "+rectangle3.area());//Area of the rectangle is 15.0
        System.out.println("Perimeter of the rectangle is  "+rectangle3.perimeter());//Area of the rectangle is 15.0
        rectangle3.display();

    }

}
