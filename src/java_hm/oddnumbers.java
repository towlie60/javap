package java_hm;

import java.util.Scanner;


public class oddnumbers {


        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int num = sc.nextInt();
            int sum = 0;

            for (int i=1;i<=num;i++){
                System.out.println(2*i-1);
                sum = sum + (2*i-1);
            }
            System.out.println("The Sum of first 5 odd number is "+sum);
        }
    }

