package DevXSchoolPractice;

import java.util.ArrayList;
import java.util.List;

    public class CreatArrayListsEx {

        public static void main(String[] args) {

            List<String> colours = new ArrayList<>();

            colours.add("blue");
            colours.add("orange");
            colours.add("red");
            colours.add("green");

            String col = colours.get(0);
            System.out.println(col);

            int size = colours.size();

            System.out.printf("The size of the ArrayList is: %d%n", size  );
        }
    }

