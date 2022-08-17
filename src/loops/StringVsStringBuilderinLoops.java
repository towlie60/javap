package loops;

public class StringVsStringBuilderinLoops {


    public static void main(String[] args) {

        //Get an input from a user
        // and modify the text with wrapping every word
        //with {}

        //ex: Hello --> {Hello} {World}
        //if you have a task
        //if string includes more than 10 using string builder, if less than use 10
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //  StringBuilder str = new StringBuilder("ABC");

//        String str = "ABC";
//        int i = 3;
//
//        while (i < alphabet.length()) {
//            str += alphabet.charAt(i); //concat creates a new objecg
//            i++;
//        }
//
//        System.out.println(str);

        StringBuilder str = new StringBuilder("ABC");
        int i = 3;

        while (i < alphabet.length()) {
       str.append(alphabet.charAt(i)); //concat creates a new objecg
            i++;
        }

        System.out.println(str.toString());
    }
}