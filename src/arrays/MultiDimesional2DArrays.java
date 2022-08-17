//package arrays;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class MultiDimesional2DArrays {
//
//    public static void main(String[] args) {
//
//        //create an array to store all employees of each departments
//        //there are 3 departments
//        //dimensions
//
//
//        //1.count all number of empolyees.
//        //2.find the department with most employees.
//
//        //4.change a given employee.
//
//
//
//        String[][] employees = new String[4][];
//        employees[0] = new String[]{"Elon Musk", "Steve Jobs", "Alex Brin", "Melanie Perkins"};
//        employees[1] = new String[]{"John Doe", "Gran Cardone", "Larry Page", "Jeff Bezos"};
//        employees[2] = new String[]{"Jane Doe", "Kevin hart", "Beckham"};
//        employees[3] = new String[]{"Torontino", "Askar", "Hemant", "Ravindra"};
//
//        System.out.println("Choose one of the following options");
//        System.out.println("0 - Tech Department");
//        System.out.println("1 - Sales Department");
//        System.out.println("2 - Marketing Department");
//        System.out.println("3 - Customer Service");
//
//
//
//
//        //        Scanner sc = new Scanner(System.in);
////        int choice = sc.nextInt();
//        //}
//
////  System.out.println(employees[0][2]);
//
//
//
//        //  for (int i = 0; i < employees[choice].length; i++) {
//        //           System.out.println(employees[choice][i]);
//        //}
//
//
//   String name = "Larry Page";
//   delete(employees,name);
//        System.out.println(Arrays.deepToString(employees));
//
//
//
//
//   //3. delete a given employee -> a given employee should become an empty string
//
//    public static void delete (String[][] employees, String name) {
//
//        for (int i = 0; i < employees.length; i++) {
//            for (int j = 0; j < employees[i].length; j++) {
//                if(employees[i][j].equals(name)) {
//                    employees[i][j] = "";
//                }
//            }
//        }
//    }
//
//}
//
