package codingpractice;

import java.util.HashMap;


    //Class WordAppend
    public class WordAppend {

        //Function to return wordAppend
        //Parameter: It will take an array of string
        //Return: It will return result as aString
        public static String wordAppend(String[] words)
        {
            //HashMap to keep count of each word in array
            HashMap<String, Integer> frequency = new HashMap<String, Integer>();
            //result variable to store final result
            String result="";

            //foreach loop tp iterate each word in array
            for (String word: words) {
                //if word is not found in hashmap then set 0 against the word
                frequency.putIfAbsent(word,0);
                //increment by 1 in word's count
                frequency.put(word,frequency.get(word)+1);

                //if word appears in 2nd,4th,6th.... time then add this word in result
                if(frequency.get(word)%2==0)
                    result+=word;
            }

            //return result
            return result;
        }

        //Main function
        public static void main(String[] args)
        {
            //Array of words
            //System.out.print("Enter number " + (i + 1) + ": ");
            String[] words =new String[]{"a","b","a","c","a","d","a"}; //"a","b","a","c","a","d","a"};
            //Print array of words
            System.out.println("Words are: ");
            for (String word:words) {
                System.out.println(word);
            }

            //Call the function wordAppend and show result
            System.out.println("\nwordAppend: " + wordAppend(words));
        }
    }
