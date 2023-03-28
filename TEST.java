import java.util.ArrayList;
import java.util.Scanner;


public class TEST{             //TEST class is the main class which takes input and calls the required functions

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        Store lib_store = new Store();     //creating a store named lib_store\

        while(true) {
            int y = sc.nextInt();         //taking input for books which are purchased by store
            int p = sc.nextInt();         //y is year of purchase and p is price

            if( y==0 && p==0 ){          //stop input when y and p are 0
                break;
            }
            lib_store.purchase(y,p);     //calling the purchase function which generates id for every book
        }

        while (true){
            int y = sc.nextInt();       //taking input for books which were sold by store
            String id = sc.next();      //y is the year of selling and id is the book id
            if( y==0 ){                 //stop input when y is 0
                break;
            }
            lib_store.sale(y,id);       //calling sale function which proceeds and prints the required output
        }

        lib_store.print();
        sc.close();                     //closes the procedure of taking input
    }
}
