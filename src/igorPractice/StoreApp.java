package igorPractice;

import oopclasses.inheritence.abstractclass.Shop;

import java.text.DecimalFormat;
import java.util.*;

public class StoreApp {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        List<ShoppingCart> shoppingCart = new ArrayList<> ();
        System.out.println("Welcome to the store!");

        while (true) {
            System.out.println("What option do you choose?");
            System.out.println("1: Add item to the shopping cart.");
            System.out.println("2. Remove item from the shopping cart.");
            System.out.println("3. Get total price for the items.");
            System.out.println("4. Display the items.");
            System.out.println("0, Exit store.");
            int userChoice = sc.nextInt();

            switch (userChoice) {
                case 1:
                    addToCart (shoppingCart);
                    break;
                case 2:
                    removeFromCart (shoppingCart);
                    break;
                case 3:
                    totalPrice (shoppingCart);
                    break;
                case 4:
                    displayItems (shoppingCart);
                    break;
                default:
                    System.exit (0);
            }
        }
    }


    public static void addToCart(List<ShoppingCart> shoppingCart) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter item you would like to add: ");
        String itemName = sc.nextLine ();
        sc.nextLine();
        System.out.println("What is the price per item?");
        double itemPrice = sc.nextDouble();

        ShoppingCart myShoppingCart = new ShoppingCart (itemName, itemPrice);
        shoppingCart.add (myShoppingCart);
        System.out.println(itemName + " has been added to your cart .\n");

        }

        public static void removeFromCart(List<ShoppingCart> shoppingCart) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter item name you would like to remove: ");
        String itemName = sc.nextLine();
        sc.nextLine();
        ShoppingCart myShoppingCart = new ShoppingCart (itemName);

        for (ShoppingCart item : shoppingCart) {
            if (item.getItemName ().equalsIgnoreCase (itemName)) {
                shoppingCart.remove (item);
                System.out.println(itemName + " has been removed from your cart.\n");
                break;
            }else {
                System.out.println("You don't have " + itemName + " in your cart ");
            }
        }
    }

    public static void totalPrice(List<ShoppingCart> shoppingCart) {
        DecimalFormat df = new DecimalFormat("0.00");
        double totalPrice = 0;
        for (int i = 0; i < shoppingCart.size (); i++) {
            totalPrice += shoppingCart.get (i).getItemPrice ();
        }
        System.out.println("The total price is: $" + df.format (totalPrice) + "\n");
    }

    public static void displayItems(List<ShoppingCart> shoppingCart) {
        DecimalFormat df = new DecimalFormat("0.00");
        for( ShoppingCart items: shoppingCart) {
            System.out.println(items.getItemName() + " will cost: $" + df.format (items.getItemPrice ()));
        }
        System.out.println("\n");
    }
}
