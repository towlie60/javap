package maps;

import java.util.HashMap;
import java.util.Map;

public class CountNumOfCharacterOccurances {
//Create a program which will calculate the number occurances of each character in a String
    //ex: apple -> a:1
    // -> p:2
    // -> l:1
    // -> e:1
public static void main(String[] args) {
    //"xxxxxxxxxxxx"
    String word = "Helllllllo World";
    Map<Character, Integer> occurences = new HashMap<>();


    int counter = 0;
    for(int i =0; i<word.length();i++){ //for loop method
       if(!occurences.containsKey(word.charAt(i))) {
           occurences.put(word.charAt(i),1); //0 to end is : index
       }else{
         int lastoccurenceNum = occurences.get(word.charAt(i));
           occurences.put(word.charAt(i), lastoccurenceNum +1); //add 1

       }
//        if(word.charAt(i)=='') {
//            counter++;
//        }
    }
    System.out.println(counter);
    System.out.println(occurences);
}

}
