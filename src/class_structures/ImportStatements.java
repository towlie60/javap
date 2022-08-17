package class_structures;
// we are telling to bring a class from a different package.
import firstclass.HelloWorld;
import java.util.Random;


public class ImportStatements {

    public static void main(String[] args) {
        Random r = new Random();
        // put a bound number. ex: 10 means you want a random number from 0 to 10
        System.out.print(r.nextInt(100));

    }
}

        //printout numbers with and without any double quote.
       // System.out.println(10.34343);

       //  A way to print out random numbers.



