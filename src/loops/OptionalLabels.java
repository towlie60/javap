package loops;

//import java.util.Locale;

public class OptionalLabels {

    public static void main(String[] args) {
        //Optional Labels
        int num = 0;
        while (num < 10) {

            if (num == 3) {
                //  continue; // continue --> ends the current iteration and go to the next one
                // break; //stops the while loop when num==3
            }
            for (int i = 0; i < 15; i++) { //supposed to run 15 times for each num
                if (num == 3) {
                    //    continue; //jump the for loop onto next iteration.
                    break;
                }
                System.out.println("num " + num + " i: " + i + " ");

            }

            System.out.println();
            System.out.println("-----------------------------");
            num++;
        }


        //Palindrome --> if a word is read the same both ways
        //is it case sensitive?
        // do you want to ignore spaces?
        //kayak --> yes
        // abba --> palindrome
        //Level --> palindrome

        //
        //print out all number between 0 and 10 skip 7
        //optional labels are just any name we can put before a loop statement.
        abc:
        for (int i = 0; i < 10; i++) {
            if (i == 7) {
                continue abc; //which means continue the loop which has this label.
            }
        }

       // for (int i = 0; i);

    }


    public static boolean isPalindrome(String str) {

        str = str.toLowerCase();
        //str= "hello"
        //str.charAt(str.length()-1)
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - (i + 1))) {
                return false; //when you have return in the body of the method
                //it will at as a break statement to the whole method and return the result
            }
        }
        return true;
    }


    //Optional Labels

    //check if the string has at least 2 oo
    //Door
    //Doordash
    //loot
    //root
    //good
    //blood
    public static boolean check(String str) {

        return str.contains("oo");
    }
    //Write a function which takes two Strings.
    //str1 and str2.
    //check if you are able to build the str1 using characters from str2?

    //str1= hello
    //str2= eohll => true

    //str1 =hello
    //str2 = eohllahee => true

    //str1 = hello
    //str2 = oleha -> false

    // helllo vs hellau
    // java vs vaaj
    // java vs avja

    public static boolean ransomChars(String str1, String str2) {

        if (str1.length() > str2.length()) {
        return false;

        }
        outer:
        for (int i = 0; i < str1.length(); i++) {
            boolean found = false;
            inner:
            for (int y = 0; y < str2.length(); y++) {
                if (str1.charAt(i) == str2.charAt(y)) {
                    found = true;
                   str2 = str2.replaceFirst(str2.charAt(y) + "", "");
                   continue outer;
                }
            }
            if(!found) {
                return false;
            }
        }
        return true;
}
        }