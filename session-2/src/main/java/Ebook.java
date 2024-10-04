public class Ebook extends Book {

    private double filesize;

    Ebook(String title, String author, double price, int publicationYear) {
        super(title, author, price, publicationYear);
    }

    public void setFilesize(double filesize) {
        this.filesize = filesize;
    }

    public double getFilesize() {
        return filesize;
    }

    public void displayInfo(){
        System.out.println("Title of the Book is  "+getTitle());
        System.out.println("Author of the Book is "+getAuthor());
        System.out.println("Price of the Book is "+getPrice());
        System.out.println("Publication year of the book is "+getPublicationYear());
        System.out.println("Size of the book is "+filesize+ "MB");
    }
    public void discountedPrice(double discountPercentage) {
        double discountPer = discountPercentage + 10.0; // Additional 10% discount
        double discountValue = getPrice()-getPrice() * (discountPer / 100);
        System.out.println("Discounted value of the book is "+ discountValue);

    }

    public void read() {
        System.out.println("Ebook "+getTitle());
    }


    public String getSummary() {
        return ("Title of the Ebook is - "+getTitle()+" author of this book is - "+getAuthor()+". It was Published in the year - "+getPublicationYear()+" and the price of the book is - "+getPrice());
    }
}