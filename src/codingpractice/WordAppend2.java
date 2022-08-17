package codingpractice;

import java.util.HashMap;
import java.util.Scanner;

public class WordAppend2 {


        public static String wordAppend(String[] words)
        {

            HashMap<String, Integer> frequency = new HashMap<String, Integer>();

            String result="";


            for (String word: words) {

                frequency.putIfAbsent(word,0);

                frequency.put(word,frequency.get(word)+1);


                if(frequency.get(word)%2==0)
                    result+=word;
            }

            return result;
        }


        public static void main(String[] args)
        {

            Scanner scan = new Scanner(System.in);


            System.out.print("How many letters do you want to enter: ");
            int n=scan.nextInt();
            scan.nextLine();


            String[] words =new String[n];

            for(int i=0;i<n;i++) {
                System.out.print("Enter string " + (i+1)+": ");
                words[i]= scan.nextLine();
            }


            System.out.println("\nwordAppend: " + wordAppend(words));
        }
    }




