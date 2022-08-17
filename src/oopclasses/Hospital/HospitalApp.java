package oopclasses.Hospital;

public class HospitalApp {

    public static void main(String[] args) {

        Patient p1 = new Patient("01/20/1991", "John Doe", 'M', "777-777-7777");
        Patient p2 = new Patient("03/10/1970", "Alex Marino", 'M', "888-888-8888");
        Patient p3 = new Patient("02/22/1922", "Alexa Amazon", 'F', "212-212-2112");
        Patient p4 = new Patient("09/20/1994", "Siri Apple", 'F', "345-3333-5555", "Canadian");
        Patient p5 = new Patient("01/20/1991", "Tesla Musk", 'M', "777-777-7777", "African");
        //can please do something so i can see the whole information about the patient
        Patient p6 = new Patient("01/20/1991", "Tesla Musk", 'M', "777-777-7777");
        Patient p7 = new Patient("SpaceX Musk", 'S', "777-777-7777");

        System.out.println(p1.getBalance());
        p1.orderMedicine("Advil");
        System.out.println(p1.getBalance());
        //without creating any object we are able to access static members
        Patient.advilPrice = 20;
        p1.orderMedicine("Advil");
        System.out.println(p1.getBalance());
        p5.orderMedicine("Advil");
        System.out.println(p5.getBalance());
//        System.out.println("=========");
//
//        p1.printAllInfo();
//      //  p1.printAllInfo();
//        p1.orderMedicine("Advil");
//        p1.printAllInfo();
//        p1.orderMedicine("Ibuprofen");
//        p1.printAllInfo();
//        p1.payBalance(30.00); //120
//        p1.printAllInfo();
//      //  p7.printAllInfo();
//        p7.setGender('(');
//        p7.printAllInfo();
//        System.out.println(p7.getGender());
//        System.out.println(p6.getDob());
//        p6.setDob("01/20/1991");
//        System.out.println(p6.getDob());
//        p6.setDob("01/20/1999");
//        System.out.println(p6.getDob());
//        p6.setPhoneNumber("1332-3331-555");
//        p6.printAllInfo();
//        p6.setGender('6');
//        p6.printAllInfo();
    }

}

       // p7.printAllInfo();
        //p7.setGender('M');
      //  p7.printAllInfo();




//        p6.orderMedicine("Advil");
//        p6.printAllInfo();
//        p6.orderMedicine("Ibuprofen");
//        p6.printAllInfo();

      //  p2.printAllInfo();
       // p2.changeNumber("312-432-3232");
     //   Patient p10 = new Patient("03/10/1970", "Alex Marino",'M',"333-123-4556" );
        //p2.printAllInfo();


     //   System.out.println(patient6.nationality);
//        System.out.println(p6.nationality);
//        System.out.println(p1.nationality);
//        System.out.println(p2.nationality);
//        System.out.println(p3.nationality);
//        System.out.println(p4.nationality);
//        System.out.println(p5.nationality);



//        System.out.println(p7.dob);
//        System.out.println(p7.nationality);

    //    p7.nationality = "Polish";
      //  System.out.println(p7.nationality);

    //    System.out.println(patient7.dob);

//    Patient patient1 = new Patient("01.01.2000", ":Janet Jackson", 'f',
//            "212235566", "American");
//
//
//    System.out.println(patient1.dob);
//
//    Patient patient2 = new Patient("02.02.2001","Esmir Hayatt", 'm',
//            "312-222-5454", "turkish");
//
//    System.out.println(patient2.fullName+" "+patient2.nationality);




