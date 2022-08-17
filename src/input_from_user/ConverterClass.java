package input_from_user;

import java.util.Scanner;

public class ConverterClass {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
     System.out.println("What is the length");
        int length= sc.nextInt();
        System.out.println("What is the width");
        int width= sc.nextInt();
        int perimeter= 2 * (length + width);
        System.out.println(perimeter);

    }

}
