public class ConstructorOverloading {
     String name;
     int age;
     int weight;


     ConstructorOverloading(){
        System.out.println("This is explicit constructor");
    }

     ConstructorOverloading(int value){
        age =value;
    }

     ConstructorOverloading(int value,int value1){
        age =value;
        weight =value1;
    }

     ConstructorOverloading(int value,String value1){
        name=value1;
        age=value;
    }
     ConstructorOverloading(String val,int value,int value1){
        name=val;
        age =value;
        weight =value1;
    }
    public void displayInfo(){
       System.out.println("Name of the person is "+name);
       System.out.println("Age of the person is "+age);
       System.out.println("Weight of the person is "+weight);
    }


}
