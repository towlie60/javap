package arrays;

import java.util.Arrays;

public class BinarySearchCharsAndStrings {

    public static void main(String[] args) {
        //W -> 3
        //D -> 1
        // L -> 0

        char[] ChicagoBullsStats = {'W', 'W', 'L', 'D', 'D', 'W', 'W', 'W', 'W'};
        Arrays.sort(ChicagoBullsStats);
        System.out.println(Arrays.binarySearch(ChicagoBullsStats, 'L')); //binary returns int


        String[] companies = {"Amazon", "Apple", "Facebook", "Google", "Tesla Motors", "Toyota"};

        Arrays.sort(companies);
        int index = Arrays.binarySearch(companies, "Tesla Motors");

        String scr = companies[index].substring(0, companies[index].indexOf(' '));

        companies[index] = scr;

        System.out.println(Arrays.toString(companies));
    }
}