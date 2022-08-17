package SprintWeek;

import java.util.Scanner;

public class CalcRevnue {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        float price = scan.nextFloat();
        System.out.print("Enter quantity: ");
        int quantity = scan.nextInt();


        float discount=0;

        if(quantity>=100 && quantity<=120)
            discount = 10;

        else if(quantity>120)
            discount = 15;

        float total_amount = price*quantity;

        float disc_amount = total_amount * (discount/100);

        float revenue = total_amount - disc_amount;

        System.out.println("\nThe revenue from sales: " + revenue + "$");
        System.out.println("After discount: " + disc_amount + "$(" + discount+"%)");
    }
}


