//package oopclasses;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//public class SolutionWithClasses {
//
// public static void main(String[] args) {
//  //we are creating an instance of the data type./
//  //like int a = 3;
//  Candidate johnDoe = new Candidate();
//  //
//  johnDoe.name= "John Doe";
//  johnDoe.hasEAD = true;
//  johnDoe.yearsOfExp= 5;
//  johnDoe.gender='M';
//
//  Candidate c2 = new Candidate();
//  c2.name="Elon Musk";
//  c2.yearsOfExp= 10;
//  c2.hasEAD= false;
////  c2.gender='M';
//  //providing characteristics is optional
//  //if an instance variable(characteristics are not initialized)
//  //instance variable have default values
//
//  Candidate c3 = new Candidate();
//  c3.name="Melinda Gates";
//  c3.hasEAD= true;
//  c3.yearsOfExp= 3;
//
//  //in order to access instance variables of an object
//  //you need to type .after a variable name;
//  System.out.println(johnDoe.name);
//  System.out.println(johnDoe.hasEAD);
//  System.out.println(johnDoe.yearsOfExp);
//
//
//  System.out.println(c3.name);
//
//  List<Candidate> allCandidates = new ArrayList<>();
//  allCandidates.add(johnDoe);
// }
// //class is the data type
// //object is an instance(version) of the data type.
//
//}
////one java files can have multiple classes
////there can only be one public class.
////Entity means one object.
////we have created our own data type.
//
//// class Candidate {
//  //public boolean hasEad;
//  //Every Entity must have some charcteristics
// //aka state.
//
//
// //instance variables define an object characteristics
//  //providing
// String name;
// int yearsOfExp;
// boolean hasEAD;
// char gender;
// Set<String>skills;
// String phoneNumber;
// String email;
//
//
//}