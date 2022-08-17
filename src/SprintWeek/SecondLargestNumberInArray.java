package SprintWeek;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondLargestNumberInArray {


        public static void main(String[] args)
        {

            try
            {

                Scanner scan = new Scanner(System.in);

                System.out.print("How many numbers do you want to input? ");
                int n=scan.nextInt();


                int[] arr = new int[n];


                for(int i=0;i<n;i++)
                {
                    System.out.print("Enter number " +(i+1)+": ");
                    arr[i] = scan.nextInt();
                }


                Arrays.sort(arr);


                int i = n-2;


                while(i >= 0 && arr[i]==arr[i+1])
                    i--;


                System.out.println("Second largest number is: " + arr[i]);
            }//Catch exception if non-integer value entered like alphabets
            catch(InputMismatchException e)
            {
                System.out.println("Invalid input");
            }
        }
    }

