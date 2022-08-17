package input_from_user;


import java.util.Scanner;

/**
 * We want to ask the user (customer)
 * to enter description of an item (cucumber, ice-cream)
 * amount of items
 * and its price
 *
 * we have to print everything out in one line
 *
 * EX:
 * 2 cucumbers $1.99 each
 * Total $3.98;
 */
public class CashierProgram {

public static void main(String[] args){
    Scanner item = new Scanner(System.in);
    System.out.println("What is the item?");
    String item1 = item.nextLine();


    Scanner quantity = new Scanner(System.in);
    System.out.println("What is the quantity?");
   int quantity1 = quantity.nextInt();

   Scanner price = new Scanner(System.in);
    System.out.println("What is the price?");
double price1 = price.nextDouble();

double total= price1 * quantity1;

System.out.println(quantity1+ " " + item1 +" "+ "$" + price1 + "each" );
    System.out.println("Total: $" + total );
    }
}
