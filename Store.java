import java.util.ArrayList;
import java.util.Scanner;


public class Store{          //Store class generates id's for every input the user gives

    Sales S;
    ArrayList<Book> B1 = new ArrayList<>();    //it's the ArrayList for books
    int[] sold_year = new int[4000];           //an array which has the years when book was sold

    int[] Id_array = new int[4000];           //stores the year input which is given
                                              //the year when the book was bought
    int[][] sold = new int[4000][3];          //it is 2D array in which row gives the year for which we
                                              //have to calculate revenue and column gives the current, previous and 2 years before data

    void purchase(int year, int price){        //this function generates the id for every book which is bought by the store

        int temp = ++Id_array[year];

        String id = Integer.toString(temp);
        String Year = Integer.toString(year);

        String new_id = "";
        new_id = new_id + Year;

        while( id.length() < 6 ){
            id = "0"+id;
        }

        new_id += "-" + id;                 //the id for the book is created

        Purchase P = new Purchase(year, price, new_id, B1);     //now that book is stored in ArrayList with it's price and id
    }

    void sale(int year, String id){                 //this function contains a method which calls sales
        sold_year[year] = 1;                        //yand provides year and id which is given by user
        S = new Sales(year, id, B1, sold);
    }

    void print(){                            //this function calls the function print_sales
        S.print_sales(sold, sold_year);      //which prints the required output
    }
}
