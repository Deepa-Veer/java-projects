public class PersonDemo {

    public static void main(String []args){

        Person person=new Person("Dhanish",29,"Male");

        person.getName();
        person.getAge();
        person.getGender();
        person.setAge(30);
        person.displayInfo();
        System.out.println(".....................");
        Person person1 = new Person ("Diya",35);

        person1.getName();
        person1.getAge();
        person1.getGender();
        person1.displayInfo();




    }
}