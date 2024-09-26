public class Student extends PersonClass{
    char grade;

    @Override
    public void display() {
       System.out.println("A Student name is : "+name);
       System.out.println("A Student age is : "+age);
       System.out.println("A Student grade is :"+grade);
    }
}