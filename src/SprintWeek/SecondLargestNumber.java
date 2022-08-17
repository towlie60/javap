package SprintWeek;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondLargestNumber {


        public static void main(String[] args)
        {
            System.out.println("how many number do you want to input?");
            try

            {

                Scanner scan = new Scanner(System.in);

                int num=scan.nextInt();
                int firstHighest = num, secondHighest=num;


            //    while(num!=0)
                {

                    if (num > firstHighest)
                    {
                        secondHighest = firstHighest;
                        firstHighest = num;
                    }

                    else if ((num > secondHighest && num != firstHighest))
                    {
                        secondHighest = num;
                    }


                    num = scan.nextInt();
                }
                System.out.println("Please enter any amount of positive and negative integer numbers");

                System.out.println("Second largest number is: " + secondHighest);
            }


            catch(InputMismatchException e)
            {
                System.out.println("Invalid input due to a letter being inserted");
            }
        }
    }

