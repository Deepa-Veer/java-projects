public class TestMain {
    public static void main(String args[]){
        Book book=new Book("RICH DAD POOR DAD","Robert T.K",599.0,1997);
        book.setPrice(599.0);
        book.discountedPrice(20);
        book.displayInfo();
        book.read();
        System.out.println(book.getSummary());
        System.out.println("........");
        Ebook eBook=new Ebook("The Secret","Rhonda Byrne",492.0,2006);
        eBook.setFilesize(10.0);
        eBook.displayInfo();
        eBook.discountedPrice(30);
        eBook.read();
        System.out.println(eBook.getSummary());
    }
}