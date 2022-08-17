package codingpractice;

import java.util.Scanner;

public class SeparateZerosinArray1 {
        public static void main(String[] args)
        {
            //Scanner class object to take input
            Scanner scan = new Scanner(System.in);
            //take input a number that how many numbers to take input
            System.out.print("Please enter the value of n: ");
            int n=scan.nextInt();

            //create an array of fixed size n
            int[] arr = new int[n];

            //take input n elements in array
            for(int i=0;i<n;i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                arr[i] = scan.nextInt();
            }

            //Call function to shift all zeroes at the end of array
            shiftZeroes(arr);

            //Print the array
            System.out.println("\nElements of array: ");
            for (int i:arr) {
                System.out.print(i + " ");
            }

        }

        //Function to shift all zeroes at the end of array
        public static void shiftZeroes(int[] arr)
        {
            //for loop to check each element of array
            for(int i=0;i<arr.length;i++)
            {
                //if it is zero
                if(arr[i]==0)
                {
                    //then shift all elements left
                    for(int j=i;j<arr.length-1;j++)
                    {
                        arr[j] = arr[j+1];
                    }
                    //and assign last element to 0
                    arr[arr.length-1] = 0;
                }
            }
        }
    }

