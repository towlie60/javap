package java_hm;
import java.util.Scanner;

public class EnterPin1 {
        public static void main( String[] args ) {
            Scanner keyboard = new Scanner(System.in);
            String password;
            int pin, entry;

            password = "cbmsiscrap";
            pin = 12345;

            System.out.println("WELCOME TO THE BANK OF JAVA.");
            System.out.println("ENTER YOUR PASSWORD: ");
            keyboard.next();

            while ( ! password.equals("cbmsiscrap") )
            {
                System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
                System.out.println("ENTER YOUR PASSWORD: ");
                entry = keyboard.nextInt();
            }

            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();

            while ( entry != pin )
            {
                System.out.println("\nINCORRECT PIN. TRY AGAIN.");
                System.out.println("ENTER YOUR PIN: ");
                entry = keyboard.nextInt();
            }

            System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
        }
    }
