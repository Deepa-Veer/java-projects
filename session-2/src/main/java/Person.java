/*Assignment 1:
Create a simple Person class
Requirements:
Define a class named Person with following attributes
      1. String name
       2. int age
       3. String gender
Implement a constructor to initialize all these     attributes
Implement getters for all attributes(name, age, gender)
implement setters for only age

Add a method displayInfo() that prints out the person details in a readable format

Enhance your Person class to support constructor overloading
Requirements:
   Add additional constructor that takes name and age, with a default gender value ("NA")*/

public class Person{
    private String name;
    private int age;
    private String gender;

    public Person(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public Person(String name,int age){
        this.name=name;
        this.age=age;
        this.gender="NA";
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }
    public void setAge(int age){
        this.age=age;
    }

    public void displayInfo(){

        System.out.println("The person name is "+ name);
        System.out.println("The person age is "+age);
        System.out.println("The Person gender is "+gender);


    }
}