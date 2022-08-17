//package oopclasses;
//
//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.Set;
//
//public class Problem1ex {
//
//    public static void main(String[] args) {
//
//         //1
//        //We are designing an application which
//        //filters candidates for a job
//
//        //create a method which returns true if the
//        //candidate has more than 6 years experience,
//        //knows at least java, unix, Junit
//        //has a EAD
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter your years of programming experience:");
//        double yearsOfExp = sc.nextDouble();
//
//        System.out.println("Enter your skills:");
//        Set<String> skills = new HashSet<>();
//        skills.add(sc.next());
//        skills.add(sc.next());
//        skills.add(sc.next());
//        skills.add(sc.next());
//        skills.add(sc.next());
//        skills.add(sc.next());
//
//        System.out.println("Enter - true if you have EAD, false - otherwise:");
//        boolean hasEAD = sc.hasNext();
//
//    //    public static boolean acceptorNot  (double yearsofExp, Set<String> skills, boolean hasEAD) {
//
//        System.out.println(acceptOrNot(yearsOfExp, skills, hasEAD));
//
//    }
//
//
//    public static boolean acceptOrNot  (double yearsofExp, Set<String> skills, boolean hasEAD) {
//
//
//        Set<String> reqSkills = new HashSet<>();
//        reqSkills.add("Java");
//        reqSkills.add("Unix");
//        reqSkills.add("Junit");
//
//        if (yearsofExp > 6 && hasEAD && skills.containsAll(reqSkills)) {
//            return true;
//        }
//        return false;
//    }
