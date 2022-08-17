package loops;

public class Reverse {

    public static void main(String[] args) {
        System.out.println(reverse("Hello World"));

    }

    //write a method that takes a String and returns
    // a reversed String

    //ex: public static String reverse(String str) {
    //}
    //ex:reverse("Hello") --> olleH
    //without using stringBuilder reverse method
    public static String reverse (String str) {
       String result = "";
        //counters can also be viewed as starting point of
        //the loop.
        int index = str.length()-1; //5

        //      0
        while (index > 0) {
            result += str.charAt(index); // this is an opeartion
            //condition update
            index--;
        }
        return result;
    }
}
