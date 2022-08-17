package exceptions;

public class TryCatchFinally {

    public static void main(String[] args) {

        /**
         *
         */

        try {
            WriteFile.writeToFile("HelloWorld");
            System.out.println("Try Block");
           // WriteFile.writeToFile("HelloWorld");
        } catch (Exception e) {
            System.out.println("catch block");
        } finally {
            System.out.println("finally block");
        }
    }
}
