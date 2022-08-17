package oopclasses.inheritence.human;

import com.sun.org.apache.bcel.internal.generic.LoadClass;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class WellnessApp {

    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.now();
        System.out.println("Hi! Welcome to DevX Wellness Program");
        System.out.println("Before we get started, I need to ask a few question");
        System.out.println("What is your gender");
        Scanner sc = new Scanner(System.in);
        char gender = sc.next().charAt(0);
        //based on the gender use the corresponding class.

        Human user = null;
        switch (gender){
            case 'M':
                user = new Man(0,70);
//                man.eat();
//                man.laugh();
//                man.rest();
//                man.run();
                break;
            case 'F':
                user = new Women(0,50);
//                women.eat();
//                women.laugh();
//                women.rest();
//                women.run();
                break;
        }


        user.eat();
        user.laugh();
        user.rest();
        user.run();
        user.sayHello();

        Health.printHealth();

        System.out.println(Duration.between(start, LocalDateTime.now()).getSeconds());
    }
}
