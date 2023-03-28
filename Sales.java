import java.util.ArrayList;
import java.util.Scanner;


public class Sales{              //Sales class calculates the revenue and prints it in the required order

    double revenue;

    Sales(int year, String id, ArrayList<Book> B1, int[][] sold){       //it checks for the required id of the sold book
                                                                        //then takes its price from ArrayList and calculate the revenue
        for(int i=0 ; i < B1.size() ; i++){

            if ( id.equals(B1.get(i).id) ){

                revenue = 1.5*(B1.get(i).price);
                B1.remove(i);
                break;
            }
        }

        int y = Integer.parseInt(id.substring(0,4));

        if ( year == y ){                             //the revenue is stored in the particular block of the
            sold[year][0] += (int)revenue;            //2D array as it has calculated for 3 years
        }

        else if( year == y+1 ){
            sold[year][1] += (int)revenue;
        }

        else if(year == y+2){
            sold[year][2] += (int)revenue;
        }
    }

    void print_sales(int[][] sold, int[] sold_year){      //this function prints output in the required way

        for (int i=0 ; i<4000 ; i++){
            if( sold_year[i] == 1 ){
                System.out.println(i + " " + sold[i][0] + " " + sold[i][1] + " " + sold[i][2] );
            }
        }
    }
}
