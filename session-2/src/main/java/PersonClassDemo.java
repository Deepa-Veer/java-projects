public class PersonClassDemo {
    public static void main(String args[]){
        PersonClass personClass=new PersonClass();
        System.out.println("This is Person details");
        personClass.name="Shifa";
        personClass.age=43;
        personClass.display();
        System.out.println("................");
        Teacher teacher=new Teacher();
        System.out.println("This is Teacher details");
        teacher.name="Reema";
        teacher.age=32;
        teacher.subject="Maths";
        teacher.display();
        System.out.println("................");
        Student student=new Student();
        System.out.println("This is Student details");
        student.name="Veeren";
        student.age=14;
        student.grade='A';
        student.display();
    }
}