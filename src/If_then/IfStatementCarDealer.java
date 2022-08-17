package If_then;

import java.util.Scanner;

public class IfStatementCarDealer {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        //we have a car dealer
        // you to prompt the user for what they are looking for

        //When user enters our website
        //they should be asked what they are looking for
        // in the first menu they should see
        // 1. suv
        // 2.sports car
        // 3.sedan

        //they can choose by typing SUV, sports car or sedan.
        // or by inputting the number. 1 for suv, 2 sports car

        //second display
        //if they input suv
        // 1.suburban
        // 2.escalate
        // 3.H2
        // if user inputs something not listed then say that you don't have such model of a car.
        System.out.println("Enter your car type:");
       String carType = sc.nextLine();



        if (carType.equals("SUV") || carType.equals("1")) {
            System.out.println("Choose one of the following option:");
            System.out.println("1 Suburban");
            System.out.println("2 Escalate");
            System.out.println("3 H2");
          String carModel = sc.nextLine();
            if(carModel.equals (" 1 Suburban") || carModel.equals("1")) {
                System.out.println("Suburban 2019 for $20000");

            }else if (carModel.equals("Escalate") || carModel.equals("2")) {
                System.out.println("Escalate 2020 for $50000");

            } else if (carModel.equals("3 H2 ") || carModel.equals("3")) {
                System.out.println("3 H2 2020 for $40000");
            } else {
                System.out.println("We do not have this model.");


//            }else if (carTip.equals("Sports car") || carTip.equals("2")) {
//                System.out.println("Choose following option");
//                System.out.println("1.Buggati");
//                System.out.println("2.Ferrari");
//                String carModel = scr.next();
//                if(carModel.equals (" 1 Buggati") || carModel.equals("1")) {
//                    System.out.println("Buggatti 2018 for $200000");
//                }else if if(carModel.equals (" 2. Ferrari") || carModel.equals("2")) {
//                    System.out.println("Ferari  2019 for $250000");
//
//

          //  } else if (carModel.equals("3 H2 ") || carModel.equals("3")) {
            //    System.out.println("3 H2 2020 for $40000");

            /** - suv
             // -suburban
             // -escalte
             // -h2

             //sports car
             // - buggati
             // -ferrari

             //sedan
             // -camry
             //-civic
             //-bmw
             **/


        }
    }}}