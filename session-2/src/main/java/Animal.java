/*Assignment 2 :
Create a class hierarchy to manage a zoo:

Create a base class Animal with a method sound().
Create subclasses like Dog, Cat, and Lion, which override the sound() method to print respective animal sounds (e.g., "Bark", "Meow", "Roar").

Tasks:
Write a test class that creates an array of Animal objects and store instances of Dog, Cat, and Lion.
Iterate over the array and call sound() on each object using polymorphism.*/

public class Animal {
    public void sound(){
        System.out.println("This is to display sound of the animal");
    }

}