package Lab9.Q1;

public class LibraryDriver {
    public static void main(String[] args) {

        LibraryItem[] items= new LibraryItem[5];
        
        items[0]= new Book("Book", "B001", "J.K. Rowling", "Harry Potter and the Sorcerer's Stone", 281);
        items[1]= new CD("CD", "C001", "The Beatles", "Abbey Road", 8);
        items[2]= new Book("Book", "B002", "Dr. Suess", "Cat in the hat", 328);
        

        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                System.out.println(items[i].toString());
                System.out.println("Calculating Price:");
                ((LoanItem) items[i]).calculatePrice();
                System.out.println();
            }
        }
    }
}
