package Lab9.Q1;

public class Book extends LibraryItem implements LoanItem {
    private String author;
    private String title;
    private int numPages;
    
    public Book(String type, String ID, String author, String title, int numPages) {
        super(type, ID);
        this.author = author;
        this.title = title;
        this.numPages = numPages;
    }

    @Override
    //Calculate price based on number of pages
    public void calculatePrice() {
        double price = 0.0;

        if (numPages < 100) {
            price = 5.0;
        } else if (numPages <= 300) {
            price = 8.0;
        } else {
            price = 11.0;
        }

        System.out.println("The price of the book \"" + title + "\" by " + author + " is: $" + price);
    }

    @Override
    public String toString() {
        return super.toString() + ", Author: " + author + ", Title: " + title + ", Pages: " + numPages;
    }
}
