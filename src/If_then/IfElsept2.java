package If_then;

import java.util.Scanner;

public class IfElsept2 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);


        System.out.println("Choose you tip of car");
        String carTip = scr.nextLine();
      if (carTip.equals("Sports car") || carTip.equals("1")) {
            System.out.println("Choose following option");
            System.out.println("1.Buggati");
            System.out.println("2.Ferrari");
            String carModel = scr.next();
            if (carModel.equals(" 1.Buggati") || carModel.equals("1")) {
                System.out.println("Buggatti 2018 for $200000");
            } else if (carModel.equals(" 2.Ferrari") || carModel.equals("2")) {
                System.out.println("Ferari  2019 for $250000");
            }else {
                System.out.println("We do not have this model.");


                System.out.println("We dont have this tip of cars");

    }}}}