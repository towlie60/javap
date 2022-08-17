package loops;

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;

public class WhileLoop2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //Ask user to enter score
        //ask the user if they want to
        //enter another score

        //ex: Please enter test result
        //100
        //Do you want to enter another test result?
        //yes, no


        Scanner sc = new Scanner(System.in);
        //do we need to run it at least once?
        String answer = "yes";

        //variable declared in the loop body are not visible on the
        // condition level.

        int allScores = 0;
        int counter =0;


        //I need to validate if the score is in the range of 0-100
        //if not give an error and stop the program
        while (answer.equalsIgnoreCase("yes")) {

            System.out.println("Please enter test result");
            int score = sc.nextInt();
            if (score > 100 || score < 0) {
                System.err.print("Invalid range");
                System.exit(1);
            }
            allScores += score;
            sc.nextLine();
            System.out.println("Do you want to add another score?");
            answer = sc.nextLine().trim();
            ++counter;

        }
    }
}
