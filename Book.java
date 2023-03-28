import java.util.ArrayList;
import java.util.Scanner;


public class Book {                  //Book class cotains a book's price and id.
    int price;
    String id;

    Book(int price, String id) {
        this.price = price;
        this.id = id;
    }

    int getPrice() {return this.price;}
    String getId() {return this.id;}
}
