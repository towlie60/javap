package maps;

import java.util.*;

public class MapPractice {

    public static void main(String[] args) {

    //we have list of Candidates(job)
    //each candidate has an id(int)
    //I want to see candidates' list of Companies they worked for.
    //We want look up the candidates based on their id.

        //output:
        //Enter candidate ID
        //2
        //[Cme, Apple, Amazon]

        Map<Integer, List<String>> candidates = new HashMap<>();

        List<String> employeeJobs = new ArrayList<>();
        List<String> employee2Jobs = new ArrayList<>();

        employeeJobs.add("CME");
        employeeJobs.add("Apple");
        employeeJobs.add("Amazon");

        employee2Jobs.add("Tesla");
        employee2Jobs.add("Google");
        employee2Jobs.add("Facebook");


        candidates.put(2,employeeJobs);

        candidates.put(3,employee2Jobs);

        System.out.println("Enter candidate Id");

        Scanner sc = new Scanner(System.in);
          int id = sc.nextInt();

        System.out.println("Choose the nth company");
        int nth = sc.nextInt();
      //  System.out.println(candidates.get(id).get(nth));


        List<String>companies= candidates.get(id);

        String co = companies.get(nth);
        System.out.println(co);





    }
}
