/*Create a class named Book with the following attributes:
     - title (String)
     - author (String)
     - price (double)
     - publicationYear (int)

   - Include the following methods:
     - A constructor to initialize all attributes.
     - Getters and setters for each attribute.
     - A method displayInfo() that prints all book details.
     Implement a method discountedPrice(double discountPercentage) in the Book class that calculates the price after applying a discount.
   - Override this method in the EBook class to apply a different discount policy (e.g., 10% higher discount for eBooks).*/

public class Book implements Readable{
    private String title;
    private String author;
    private double price;
    private int publicationYear;

    Book(String title,String author,double price,int publicationYear){
        this.title=title;
        this.author=author;
        this.price=price;
        this.publicationYear=publicationYear;

    }
    public void read() {
        System.out.println("Book "+title);
    }


    public String getSummary() {
        return ("Title of the book is - "+ " "+title + "author of this book is - "+author+". It was Published in the year - "+publicationYear+" and the price of the book is - "+price);
    }

    public void setTitle(String title)
    {
        this.title=title;

    }

    public String getTitle() {
        return title;

    }

    public void setAuthor(String author){

        this.author=author;
    }

    public String getAuthor(){

        return author;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public double getPrice() {

        return price;
    }

    public void setPublicationYear(int publicationYear) {

        this.publicationYear = publicationYear;
    }

    public int getPublicationYear() {

        return publicationYear;
    }
    public void discountedPrice(double discountPercentage) {
        double discountvalue = price-price*(discountPercentage / 100);
        System.out.println("Discounted value of the book is "+ discountvalue);

    }

    public void displayInfo(){
        System.out.println("Title of the Book is  "+title);
        System.out.println("Author of the Book is "+author);
        System.out.println("Price of the Book is "+price);
        System.out.println("Publication year of the book is "+publicationYear);

    }




}