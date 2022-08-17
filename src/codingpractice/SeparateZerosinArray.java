package codingpractice;

import java.util.Scanner;
public class SeparateZerosinArray {
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
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = scan.nextInt();
        }

        //Call function to shift all zeroes at the end of array
        shiftZeroes(arr);

        //Print the array
        System.out.println("Elements of array: ");
        for (int i:arr) {
            System.out.print(i + " ");
        }

    }

    //Function to shift all zeroes at the end of array
    public static void shiftZeroes(int[] arr)
    {
        //Set i and j variable to starting position of array
        int i=0,j=0;

        //Loop until i reached to end of array
        while(i<arr.length)
        {
            //if element at i position is not equal to toMove
            if(arr[i]!=0)
            {
                //Then swap the both elements of i and j position
                int tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
                //increment in j
                j++;
            }
            //increment in i
            i++;
        }

    }
}


