import java.util.ArrayList;
import java.util.Scanner;


public class Purchase {              //Purchase class has a method to add a new book to an ArrayList

    Book B;
    Purchase (int year, int price, String id, ArrayList<Book> B1) {

        B = new Book(price, id);
        B1.add(B);
    }
}
