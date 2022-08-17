package java_hm;

import java.util.Scanner;
public class PrintArrayInStars {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of items:");


        int numItems = in.nextInt();
          int[] items= new int[numItems];



        System.out.print("Enter the value of all items (separated by space):");

        for (int i = 0; i < items.length; i++) {

            items [i] = in.nextInt();

        }

        for(int i = 0; i < items.length;i++) {

            System.out.print ( i + ":");

            for (int j = 0; j < items [i]; j++) {

                System.out.print("*");

            }

            System.out.println("("+items[i]+")");

        }

    }

}



