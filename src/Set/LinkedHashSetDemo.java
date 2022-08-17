package Set;

import sun.awt.image.ImageWatched;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();
        names.add("Elon");
        names.add("Bezos");
        names.add("Marry");
        names.add("Jane");

        System.out.println(names);

    }
}
