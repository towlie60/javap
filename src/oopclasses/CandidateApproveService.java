package oopclasses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CandidateApproveService {
    //We are designing an application which
    //filters candidates for a job.

    //create a method which returns true if the
    //candidate has more than 6 years experience,
    //knows at least Java, Unix, Junit
    //has a EAD
    public static void main(String[] args) {

        Candidate c1 = new Candidate();
        c1.name = "John Doe";
        c1.yearsOfExperience = 10;
        c1.hasEad   =  false;
        c1.skills = new HashSet<>();
        c1.skills.add("Java");
        c1.skills.add("Unix");
        c1.skills.add("Linux");
        c1.phoneNumber = "12241234567";
        c1.email = "johndoe@gmail.com";

        System.out.println(isApproved(c1));

        Candidate c2 = new Candidate();
        c2.name = "Elon Musk";
        c2.yearsOfExperience = 15;
        c2.hasEad = true;
        c2.skills = new HashSet<>();
        c2.skills.add("Java");
        c2.skills.add("Unix");
        c2.skills.add("Cucumber");
        c2.phoneNumber = "12242345678";
        c2.email = "elonmusk@gmail.com";

        System.out.println(isApproved(c2));

        Candidate c3 = new Candidate();
        c3.name = "Steve Jobs";
        c3.yearsOfExperience = 15;
        c3.hasEad = true;
        c3.skills = new HashSet<>();
        c3.skills.add("Java");
        c3.skills.add("Unix");
        c3.skills.add("Junit");
        c3.phoneNumber = "12243456789";
        c3.email = "stevejobs@gmail.com";

        System.out.println(isApproved(c3));

        List<Candidate> allCandidates = new ArrayList<>();
        allCandidates.add(c1);
        allCandidates.add(c2);
        allCandidates.add(c3);

        printApproved(allCandidates);
    }

    public static boolean isApproved(Candidate candidate) {

        Set<String> reqSkills = new HashSet<>();
        reqSkills.add("Java");
        reqSkills.add("Unix");
        reqSkills.add("Junit");


        return candidate.yearsOfExperience > 6 && candidate.hasEad && candidate.skills.containsAll(reqSkills);

    }
    //Write a method which takes list of candidates and prints out:
    //name, phone number and email of approved candidate
    public static void printApproved(List<Candidate>allCandidates){

        for(Candidate candidate : allCandidates){

            if(isApproved(candidate)) {
                System.out.println("");
                System.out.println(candidate.name);
                System.out.println(candidate.email);
                System.out.println(candidate.phoneNumber);
            }
        }
    }
}