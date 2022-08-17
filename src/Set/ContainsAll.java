package Set;

        import java.util.HashSet;
        import java.util.Set;
public class ContainsAll {


    //Given a listOfSpeakers
    //And a list of Registrants
    //make sure all registrants are present in the list of speakers.

    public static void main(String[] args) {
        Set<String> ListOfSpeakers = new HashSet<>();
        ListOfSpeakers.add("Elon");
        ListOfSpeakers.add("Bezos");
        ListOfSpeakers.add("Marry");
        ListOfSpeakers.add("Jane");


        Set<String> listOfRegistrants = new HashSet<>();
        listOfRegistrants.add("Elon");
        listOfRegistrants.add("Jane");


        if(ListOfSpeakers.containsAll(listOfRegistrants)){
           System.out.println("Let them all in");
       }else {
           System.out.println("Someone is trying to break in");
       }
    }
}
